package com.indtel.mcf.core.fragments.statusOfApplication;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.mcf.utils.rx.SchedulerProvider;

import java.util.List;

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
public class StatusOfApplicationViewModel extends BaseViewModel<StatusOfApplicationNavigator> {
    public final ObservableList<StatusOfApplicationResponse> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<StatusOfApplicationResponse>> modelLiveData;

    public StatusOfApplicationViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
        callApi();
    }

    //List view---------------------------------------
    public ObservableList<StatusOfApplicationResponse> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<StatusOfApplicationResponse> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<StatusOfApplicationResponse>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<StatusOfApplicationResponse> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    private void  callApi() {
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .statusOfApplicationApi(userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        modelLiveData.setValue(response);
                    }
                }, Throwable::printStackTrace));
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
