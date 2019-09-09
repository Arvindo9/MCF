package com.indtel.mcf.core.fragments.dashboard;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.utils.rx.SchedulerProvider;

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
public class DashboardViewModel extends BaseViewModel<DashboardNavigator> {

    public final ObservableList<Dashboard> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<Dashboard>> modelLiveData;


    public DashboardViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
        callApi();
    }

    //List view---------------------------------------
    public ObservableList<Dashboard> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<Dashboard> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<Dashboard>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<Dashboard> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    private void  callApi() {
        setIsLoading(false);
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .dashboardData(userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        modelLiveData.setValue(response);
                    }
                    setIsLoading(false);
                }, throwable -> {
                    setIsLoading(false);
                }));
    }


    //Resources---------------------------------------

    public void onBackButtonClick(){
        getNavigator().onBackButtonClick();
    }
}
