package com.aiprog.template.ui.home.vendor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.aiprog.template.BR;
import com.aiprog.template.R;
import com.aiprog.template.base.BaseActivity;
import com.aiprog.template.core.dialogs.DialogListener;
import com.aiprog.template.core.dialogs.deficiencies.DeficienciesDialog;
import com.aiprog.template.core.fragments.FragmentHandlerActivity;
import com.aiprog.template.databinding.ActivityVendorHomeBinding;
import com.aiprog.template.di.module.ViewModelProviderFactory;
import com.aiprog.template.ui.launcher.splash.SplashActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

import static com.aiprog.template.utils.AppConstants.DEFICIENCY_AFTER_SCRUTINY;

/**
 * Author       : Arvindo Mondal
 * Created on   : 05-08-2019
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
public class VendorHomeActivity extends BaseActivity<ActivityVendorHomeBinding, VendorHomeViewModel> implements
        VendorHomeNavigator, HasSupportFragmentInjector, DialogListener {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private VendorHomeViewModel viewModel;

    private ActivityVendorHomeBinding binding;

    public static Intent newIntent(Context context) {
        return new Intent(context, VendorHomeActivity.class);
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
    public void getActivityBinding(ActivityVendorHomeBinding binding) {
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
        return R.layout.activity_vendor_home;
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
    public VendorHomeViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(VendorHomeViewModel.class);
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

    }

    @Override
    public void handleMessage(int index) {

    }

    @Override
    public void onLogOutClick() {
        Intent intent = SplashActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onStatusOfApplicationClick() {
        startActivity(FragmentHandlerActivity.newIntent(this, FragmentHandlerActivity.STATUS_OF_APPLICATION));
    }

    @Override
    public void onDeficienciesAdvisedClick() {
        DeficienciesDialog selectionDialog = DeficienciesDialog.newInstance();
        selectionDialog.setCallBack(this);
        selectionDialog.show(getSupportFragmentManager(), DeficienciesDialog.TAG);
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
            }
            else {
                //open DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY
            }
        }
    }

    //Additional---------------------
}
