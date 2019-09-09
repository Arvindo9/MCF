package com.indtel.mcf.core.fragments;

import com.indtel.mcf.core.fragments.casesAfterAssessment.CasesAfterAssessmentModule;
import com.indtel.mcf.core.fragments.dashboard.DashboardFragment;
import com.indtel.mcf.core.fragments.dashboard.DashboardModule;
import com.indtel.mcf.core.fragments.scrutinyOfdocuments.ScrutinyOfDocumentFragment;
import com.indtel.mcf.core.fragments.scrutinyOfdocuments.ScrutinyOfDocumentModule;
import com.indtel.mcf.core.fragments.statusOfApplication.StatusOfApplicationFragment;
import com.indtel.mcf.core.fragments.statusOfApplication.StatusOfApplicationModule;
import com.indtel.mcf.core.fragments.viewItem.ViewItemFragment;
import com.indtel.mcf.core.fragments.viewItem.ViewItemModule;
import com.indtel.mcf.core.dialogs.deficiencies.DeficienciesDialog;
import com.indtel.mcf.core.fragments.casesAfterAssessment.CasesAfterAssessmentFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

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
@Module
public abstract class FragmentHandlerProvider {

    @ContributesAndroidInjector(modules = StatusOfApplicationModule.class)
    abstract StatusOfApplicationFragment provideStatusOfApplicationFragment();

    @ContributesAndroidInjector(modules = ViewItemModule.class)
    abstract ViewItemFragment provideViewItemFragment();

    @ContributesAndroidInjector()
    abstract DeficienciesDialog provideDeficienciesDialog();

    @ContributesAndroidInjector(modules = DashboardModule.class)
    abstract DashboardFragment provideDashboardFragment();

    @ContributesAndroidInjector(modules = ScrutinyOfDocumentModule.class)
    abstract ScrutinyOfDocumentFragment provideScrutinyOfDocumentFragment();

    @ContributesAndroidInjector(modules = CasesAfterAssessmentModule.class)
    abstract CasesAfterAssessmentFragment provideCasesAfterAssessmentFragment();
}
