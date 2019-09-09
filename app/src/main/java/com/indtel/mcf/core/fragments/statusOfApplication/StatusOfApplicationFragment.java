package com.indtel.mcf.core.fragments.statusOfApplication;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.core.fragments.statusOfApplication.adapter.StatusOfApplicationAdapter;
import com.indtel.mcf.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.databinding.FragmentStatusOfApplicationBinding;

import java.util.List;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
 * Email        : arvindo@aiprog.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.aiprog.in
 */
public class StatusOfApplicationFragment extends
        BaseFragment<FragmentStatusOfApplicationBinding, StatusOfApplicationViewModel>
        implements StatusOfApplicationNavigator, StatusOfApplicationAdapter.AdapterListener {
    public static final String TAG = StatusOfApplicationFragment.class.getSimpleName();

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    StatusOfApplicationAdapter adapter;
    private FragmentStatusOfApplicationBinding binding;
    private StatusOfApplicationViewModel viewModel;
    private FragmentListener callBack;

    public static StatusOfApplicationFragment newInstance() {
        Bundle args = new Bundle();
        StatusOfApplicationFragment fragment = new StatusOfApplicationFragment();
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
    public void getFragmentBinding(FragmentStatusOfApplicationBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_status_of_application;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public StatusOfApplicationViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(StatusOfApplicationViewModel.class);
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
        return R.string.status_of_application;
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
        subscribeToLiveData();
        setRecyclerView();
//        setFilter();
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
    public void updateListView(List<StatusOfApplicationResponse> model) {
        adapter.addItems(model);
    }
/*

    private void setFilter(){
        ActivityFragmentHandlerBinding activityBinding = ((FragmentHandlerActivity)
                getBaseActivity()).getActivityBinding();
        activityBinding.toolbarLayout.searchBar.setVisibility(View.VISIBLE);
        activityBinding.toolbarLayout.searchBtn.setOnClickListener(view -> {

        });

        binding.search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    if (binding.clearBtn.getVisibility() == View.GONE) {
                        binding.clearBtn.setVisibility(View.VISIBLE);
                    }
                } else {
                    if (binding.clearBtn.getVisibility() == View.VISIBLE) {
                        binding.clearBtn.setVisibility(View.GONE);
                    }
                }
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
*/

    //Navigator--------------------------

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

    @Override
    public void onViewItemDetailsClick(int openInterfaceType, String applicationId) {
        callBack.onSuccessResponse(TAG, String.valueOf(openInterfaceType), applicationId);
    }
}
