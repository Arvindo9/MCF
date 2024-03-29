package com.indtel.mcf.core.dialogs.vendorWise;

import android.view.View;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;

/**
 * Author       : Arvindo Mondal
 * Created on   : 22-08-2019
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
public class VendorWiseViewModel extends BaseViewModel<VendorWiseNavigator> {

    public VendorWiseViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);

    }

    //Resource--------------------------

    public void onCancelClick(){
        getNavigator().onCancelClick();
    }
    public void onProceedClick(){
        getNavigator().onProceedClick();
    }
    public void onSelectionClick(View view){
        getNavigator().onSelectionClick(view);
    }

    //Additional------------------------

    void onProcessListOfVendors(){
        setIsLoading(true);
        String userType = getDataManager().getUserType();
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .firmNameInProcessListOfVendors(userType, userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        String[] strings = new String[response.size()];
                        for(int i=0; i<response.size(); i++){
                            strings[i] = response.get(i).getNameOfFirm();
                        }
                        getNavigator().onSpinnerDataLoad(strings, response);
                    }
                    setIsLoading(false);
                }, throwable -> {
                    getNavigator().handleError(throwable);
                    setIsLoading(false);
                }));
    }

    void onApprovedVendorList(){
        setIsLoading(true);
        String userType = getDataManager().getUserType();
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .firmNameApprovedVendorList(userType, userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        String[] strings = new String[response.size()];
                        for(int i=0; i<response.size(); i++){
                            strings[i] = response.get(i).getNameOfFirm();
                        }
                        getNavigator().onSpinnerDataLoad(strings, response);
                    }
                    setIsLoading(false);
                }, throwable -> {
                    getNavigator().handleError(throwable);
                    setIsLoading(false);
                }));
    }

    void onClosedVendorList(){
        setIsLoading(true);
        String userType = getDataManager().getUserType();
        String userId = getDataManager().getReferenceId();
        getCompositeDisposable().add(getDataManager()
                .firmNameClosedVendorList(userType, userId)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        String[] strings = new String[response.size()];
                        for(int i=0; i<response.size(); i++){
                            strings[i] = response.get(i).getNameOfFirm();
                        }
                        getNavigator().onSpinnerDataLoad(strings, response);
                    }
                    setIsLoading(false);
                }, throwable -> {
                    getNavigator().handleError(throwable);
                    setIsLoading(false);
                }));
    }
}
