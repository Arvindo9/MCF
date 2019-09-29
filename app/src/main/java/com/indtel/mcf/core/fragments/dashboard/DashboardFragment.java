package com.indtel.mcf.core.fragments.dashboard;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseFragment;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.core.fragments.FragmentListener;
import com.indtel.mcf.core.fragments.dashboard.adapter.DashboardAdapter;
import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.databinding.FragmentDashboardBinding;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;

import java.util.List;

import javax.inject.Inject;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/23/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class DashboardFragment extends BaseFragment<FragmentDashboardBinding, DashboardViewModel>
        implements DashboardNavigator, DashboardAdapter.AdapterListener{
    public static final String TAG = DashboardFragment.class.getSimpleName();

    @Inject
    ViewModelProviderFactory factory;
    @Inject
    DashboardAdapter adapter;
    private FragmentDashboardBinding binding;
    private DashboardViewModel viewModel;
    private FragmentListener callBack;

    public static DashboardFragment newInstance() {
        Bundle args = new Bundle();
        DashboardFragment fragment = new DashboardFragment();
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
    public void getFragmentBinding(FragmentDashboardBinding binding) {
        this.binding = binding;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    public int getLayout() {
        return R.layout.fragment_dashboard;
    }

    /**
     * Override for set view model
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public DashboardViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(DashboardViewModel.class);
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
        return R.string.dashboard;
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
    public void updateListView(List<Dashboard> model) {
        adapter.addItems(model);
    }

    //Navigator----------------------------

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
    public void onRetryClick() {

    }

    @Override
    public void onBackButtonClick() {
        getBaseActivity().onBackPressed();
    }

    @Override
    public void onViewItemDetailsClick(int openInterfaceType, String applicationId) {
        callBack.onSuccessResponse(TAG, String.valueOf(openInterfaceType), applicationId);
    }

    //Additional----------------------------
}
