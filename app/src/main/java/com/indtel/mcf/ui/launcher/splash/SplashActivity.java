package com.indtel.mcf.ui.launcher.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseActivity;
import com.indtel.mcf.databinding.SplashActivityBinding;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.ui.home.vendor.VendorHomeActivity;
import com.indtel.mcf.ui.launcher.credential.LoginActivity;
import com.indtel.mcf.ui.launcher.welcome.WelcomeActivity;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
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
public class SplashActivity extends BaseActivity<SplashActivityBinding, SplashViewModel> implements SplashNavigator {


    @Inject
    ViewModelProviderFactory factory;
    private SplashViewModel viewModel;

    private SplashActivityBinding binding;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public void getActivityBinding(SplashActivityBinding binding) {
        this.binding = binding;
    }

    @Override
    protected void initialization(@Nullable Bundle state) {

    }

    @Override
    protected int getLayout() {
        return R.layout.splash_activity;
    }

    @Override
    public int getBindingVariable() {
        return BR.data;
    }

    /**
     * Override for set view model
     *
     * @return view model instance
     */
    @Override
    public SplashViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(SplashViewModel.class);
    }


    @Override
    protected void init() {
        viewModel.setNavigator(this);
        viewModel.onStart();
    }

    //Navigator-----------------------

    @Override
    public void openWelcomeScreen() {
        Intent intent = WelcomeActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void openHomeActivity() {
//        Intent intent = HomeActivity.newIntent(this);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);
//        finish();
    }

    @Override
    public void openVendorHomeActivity() {
        Intent intent = VendorHomeActivity.newIntent(this);
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
}
