package com.aiprog.template.ui.home.vendor;

import com.aiprog.template.core.dialogs.deficiencies.DeficienciesDialog;
import com.aiprog.template.core.fragments.statusOfApplication.StatusOfApplicationFragment;
import com.aiprog.template.core.fragments.statusOfApplication.StatusOfApplicationModule;
import com.aiprog.template.core.fragments.viewItem.ViewItemFragment;
import com.aiprog.template.core.fragments.viewItem.ViewItemModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Author       : Arvindo Mondal
 * Created on   : 18-08-2019
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
public abstract class VendorHomeProvider {

    @ContributesAndroidInjector()
    abstract DeficienciesDialog provideDeficienciesDialog();
}
