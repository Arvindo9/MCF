package com.indtel.mcf.core.fragments.sse;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.lifecycle.MutableLiveData;

import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.data.model.apis.sse.CaseList;
import com.indtel.mcf.utils.rx.SchedulerProvider;

import java.util.List;

import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.VENDOR_WISE_REPORT_APPROVED;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.VENDOR_WISE_REPORT_CASE_IN_PROGRESS;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.VENDOR_WISE_REPORT_CLOSED;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-09-2019
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
public class SseViewModel extends BaseViewModel<SseNavigator> {

    public final ObservableList<CaseList> modelObservableList = new ObservableArrayList<>();
    private final MutableLiveData<List<CaseList>> modelLiveData;

    public SseViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        modelLiveData = new MutableLiveData<>();
    }

    //List view---------------------------------------
    public ObservableList<CaseList> getModelObservableList() {
        return modelObservableList;
    }

    public void addModelToList(List<CaseList> list) {
        modelObservableList.clear();
        modelObservableList.addAll(list);
    }

    public MutableLiveData<List<CaseList>> getModelLiveData() {
        return modelLiveData;
    }

    public void setModelLiveData(List<CaseList> list){
        modelLiveData.setValue(list);
    }

    //APIs--------------------------------------------

    public void callApi(int openInterface, String applicationId) {
        setIsLoading(true);
        String userId = getDataManager().getReferenceId();
        switch (openInterface){
            case SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
                getCompositeDisposable().add(getDataManager()
                        .sseCasesAfterScrutinyOfDocuments(userId)
                        .subscribeOn(getSchedulerProvider().io())
                        .observeOn(getSchedulerProvider().ui())
                        .subscribe(response -> {
                            if (response != null && response.getCaseList() != null) {
                                modelLiveData.setValue(response.getCaseList());
                            }
                            else {
                                getNavigator().handleMessage(R.string.default_error);
                            }
                            setIsLoading(false);
                        }, throwable -> {
                            getNavigator().handleMessage(R.string.default_error);
                            setIsLoading(false);
                        }));
                break;

            case SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                getCompositeDisposable().add(getDataManager()
                    .sseCasesAfterAssessmentReportScrutiny(userId)
                    .subscribeOn(getSchedulerProvider().io())
                    .observeOn(getSchedulerProvider().ui())
                    .subscribe(response -> {
                        if (response != null && response.getCaseList() != null) {
                            modelLiveData.setValue(response.getCaseList());
                        }
                        else {
                            getNavigator().handleMessage(R.string.default_error);
                        }
                        setIsLoading(false);
                    }, throwable -> {
                        getNavigator().handleMessage(R.string.default_error);
                        setIsLoading(false);
                    }));
                break;

            case SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                getCompositeDisposable().add(getDataManager()
                    .sseCasesRevertedtoVendorafterAssessmentReport(userId)
                    .subscribeOn(getSchedulerProvider().io())
                    .observeOn(getSchedulerProvider().ui())
                    .subscribe(response -> {
                        if (response != null && response.getCaseList() != null) {
                            modelLiveData.setValue(response.getCaseList());
                        }
                        else {
                            getNavigator().handleMessage(R.string.default_error);
                        }
                        setIsLoading(false);
                    }, throwable -> {
                        getNavigator().handleMessage(R.string.default_error);
                        setIsLoading(false);
                    }));
                break;

            case VENDOR_WISE_REPORT_CASE_IN_PROGRESS:
            case VENDOR_WISE_REPORT_APPROVED:
            case VENDOR_WISE_REPORT_CLOSED:
/*                getCompositeDisposable().add(getDataManager()
                    .statusOfApplication(applicationId)
                    .subscribeOn(getSchedulerProvider().io())
                    .observeOn(getSchedulerProvider().ui())
                    .subscribe(response -> {
                        if (response != null && response.getCaseList() != null) {
                            modelLiveData.setValue(response.getCaseList());
                        }
                        else {
                            getNavigator().handleMessage(R.string.default_error);
                        }
                        setIsLoading(false);
                    }, throwable -> {
                        getNavigator().handleMessage(R.string.default_error);
                        setIsLoading(false);
                    }));*/
                break;
        }
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
