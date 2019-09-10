package com.indtel.mcf.core.fragments.sse;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.R;
import com.indtel.mcf.BR;
import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.core.fragments.sse.adapter.SseAdapter;
import com.indtel.mcf.databinding.FragmentSseBinding;
import com.indtel.mcf.di.module.ViewModelProviderFactory;

import java.io.Serializable;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-09-2019
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
public class SseFragment extends BaseFragment<FragmentSseBinding, SseViewModel> implements
        SseNavigator, SseAdapter.AdapterListener{
    public static final String TAG = SseFragment.class.getSimpleName();
    private static final String KEY_OPEN_TYPE = "KEY_OPEN_TYPE";
    public static final String KEY_APPLICATION_ID = "KEY_APPLICATION_ID";

    private static int OPEN_INTERFACE = 0;

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    SseAdapter adapter;
    private FragmentSseBinding binding;
    private SseViewModel viewModel;
    private FragmentListener callBack;
    private String applicationId ="";

    public static SseFragment newInstance(int openType, String applicationId) {
        Bundle args = new Bundle();
        SseFragment fragment = new SseFragment();
        args.putInt(KEY_OPEN_TYPE, openType);
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
    public void getFragmentBinding(FragmentSseBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_sse;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public SseViewModel getViewModel() {
        OPEN_INTERFACE = getArguments() != null? getArguments().getInt(KEY_OPEN_TYPE,
                FragmentHandlerActivity.DEFAULT_INTERFACE) : FragmentHandlerActivity.DEFAULT_INTERFACE;
        applicationId = getArguments() != null? getArguments().getString(KEY_APPLICATION_ID) : "";
        return viewModel = ViewModelProviders.of(this,factory).get(SseViewModel.class);
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
        viewModel.callApi(OPEN_INTERFACE, applicationId);
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
    public void onCardClick(int openInterfaceType, String applicationId) {
        callBack.onSuccessResponse(TAG, String.valueOf(openInterfaceType), applicationId);
    }
}
