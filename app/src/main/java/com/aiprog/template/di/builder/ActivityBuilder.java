package com.indtel.template.di.builder;

import com.indtel.template.core.fragments.FragmentHandlerActivity;
import com.indtel.template.core.fragments.FragmentHandlerProvider;
import com.indtel.template.ui.home.vendor.VendorHomeActivity;
import com.indtel.template.ui.home.vendor.VendorHomeProvider;
import com.indtel.template.ui.launcher.credential.LoginActivity;
import com.indtel.template.ui.launcher.splash.SplashActivity;
import com.indtel.template.ui.launcher.welcome.WelcomeActivity;
import com.indtel.template.ui.launcher.welcome.WelcomeModule;

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
