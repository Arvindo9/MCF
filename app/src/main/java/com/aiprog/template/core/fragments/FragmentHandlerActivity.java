package com.aiprog.template.core.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.aiprog.template.BR;
import com.aiprog.template.R;
import com.aiprog.template.base.BaseActivity;
import com.aiprog.template.core.fragments.statusOfApplication.StatusOfApplicationFragment;
import com.aiprog.template.databinding.ActivityFragmentHandlerBinding;
import com.aiprog.template.di.module.ViewModelProviderFactory;

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
        implements FragmentHandlerNavigator, HasSupportFragmentInjector {
    public static final String TAG = FragmentHandlerActivity.class.getSimpleName();

    public static final String KEY_OPEN_INTERFACE = "KEY_OPEN_INTERFACE";

    public int OPEN_INTERFACE = 0;
    public static final int DEFAULT_INTERFACE = 0;
    public static final int STATUS_OF_APPLICATION = 1;
    public static final int VIEW_ITEM_DETAILS = 2;
    public static final int EDIT_ADDITIONAL_DETAILS_INTERFACE = 2;
    public static final int PREFERENCES_INTERFACE = 3;
    public static final int _INTERFACE = 4;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;
    private ActivityFragmentHandlerBinding binding;
    private FragmentHandlerViewModel viewModel;
    private FragmentManager manager;

    public static Intent newIntent(Context context, int openInterface) {
        Intent intent = new Intent(context, FragmentHandlerActivity.class);
        intent.putExtra(KEY_OPEN_INTERFACE, openInterface);
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
                StatusOfApplicationFragment fragment = StatusOfApplicationFragment.newInstance();
                transaction.replace(R.id.fragment, fragment,
                        StatusOfApplicationFragment.TAG);
                transaction.addToBackStack(StatusOfApplicationFragment.TAG);
                transaction.commit();
                break;

            case VIEW_ITEM_DETAILS:
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
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
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