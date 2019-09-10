package com.indtel.mcf.ui.home.sse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseActivity;
import com.indtel.mcf.core.dialogs.DialogListener;
import com.indtel.mcf.ui.launcher.splash.SplashActivity;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.core.dialogs.cases.CasesDialog;
import com.indtel.mcf.core.dialogs.deficiencies.DeficienciesDialog;
import com.indtel.mcf.core.dialogs.vendorWise.VendorWiseDialog;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.databinding.ActivitySseHomeBinding;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.utils.AppConstants;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

import static com.indtel.mcf.utils.AppConstants.DEFICIENCY_AFTER_SCRUTINY;
import static com.indtel.mcf.utils.AppConstants.FRESH_CASES;

/**
 * Author       : Arvindo Mondal
 * Created on   : 22-08-2019
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
public class SseHomeActivity extends BaseActivity<ActivitySseHomeBinding, SseHomeViewModel>
        implements SseHomeNavigator, HasSupportFragmentInjector, DialogListener {
    public static final String TAG = SseHomeActivity.class.getSimpleName();

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private SseHomeViewModel viewModel;

    private ActivitySseHomeBinding binding;

    public static Intent newIntent(Context context) {
        return new Intent(context, SseHomeActivity.class);
    }
    /**
     * Returns an {@link AndroidInjector} of {@link Fragment}s.
     */
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    /**
     * @param binding activity class data binding
     */
    @Override
    public void getActivityBinding(ActivitySseHomeBinding binding) {
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
        return R.layout.activity_sse_home;
    }

    /**
     * Override for set binding variable
     *
     * @return BR.data;
     */
    @Override
    public int getBindingVariable() {
        return BR.data;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public SseHomeViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(SseHomeViewModel.class);
    }

    /**
     * Do anything on onCreate after binding
     * viewModel.setNavigator(this);
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);
        setUp();
    }

    private void setUp() {
        setSupportActionBar(binding.toolbarLayout.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(R.string.home);

            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    //Navigator---------------------

    @Override
    public void handleError(Throwable throwable) {

    }

    @Override
    public void handleMessage(String message) {
        showToast(message);
    }

    @Override
    public void handleMessage(int index) {
        showToast(index);
    }

    @Override
    public void onLogOutClick() {
        Intent intent = SplashActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onVendorRepliedCasesClick() {
        DeficienciesDialog selectionDialog = DeficienciesDialog.newInstance();
        selectionDialog.setCallBack(this);
        selectionDialog.show(getSupportFragmentManager(), DeficienciesDialog.TAG);
    }

    @Override
    public void onCasesAfterAssessmentClick() {
        CasesDialog selectionDialog = CasesDialog.newInstance();
        selectionDialog.setCallBack(this);
        selectionDialog.show(getSupportFragmentManager(), CasesDialog.TAG);
    }

    @Override
    public void onRevertCasesClick() {
        startActivity(FragmentHandlerActivity.newIntent(this,
                FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT, ""));
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
        if(tag.equals(DeficienciesDialog.TAG) && params != null && params.length >= 1){
            String selection = params[0];

            if(selection.equals(DEFICIENCY_AFTER_SCRUTINY)){
                //open DEFICIENCY_AFTER_SCRUTINY
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS, ""));
            }
            else {
                //open DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY, ""));
            }
        }
        else if(tag.equals(CasesDialog.TAG) && params != null && params.length >= 1){
            String selection = params[0];

            if(selection.equals(FRESH_CASES)){
                //open FRESH_CASES
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_FRESH, ""));
            }
            else {
                //open CASES_REVERTED_BY_AME_VDC
                startActivity(FragmentHandlerActivity.newIntent(this,
                        FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_REVERTED, ""));
            }
        }
        else if(tag.equals(VendorWiseDialog.TAG) && params != null && params.length >= 1){
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

    }

    //Additional---------------------
}
