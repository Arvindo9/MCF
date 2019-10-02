package com.indtel.mcf.ui.home.dycme;

import com.indtel.mcf.core.dialogs.caseDefault.CaseDefaultDialog;
import com.indtel.mcf.core.dialogs.cases.CasesDialog;
import com.indtel.mcf.core.dialogs.deficiencies.DeficienciesDialog;
import com.indtel.mcf.core.dialogs.vendorWise.VendorWiseDialog;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Author       : Arvindo Mondal
 * Created on   : 01-10-2019
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
public abstract class DyCmeProvider {
    @ContributesAndroidInjector()
    abstract DeficienciesDialog provideDeficienciesDialog();

    @ContributesAndroidInjector()
    abstract CasesDialog provideCasesDialog();

    @ContributesAndroidInjector()
    abstract VendorWiseDialog provideVendorWiseDialog();

    @ContributesAndroidInjector()
    abstract CaseDefaultDialog provideCaseDefaultDialog();
}
