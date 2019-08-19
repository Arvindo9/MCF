package com.aiprog.template.di.builder;

import com.aiprog.template.core.fragments.FragmentHandlerActivity;
import com.aiprog.template.core.fragments.FragmentHandlerProvider;
import com.aiprog.template.ui.home.vendor.VendorHomeActivity;
import com.aiprog.template.ui.home.vendor.VendorHomeProvider;
import com.aiprog.template.ui.launcher.credential.LoginActivity;
import com.aiprog.template.ui.launcher.splash.SplashActivity;
import com.aiprog.template.ui.launcher.welcome.WelcomeActivity;
import com.aiprog.template.ui.launcher.welcome.WelcomeModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
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
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector()
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = WelcomeModule.class)
    abstract WelcomeActivity bindWelcomeActivity();

    @ContributesAndroidInjector(modules = FragmentHandlerProvider.class)
    abstract FragmentHandlerActivity bindFragmentHandlerActivity();

    @ContributesAndroidInjector()
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = VendorHomeProvider.class)
    abstract VendorHomeActivity bindVendorHomeActivity();

}
