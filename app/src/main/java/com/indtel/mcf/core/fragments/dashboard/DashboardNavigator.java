package com.indtel.mcf.core.fragments.dashboard;

import com.indtel.mcf.base.BaseNavigator;
import com.indtel.mcf.data.model.apis.dashboard.Dashboard;

import java.util.List;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/23/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
interface DashboardNavigator extends BaseNavigator {

    void updateListView(List<Dashboard> model);

    void onBackButtonClick();
}
