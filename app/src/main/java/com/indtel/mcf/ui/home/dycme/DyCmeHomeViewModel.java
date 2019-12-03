package com.indtel.mcf.ui.home.dycme;

import androidx.databinding.ObservableField;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;

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
public class DyCmeHomeViewModel extends BaseViewModel<DyCmeHomeNavigator> {

    public final ObservableField<String> userName;

    public DyCmeHomeViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        userName = new ObservableField<>(getDataManager().getUserName());
    }

    //Resource--------------------------

    public void onLogOutClick(){
        getNavigator().onLogOutClick();
        getDataManager().setLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT);
    }
    public void onCaseForNominationClick(){
        getNavigator().onCaseForNominationClick();
    }
    public void onCasesForAssessmentClick(){
        getNavigator().onCasesForAssessmentClick();
    }public void onCaseAllotToInspectorClick(){
        getNavigator().onCaseAllotToInspectorClick();
    }
    public void onCaseForScrutinyClick(){
        getNavigator().onCaseForScrutinyClick();
    }
    public void onVendorWiseReportClick(){
        getNavigator().onVendorWiseReportClick();
    }
    public void onDashboardClick(){
        getNavigator().onDashboardClick();
    }

}
