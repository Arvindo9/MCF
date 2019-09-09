package com.indtel.mcf.core.fragments.viewItem;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.core.fragments.viewItem.adapter.ViewItemAdapter;
import com.indtel.mcf.data.model.apis.viewItem.ViewItem;
import com.indtel.mcf.databinding.FragmentStatusOfApplicationBinding;
import com.indtel.mcf.databinding.FragmentViewItemBinding;
import com.indtel.mcf.di.module.ViewModelProviderFactory;

import java.util.List;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 18-08-2019
 * Email        : arvindo@indtel.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.indtel.in
 */
public class ViewItemFragment extends BaseFragment<FragmentViewItemBinding, ViewItemViewModel> implements
        ViewItemNavigator, ViewItemAdapter.AdapterListener {
    public static final String TAG = ViewItemFragment.class.getSimpleName();
    private static final String KEY_APPLICATION_ID = "KEY_APPLICATION_ID";

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    ViewItemAdapter adapter;
    private FragmentViewItemBinding binding;
    private ViewItemViewModel viewModel;
    private FragmentListener callBack;
    private String applicationId;

    public static ViewItemFragment newInstance(String applicationId) {
        Bundle args = new Bundle();
        ViewItemFragment fragment = new ViewItemFragment();
        args.putString(KEY_APPLICATION_ID, applicationId);
        fragment.setArguments(args);
        return fragment;
    }

    public void setCallBack(FragmentListener callBack){
        this.callBack = callBack;
    }

    /**
     * @param binding is used in current attached fragment
     */
    @Override
    public void getFragmentBinding(FragmentViewItemBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_view_item;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public ViewItemViewModel getViewModel() {
        applicationId = getArguments() != null? getArguments().getString(KEY_APPLICATION_ID, "0") : "0";
        return viewModel = ViewModelProviders.of(this,factory).get(ViewItemViewModel.class);
    }

    /**
     * Override for set bindingF variable
     *
     * @return BR.data;
     */
    @Override
    public int getBindingVariable() {
        return BR.data;
    }

    /**
     * @return R.strings.text
     */
    @Override
    public int setTitle() {
        return R.string.view_items;
    }

    /**
     * @param savedInstanceState save the instance of fragment before closing
     *                           viewModel.setNavigator(this);
     */
    @Override
    protected void onCreateFragment(Bundle savedInstanceState) {
        viewModel.setNavigator(this);
    }

    /**
     * Write rest of the code of fragment in onCreateView after view created
     */
    @Override
    protected void init() {
        viewModel.callApi(applicationId);
        subscribeToLiveData();
        setRecyclerView();
    }

    private void subscribeToLiveData() {
        viewModel.getModelLiveData().observe(this, model ->
                viewModel.addModelToList(model));
    }

    private void setRecyclerView(){
        adapter.setListener(this);
        binding.listView.setAdapter(adapter);
    }

    @Override
    public void updateListView(List<ViewItem> model) {
        adapter.addItems(model);
    }

    //Navigator------------------------------

    @Override
    public void handleError(Throwable throwable) {

    }

    @Override
    public void handleMessage(String message) {

    }

    @Override
    public void handleMessage(int index) {

    }

    @Override
    public void onBackButtonClick() {
        getBaseActivity().onBackPressed();
    }

    @Override
    public void onClearButtonClick() {
//        binding.search.setText("");
    }

    @Override
    public void onSearchClick() {

    }

    @Override
    public void onRetryClick() {

    }
}
