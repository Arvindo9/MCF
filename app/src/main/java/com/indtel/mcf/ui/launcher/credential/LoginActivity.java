package com.indtel.mcf.ui.launcher.credential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseActivity;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.ActivityLoginBinding;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.ui.home.sse.SseHomeActivity;
import com.indtel.mcf.ui.home.vendor.VendorHomeActivity;
import com.indtel.mcf.utils.util.Resource;

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
    @Inject
    Resource resource;
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
        return BR.data;
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
        throwable.printStackTrace();
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
    public void onLoginClick() {
        submitForm();
    }

    @Override
    public void openVendorHome() {
        Intent intent = VendorHomeActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void openSSEHome() {
        Intent intent = SseHomeActivity.newIntent(this);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    //Additional-------------

    private void submitForm() {
        if (!resource.validateUserId(this, binding.userId)) {
            return;
        }
        if (!resource.validatePassword(this, binding.password)) {
            return;
        }

        String userId = binding.userId.getText() != null ? binding.userId.getText().toString() : "";
        String password = binding.password.getText() != null ? binding.password.getText().toString() : "";

        viewModel.doLogin(userId, password);
    }
}
