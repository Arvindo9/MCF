package com.indtel.mcf.core.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseActivity;
import com.indtel.mcf.core.fragments.dashboard.DashboardFragment;
import com.indtel.mcf.core.fragments.scrutinyOfdocuments.ScrutinyOfDocumentFragment;
import com.indtel.mcf.core.fragments.sse.SseFragment;
import com.indtel.mcf.core.fragments.statusOfApplication.StatusOfApplicationFragment;
import com.indtel.mcf.core.fragments.viewItem.ViewItemFragment;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.core.fragments.casesAfterAssessment.CasesAfterAssessmentFragment;
import com.indtel.mcf.databinding.ActivityFragmentHandlerBinding;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

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
public class FragmentHandlerActivity extends BaseActivity<ActivityFragmentHandlerBinding, FragmentHandlerViewModel>
        implements FragmentHandlerNavigator, HasSupportFragmentInjector, FragmentListener {
    public static final String TAG = FragmentHandlerActivity.class.getSimpleName();

    public static final String KEY_OPEN_INTERFACE = "KEY_OPEN_INTERFACE";
    public static final String KEY_APPLICATION_ID = "KEY_APPLICATION_ID";

    public int OPEN_INTERFACE = 0;
    public static final int DEFAULT_INTERFACE = 0;
    public static final int STATUS_OF_APPLICATION = 1;
    public static final int VIEW_ITEM_DETAILS = 2;
    public static final int DASHBOARD = 3;
    public static final int DASHBOARD_SCRUTINY_OF_DOCUMENTS = 4;
    public static final int CASES_AFTER_ASSESSMENT_FRESH = 5;
    public static final int CASES_AFTER_ASSESSMENT_REVERTED = 6;

    public static final int SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS = 7;
    public static final int SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY = 8;

    public static final int SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT  = 9;

    public static final int VENDOR_WISE_REPORT_CASE_IN_PROGRESS  = 10;
    public static final int VENDOR_WISE_REPORT_APPROVED  = 11;
    public static final int VENDOR_WISE_REPORT_CLOSED  = 12;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private ActivityFragmentHandlerBinding binding;
    private FragmentHandlerViewModel viewModel;
    private FragmentManager manager;
    private String applicationId = "";

    public static Intent newIntent(Context context, int openInterface, String application) {
        Intent intent = new Intent(context, FragmentHandlerActivity.class);
        intent.putExtra(KEY_OPEN_INTERFACE, openInterface);
        intent.putExtra(KEY_APPLICATION_ID, application);
        return intent;
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
    public void getActivityBinding(ActivityFragmentHandlerBinding binding) {
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
        return R.layout.activity_fragment_handler;
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
    public FragmentHandlerViewModel getViewModel() {
        OPEN_INTERFACE = getIntent().getIntExtra(KEY_OPEN_INTERFACE, DEFAULT_INTERFACE);
        applicationId = getIntent().getStringExtra(KEY_APPLICATION_ID);
        return viewModel = ViewModelProviders.of(this,factory).get(FragmentHandlerViewModel.class);
    }

    public ActivityFragmentHandlerBinding getActivityBinding(){
        return binding;
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
//            getSupportActionBar().setTitle(R.string.title_gallery);
        }

        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        switch (OPEN_INTERFACE){
            case STATUS_OF_APPLICATION:
                StatusOfApplicationFragment fragment = StatusOfApplicationFragment.newInstance("");
                fragment.setCallBack(this);
                transaction.replace(R.id.fragment, fragment, StatusOfApplicationFragment.TAG);
                transaction.addToBackStack(StatusOfApplicationFragment.TAG);
                transaction.commit();
                break;

            case VIEW_ITEM_DETAILS:
                break;


            case DASHBOARD:
                DashboardFragment dashboardFragment = DashboardFragment.newInstance();
                dashboardFragment.setCallBack(this);
                transaction.replace(R.id.fragment, dashboardFragment, DashboardFragment.TAG);
                transaction.addToBackStack(DashboardFragment.TAG);
                transaction.commit();
                break;

            case CASES_AFTER_ASSESSMENT_FRESH:
            case CASES_AFTER_ASSESSMENT_REVERTED:
                CasesAfterAssessmentFragment casesAfterAssessmentFragment =
                        CasesAfterAssessmentFragment.newInstance(OPEN_INTERFACE);
                casesAfterAssessmentFragment.setCallBack(this);
                transaction.replace(R.id.fragment, casesAfterAssessmentFragment, CasesAfterAssessmentFragment.TAG);
                transaction.addToBackStack(CasesAfterAssessmentFragment.TAG);
                transaction.commit();
                break;

            case SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
            case SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                SseFragment sseFragment =
                        SseFragment.newInstance(OPEN_INTERFACE, "");
                sseFragment.setCallBack(this);
                transaction.replace(R.id.fragment, sseFragment, SseFragment.TAG);
                transaction.addToBackStack(SseFragment.TAG);
                transaction.commit();
                break;

            case SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                sseFragment = SseFragment.newInstance(OPEN_INTERFACE, "");
                sseFragment.setCallBack(this);
                transaction.replace(R.id.fragment, sseFragment, SseFragment.TAG);
                transaction.addToBackStack(SseFragment.TAG);
                transaction.commit();
                break;

            case VENDOR_WISE_REPORT_CASE_IN_PROGRESS:
            case VENDOR_WISE_REPORT_APPROVED:
            case VENDOR_WISE_REPORT_CLOSED:
/*
                sseFragment = SseFragment.newInstance(OPEN_INTERFACE, applicationId);
                sseFragment.setCallBack(this);
                transaction.replace(R.id.fragment, sseFragment, SseFragment.TAG);
                transaction.addToBackStack(SseFragment.TAG);
                transaction.commit();
*/

                fragment = StatusOfApplicationFragment.newInstance(applicationId);
                fragment.setCallBack(this);
                transaction.replace(R.id.fragment, fragment, StatusOfApplicationFragment.TAG);
                transaction.addToBackStack(StatusOfApplicationFragment.TAG);
                transaction.commit();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (manager.getBackStackEntryCount() == 1){
            manager.popBackStackImmediate();
        }
        else if(manager.getBackStackEntryCount() > 1){
            manager.popBackStackImmediate();
            return;
        }
//        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            if (manager.getBackStackEntryCount() == 1){
                manager.popBackStackImmediate();
            }
            else if(manager.getBackStackEntryCount() > 1){
                manager.popBackStackImmediate();
                return super.onOptionsItemSelected(item);
            }
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

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
    public void onSuccessResponse(String tag, String... params) {
        if(tag.equals(StatusOfApplicationFragment.TAG)){
            if(params != null && params.length >= 2){
                String data = params[0];

                if(data.equals(String.valueOf(VIEW_ITEM_DETAILS))) {
                    FragmentTransaction transaction = manager.beginTransaction();
                    ViewItemFragment fragment = ViewItemFragment.newInstance(params[1]);
                    fragment.setCallBack(this);
                    transaction.replace(R.id.fragment, fragment, ViewItemFragment.TAG);
                    transaction.addToBackStack(ViewItemFragment.TAG);
                    transaction.commit();
                }
            }
        }
        else if(tag.equals(CasesAfterAssessmentFragment.TAG)){
            if(params != null && params.length >= 2){
                String data = params[0];

                if(data.equals(String.valueOf(VIEW_ITEM_DETAILS))) {
                    FragmentTransaction transaction = manager.beginTransaction();
                    ViewItemFragment fragment = ViewItemFragment.newInstance(params[1]);
                    fragment.setCallBack(this);
                    transaction.replace(R.id.fragment, fragment, ViewItemFragment.TAG);
                    transaction.addToBackStack(ViewItemFragment.TAG);
                    transaction.commit();
                }
            }
        }
        else if(tag.equals(DashboardFragment.TAG)){
            if(params != null && params.length >= 2){
                String data = params[0];

                if(data.equals(String.valueOf(DASHBOARD_SCRUTINY_OF_DOCUMENTS))) {
                    FragmentTransaction transaction = manager.beginTransaction();
                    ScrutinyOfDocumentFragment fragment = ScrutinyOfDocumentFragment.newInstance(params[1]);
                    fragment.setCallBack(this);
                    transaction.replace(R.id.fragment, fragment, ScrutinyOfDocumentFragment.TAG);
                    transaction.addToBackStack(ScrutinyOfDocumentFragment.TAG);
                    transaction.commit();
                }
            }
        }
    }

    @Override
    public void onFailureResponse(String tag, int errorCode, String message, Throwable throwable) {

    }
}
