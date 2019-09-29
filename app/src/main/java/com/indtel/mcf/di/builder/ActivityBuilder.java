package com.indtel.mcf.di.builder;

import com.indtel.mcf.ui.home.ao.AoHomeActivity;
import com.indtel.mcf.ui.home.ao.AoHomeProvider;
import com.indtel.mcf.ui.home.sse.SseHomeActivity;
import com.indtel.mcf.ui.home.sse.SseHomeProvider;
import com.indtel.mcf.ui.home.vendor.VendorHomeActivity;
import com.indtel.mcf.ui.home.vendor.VendorHomeProvider;
import com.indtel.mcf.ui.launcher.credential.LoginActivity;
import com.indtel.mcf.ui.launcher.splash.SplashActivity;
import com.indtel.mcf.ui.launcher.welcome.WelcomeActivity;
import com.indtel.mcf.ui.launcher.welcome.WelcomeModule;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.core.fragments.FragmentHandlerProvider;

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

    @ContributesAndroidInjector(modules = SseHomeProvider.class)
    abstract SseHomeActivity bindSseHomeActivity();

    @ContributesAndroidInjector(modules = AoHomeProvider.class)
    abstract AoHomeActivity bindAoHomeActivity();

}
