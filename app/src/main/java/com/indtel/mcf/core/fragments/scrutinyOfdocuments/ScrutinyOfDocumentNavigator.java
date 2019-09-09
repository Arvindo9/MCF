package com.indtel.mcf.core.fragments.scrutinyOfdocuments;

import com.indtel.mcf.base.BaseNavigator;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;

import java.util.List;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
interface ScrutinyOfDocumentNavigator extends BaseNavigator {

    void updateListView(List<DashboardScrutinyOfDocument> model);

    void onBackButtonClick();

    void onClearButtonClick();

    void onSearchClick();
}
