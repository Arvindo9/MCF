package com.indtel.mcf.ui.home.cple;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseActivity;
import com.indtel.mcf.core.dialogs.DialogListener;
import com.indtel.mcf.core.dialogs.caseDefault.CaseDefaultDialog;
import com.indtel.mcf.core.dialogs.vendorWise.VendorWiseDialog;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.databinding.ActivityCpleHomeBinding;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;
import com.indtel.mcf.ui.launcher.splash.SplashActivity;
import com.indtel.mcf.utils.AppConstants;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Author       : Arvindo Mondal
 * Created on   : 01-10-2019
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
public class CpleHomeActivity extends BaseActivity<ActivityCpleHomeBinding, CpleHomeViewModel>
        implements CpleHomeNavigator, HasSupportFragmentInjector, DialogListener {
    public static final String TAG = CpleHomeActivity.class.getSimpleName();

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private CpleHomeViewModel viewModel;
    private ActivityCpleHomeBinding binding;


    public static Intent newIntent(Context context) {
        return new Intent(context, CpleHomeActivity.class);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    /**
     * @param binding activity class data binding
     */
    @Override
    public void getActivityBinding(ActivityCpleHomeBinding binding) {
        this.binding = binding;
    }

    /**
     * @param state Initialise any thing here before data binding
     */
    @Override
    protected void initialization(@Nullable Bundle state) {

    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    protected int getLayout() {
        return R.layout.activity_cple_home;
    }

    /**
     * Override for set binding variable
     *
     * @return BR.data;
     */
    @Override
    public int getBindingVariable() {
        return com.indtel.mcf.BR.data;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public CpleHomeViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(CpleHomeViewModel.class);
    }

    /**
     * Do anything on onCreate after binding
     * viewModel.setNavigator(this);
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);
    }

    //----------
    @Override
    public void onLogOutClick() {
        Intent intent = SplashActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

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
    public void onCasesForAssessmentClick() {
        //TODO CaseForAssessmentClick pending same as aO, dycme, cple
    }

    @Override
    public void onCasesForApprovalRejectionClick() {
        CaseDefaultDialog selectionDialog = CaseDefaultDialog.newInstance(TAG, AppConstants.CASES_FOR_SCRUTINY);
        selectionDialog.setCallBack(this);
        selectionDialog.show(getSupportFragmentManager(), CaseDefaultDialog.TAG);
    }

    @Override
    public void onVendorWiseReportClick() {
        VendorWiseDialog selectionDialog = VendorWiseDialog.newInstance();
        selectionDialog.setCallBack(this);
        selectionDialog.show(getSupportFragmentManager(), VendorWiseDialog.TAG);
    }

    @Override
    public void onDashboardClick() {
        startActivity(FragmentHandlerActivity.newIntent(this,
                FragmentHandlerActivity.DASHBOARD, ""));
    }

    //Dialogs-----------------------

    /**
     * Default response method of a dialog
     *
     * @param tag    class name from which the response is getting
     * @param params string array with relative data
     */
    @Override
    public void onSuccessDialogResponse(String tag, String... params) {
        if(tag.equals(VendorWiseDialog.TAG) && params != null && params.length >= 1){
            String selection = params[0];
            String application = params[1];

            if(selection.equals(AppConstants.CASE_IN_PROGRESS)){
                //open CASE_IN_PROGRESS
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.VENDOR_WISE_REPORT_CASE_IN_PROGRESS, application));
            }
            else if(selection.equals(AppConstants.APPROVED)){
                //open CASES_AFTER_ASSESSMENT_FRESH
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.VENDOR_WISE_REPORT_APPROVED, application));
            }
            else if(selection.equals(AppConstants.CLOSED)){
                //open CASES_AFTER_ASSESSMENT_FRESH
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.VENDOR_WISE_REPORT_CLOSED, application));
            }
        }
        else if(tag.equals(CaseDefaultDialog.TAG) && params != null && params.length >= 2){
            String type = params[0];
            String selection = params[1];

            if(selection.equals(AppConstants.FRESH_CASES)){
                //open CASE_IN_PROGRESS
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.CASES_APPROVE_REJECT_FRESH, ""));
            }
            else if(selection.equals(AppConstants.CASES_REVERTED_BY_DY_CME)){
                //open CASES_AFTER_ASSESSMENT_FRESH
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.CASES_REVERT_BY_DYCME, ""));
            }
        }
    }

    //Additional---------------------
}