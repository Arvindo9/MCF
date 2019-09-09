package com.indtel.mcf.core.fragments.scrutinyOfdocuments;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.utils.rx.SchedulerProvider;

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
public class ScrutinyOfDocumentViewModel extends BaseViewModel<ScrutinyOfDocumentNavigator> {
    public final ObservableList<DashboardScrutinyOfDocument> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<DashboardScrutinyOfDocument>> modelLiveData;


    public ScrutinyOfDocumentViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
    }

    //List view---------------------------------------
    public ObservableList<DashboardScrutinyOfDocument> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<DashboardScrutinyOfDocument> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<DashboardScrutinyOfDocument>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<DashboardScrutinyOfDocument> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    void  callApi(String applicationId) {
        setIsLoading(true);
        getCompositeDisposable().add(getDataManager()
                .dashboardScrutinyOfDocuments(applicationId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        modelLiveData.setValue(response);
                    }
                    setIsLoading(false);
                },throwable -> setIsLoading(false)));
    }


    //Resources---------------------------------------

    public void onBackButtonClick(){
        getNavigator().onBackButtonClick();
    }

    public void onClearButtonClick(){
        getNavigator().onClearButtonClick();
    }

    public void onSearchClick(){
        getNavigator().onSearchClick();
    }
}
