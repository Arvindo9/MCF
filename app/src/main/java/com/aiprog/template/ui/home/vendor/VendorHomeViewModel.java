package com.aiprog.template.ui.home.vendor;

import androidx.databinding.ObservableField;

import com.aiprog.template.base.BaseViewModel;
import com.aiprog.template.data.DataManager;
import com.aiprog.template.utils.rx.SchedulerProvider;

import io.reactivex.internal.operators.observable.ObservableTake;

/**
 * Author       : Arvindo Mondal
 * Created on   : 05-08-2019
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
public class VendorHomeViewModel extends BaseViewModel<VendorHomeNavigator> {

    public final ObservableField<String> userName;

    public VendorHomeViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        userName = new ObservableField<>(getDataManager().getUserName());
    }

    //Resource--------------------------

    public void onLogOutClick(){
        getNavigator().onLogOutClick();
        getDataManager().setLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT);
    }
    public void onDeficienciesAdvisedClick(){
        getNavigator().onDeficienciesAdvisedClick();
    }
    public void onStatusOfApplicationClick(){
        getNavigator().onStatusOfApplicationClick();
    }
}
