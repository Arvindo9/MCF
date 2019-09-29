package com.indtel.mcf.core.fragments.casesAfterAssessment;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.core.fragments.casesAfterAssessment.adapter.CasesAfterAssessmentAdapter;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.FragmentCasesAfterAssessmentBinding;

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
public class CasesAfterAssessmentFragment extends BaseFragment<FragmentCasesAfterAssessmentBinding, CasesAfterAssessmentViewModel>
        implements CasesAfterAssessmentNavigator, CasesAfterAssessmentAdapter.AdapterListener {
    public static final String TAG = CasesAfterAssessmentFragment.class.getSimpleName();
    private static final String KEY_OPEN_INTERFACE_TYPE = "KEY_OPEN_INTERFACE_TYPE";

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    CasesAfterAssessmentAdapter adapter;
    private FragmentCasesAfterAssessmentBinding binding;
    private CasesAfterAssessmentViewModel viewModel;
    private FragmentListener callBack;
    private int OPEN_INTERFACE = 0;

    public static CasesAfterAssessmentFragment newInstance(int openInterface) {
        Bundle args = new Bundle();
        CasesAfterAssessmentFragment fragment = new CasesAfterAssessmentFragment();
        args.putInt(KEY_OPEN_INTERFACE_TYPE, openInterface);
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
    public void getFragmentBinding(FragmentCasesAfterAssessmentBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_cases_after_assessment;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public CasesAfterAssessmentViewModel getViewModel() {
        OPEN_INTERFACE = getArguments() != null? getArguments().getInt(KEY_OPEN_INTERFACE_TYPE,
                FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_FRESH) : FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_FRESH;
        return viewModel = ViewModelProviders.of(this,factory).get(CasesAfterAssessmentViewModel.class);
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
        return R.string.cases_after_assessment;
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
        if(OPEN_INTERFACE == FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_FRESH) {
            viewModel.callApiFresh();
        }else if(OPEN_INTERFACE == FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_REVERTED) {
            viewModel.callApiReverted();
        }
        subscribeToLiveData();
        setRecyclerView();
    }

    private void subscribeToLiveData() {
        viewModel.getModelLiveData().observe(this, model ->
                viewModel.addModelToList(model));
    }

    private void setRecyclerView(){
        adapter.setListener(this, OPEN_INTERFACE);
        binding.listView.setAdapter(adapter);
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
        callBack.onSuccessResponse(TAG, String.valueOf(openInterfaceType), applicationId);
    }
}
