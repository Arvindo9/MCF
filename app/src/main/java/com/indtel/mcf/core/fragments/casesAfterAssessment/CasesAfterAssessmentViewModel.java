package com.indtel.mcf.core.fragments.casesAfterAssessment;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.apis.casesAfterAssessmen.CasesAfterAssessment;
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
public class CasesAfterAssessmentViewModel extends BaseViewModel<CasesAfterAssessmentNavigator> {

    public final ObservableList<CasesAfterAssessment> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<CasesAfterAssessment>> modelLiveData;

    public CasesAfterAssessmentViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
    }

    //List view---------------------------------------
    public ObservableList<CasesAfterAssessment> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<CasesAfterAssessment> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<CasesAfterAssessment>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<CasesAfterAssessment> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    void  callApiFresh() {
        setIsLoading(true);
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .casesAfterAssessmentFresh(userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        modelLiveData.setValue(response);
                    }
                    setIsLoading(false);
                }, throwable ->
                        setIsLoading(false)));
    }

    void  callApiReverted() {
        setIsLoading(true);
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .casesAfterAssessmentReverted(userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        modelLiveData.setValue(response);
                    }
                    setIsLoading(false);
                }, throwable ->
                        setIsLoading(false)));
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
