package com.indtel.mcf.ui.launcher.credential;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.Logger;
import com.indtel.mcf.utils.rx.SchedulerProvider;
import com.indtel.mcf.utils.tasks.Task;

import static com.indtel.mcf.utils.AppConstants.USER_TYPE_SSE;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_VENDOR;

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
        setIsLoading(true);
        getCompositeDisposable().add(getDataManager()
                .userLogin(userId, password)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        if(response.getUserId() != null){
                            getDataManager().setUserId(response.getUserId());
                        }
                        if(response.getUserName() != null){
                            getDataManager().setUserName(response.getUserName());
                        }
                        if(response.getId() != null){
                            String id = response.getId().toString();
                            String ids = id.contains(".") ? id.substring(0, id.indexOf(".")-1) : id;
                            getDataManager().setReferenceId(ids);
                        }
                        if(response.getUserType() != null && response.getUserType().equals(USER_TYPE_SSE)){
                            getDataManager().setUserType(USER_TYPE_SSE);
                            getNavigator().openSSEHome();
                        }


                        getDataManager().setLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN);

                        Logger.e("admin login");
                    }

                    setIsLoading(false);
                }, throwable -> {
                    if(isLoginError) {
                        getNavigator().handleError(throwable);
                    }
                    isLoginError = true;
                    setIsLoading(false);
                }));

        getCompositeDisposable().add(getDataManager()
                .userLoginVendor(userId, password)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (response != null) {
                        if(response.getUserId() != null){
                            getDataManager().setUserId(response.getUserId());
                        }
                        if(response.getVendorName() != null){
                            getDataManager().setUserName(response.getVendorName());
                        }
                        if(response.getVendorId() != null){
                            String id = response.getVendorId().toString();
                            String ids = id.contains(".") ? id.substring(0, id.indexOf(".")) : id;
                            getDataManager().setReferenceId(ids);
                        }
                        getDataManager().setUserType(USER_TYPE_VENDOR);
                        getNavigator().openVendorHome();

                        getDataManager().setLoggedInMode(DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN);

                        Logger.e("vendor login");
                        setIsLoading(false);
                    }
                }, throwable -> {
                    getNavigator().handleError(throwable);
                    setIsLoading(false);}
                ));
    }
}
