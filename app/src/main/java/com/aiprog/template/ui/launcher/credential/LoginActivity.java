package com.aiprog.template.ui.launcher.credential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.aiprog.template.R;
import com.aiprog.template.base.BaseActivity;
import com.aiprog.template.databinding.ActivityLoginBinding;
import com.aiprog.template.databinding.SplashActivityBinding;
import com.aiprog.template.di.module.ViewModelProviderFactory;
import com.aiprog.template.ui.launcher.splash.SplashActivity;
import com.aiprog.template.ui.launcher.splash.SplashViewModel;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 28-07-2019
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
public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> implements LoginNavigator{

    @Inject
    ViewModelProviderFactory factory;
    private LoginViewModel viewModel;

    private ActivityLoginBinding binding;

    public static Intent newIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    /**
     * @param binding activity class data binding
     */
    @Override
    public void getActivityBinding(ActivityLoginBinding binding) {
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
        return R.layout.activity_login;
    }

    /**
     * Override for set binding variable
     *
     * @return BR.data;
     */
    @Override
    public int getBindingVariable() {
        return 0;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public LoginViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(LoginViewModel.class);
    }

    /**
     * Do anything on onCreate after binding
     * viewModel.setNavigator(this);
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);
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
