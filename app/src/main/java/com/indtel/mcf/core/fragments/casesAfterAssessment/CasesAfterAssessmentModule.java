package com.indtel.mcf.core.fragments.casesAfterAssessment;

import com.indtel.mcf.core.fragments.casesAfterAssessment.adapter.CasesAfterAssessmentAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
@Module
public class CasesAfterAssessmentModule {
    @Provides
    CasesAfterAssessmentAdapter provideCasesAfterAssessmentAdapter() {
        return new CasesAfterAssessmentAdapter(new ArrayList<>());
    }
}
