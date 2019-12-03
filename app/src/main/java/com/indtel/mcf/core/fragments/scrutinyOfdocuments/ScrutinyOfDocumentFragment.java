package com.indtel.mcf.core.fragments.scrutinyOfdocuments;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.core.fragments.scrutinyOfdocuments.adapter.ScrutinyOfDocumentAdapter;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.databinding.FragmentScrutinyOfDocumentBinding;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;

import java.util.List;

import javax.inject.Inject;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class ScrutinyOfDocumentFragment extends BaseFragment<FragmentScrutinyOfDocumentBinding, ScrutinyOfDocumentViewModel>
        implements ScrutinyOfDocumentNavigator, ScrutinyOfDocumentAdapter.AdapterListener{
    public static final String TAG = ScrutinyOfDocumentFragment.class.getSimpleName();
    private static final String KEY_APPLICATION_ID = "KEY_APPLICATION_ID";
    private static final String KEY_APPLICATION_TITLE = "KEY_APPLICATION_TITLE";

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    ScrutinyOfDocumentAdapter adapter;
    private FragmentScrutinyOfDocumentBinding binding;
    private ScrutinyOfDocumentViewModel viewModel;
    private FragmentListener callBack;
    private String applicationId;
    private String title = "";

    public static ScrutinyOfDocumentFragment newInstance(String applicationId, String title) {
        Bundle args = new Bundle();
        ScrutinyOfDocumentFragment fragment = new ScrutinyOfDocumentFragment();
        args.putString(KEY_APPLICATION_ID, applicationId);
        args.putString(KEY_APPLICATION_TITLE, title);
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
    public void getFragmentBinding(FragmentScrutinyOfDocumentBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_scrutiny_of_document;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public ScrutinyOfDocumentViewModel getViewModel() {
        applicationId = getArguments() != null? getArguments().getString(KEY_APPLICATION_ID, "0") : "0";
        title = getArguments() != null? getArguments().getString(KEY_APPLICATION_TITLE, "0") : "0";
        return viewModel = ViewModelProviders.of(this,factory).get(ScrutinyOfDocumentViewModel.class);
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
//        return R.string.scrutiny_of_documents;
        return 0;
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
     * viewModel.setNavigator(this);
     */
    @Override
    protected void init() {
        viewModel.callApi(applicationId);
        getBaseActivity().setTitle(title);
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
    public void updateListView(List<DashboardScrutinyOfDocument> model) {
        adapter.addItems(model);
    }

    //Navigator------------------------

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

    }

    @Override
    public void onSearchClick() {

    }

    @Override
    public void onRetryClick() {

    }

    @Override
    public void onViewItemDetailsClick(int openInterfaceType, String applicationId) {

    }
}
