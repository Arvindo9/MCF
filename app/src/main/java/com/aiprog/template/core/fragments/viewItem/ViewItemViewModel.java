package com.indtel.template.core.fragments.viewItem;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.template.base.BaseViewModel;
import com.indtel.template.data.DataManager;
import com.indtel.template.data.model.apis.viewItem.ViewItem;
import com.indtel.template.utils.rx.SchedulerProvider;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 18-08-2019
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
public class ViewItemViewModel extends BaseViewModel<ViewItemNavigator> {
    public final ObservableList<ViewItem> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<ViewItem>> modelLiveData;

    public ViewItemViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
    }

    //List view---------------------------------------
    public ObservableList<ViewItem> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<ViewItem> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<ViewItem>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<ViewItem> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    void  callApi(String applicationId) {
        getCompositeDisposable().add(getDataManager()
                .viewItemDetailsApi(applicationId)
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
