package com.indtel.mcf.ui.home.dycme;

import com.indtel.mcf.base.BaseNavigator;

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
public interface DyCmeHomeNavigator extends BaseNavigator {
    void onLogOutClick();

    void onVendorWiseReportClick();

    void onDashboardClick();

    void onCaseForScrutinyClick();

    void onCaseForNominationClick();

    void onCasesForAssessmentClick();

    void onCaseAllotToInspectorClick();
}
