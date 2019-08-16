package com.aiprog.template.ui.launcher.credential;

import com.aiprog.template.base.BaseViewModel;
import com.aiprog.template.data.DataManager;
import com.aiprog.template.utils.Logger;
import com.aiprog.template.utils.rx.SchedulerProvider;
import com.aiprog.template.utils.tasks.Task;

import static com.aiprog.template.utils.AppConstants.USER_TYPE_VENDOR;

/**
 * Author       : Arvindo Mondal
 * Created on   : 28-07-2019
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
public class LoginViewModel extends BaseViewModel<LoginNavigator> {
    private boolean isLoginError = false;

    public LoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, Task task) {
        super(dataManager, schedulerProvider);
    }

    //Resource-------------------

    public void onLoginClick(){
        getNavigator().onLoginClick();
    }

    public void doLogin(String userId, String password) {
        getCompositeDisposable().add(getDataManager()
                .userLogin(userId, password)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                    }
                    else {
                        isLoginError = true;
                    }
                }, throwable -> {
                    if(isLoginError) {
                        getNavigator().handleError(throwable);
                    }
                    isLoginError = true;
                }));

        getCompositeDisposable().add(getDataManager()
                .userLoginVendor(userId, password)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        if(response.getUserId() != null) {
                            getDataManager().setUserId(response.getUserId());
                        }

                        if(response.getUserType() == null || response.getUserType().equalsIgnoreCase("")){
                            if(response.getVendorId() != null){
                                getDataManager().setUserId(response.getVendorId().toString());
                            }
                            if(response.getVendorName() != null){
                                getDataManager().setUserName(response.getVendorName());
                            }
                            getDataManager().setUserType(USER_TYPE_VENDOR);
                            getNavigator().openVendorHome();
                        }


                        getDataManager().setLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN);

                        Logger.e("knsdfndsflndf");
                    }
                }, throwable -> getNavigator().handleError(throwable)));
    }
}
