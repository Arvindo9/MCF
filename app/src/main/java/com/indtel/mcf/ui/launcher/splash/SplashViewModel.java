package com.indtel.mcf.ui.launcher.splash;

import android.os.Handler;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;
import com.indtel.mcf.utils.tasks.Task;

import static com.indtel.mcf.utils.AppConstants.USER_TYPE_AME;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_AO;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_CPLE;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_DYCME;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_SSE;
import static com.indtel.mcf.utils.AppConstants.USER_TYPE_VENDOR;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
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
public class SplashViewModel extends BaseViewModel<SplashNavigator> {

    private final Task task;
    public boolean isPermissionGranted = false;
    private boolean isAppReady = false;
    private boolean isWaitComplete = false;
    private int taskId = 0;
    private static int SPLASH_TIME_OUT = 3000;

    private final int LOGGED_IN_MODE_FIRST_TIME = 0;
    private final int LOGGED_IN_MODE_LOGGED_OUT = 1;
    private final int LOGGED_IN_MODE_LOGGED_IN_HOME = 8;

    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider, Task task) {
        super(dataManager, schedulerProvider);
        this.task = task;
    }

    void onStart() {
        isAppReady = false;
        isWaitComplete = false;

        waitForThreadComplete();

        decideNextScreen();
    }

    private void decideNextScreen(){
        if(getDataManager().getLoggedInMode() ==
                DataManager.LoggedInMode.LOGGED_IN_MODE_FIRST_TIME.getType()){
            taskId = LOGGED_IN_MODE_FIRST_TIME;
        }
        else if(getDataManager().getLoggedInMode() ==
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()){
            taskId = LOGGED_IN_MODE_LOGGED_OUT;
        }
        else if(getDataManager().getLoggedInMode() ==
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_IN.getType()){
            taskId = LOGGED_IN_MODE_LOGGED_IN_HOME;
        }

        isAppReady = true;
        onNextScreenDecided();
    }

    private void onNextScreenDecided(){
        if(isWaitComplete && isAppReady) {
            switch (taskId) {
                case LOGGED_IN_MODE_FIRST_TIME:
                    getNavigator().openWelcomeScreen();
                    break;
                case LOGGED_IN_MODE_LOGGED_OUT:
                    getNavigator().openLoginActivity();
                    break;
                case LOGGED_IN_MODE_LOGGED_IN_HOME:
                    if(getDataManager().getUserType().equals(USER_TYPE_VENDOR)){
                        getNavigator().openVendorHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_SSE)){
                        getNavigator().openSseHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_AO)){
                        getNavigator().openAoHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_AME)){
                        getNavigator().openAmeHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_AME)){
                        getNavigator().openAmeHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_DYCME)){
                        getNavigator().openDyCmeHomeActivity();
                    }
                    else if(getDataManager().getUserType().equals(USER_TYPE_CPLE)){
                        getNavigator().openCpleHomeActivity();
                    }
//                    getNavigator().openHomeActivity();
                    break;
            }
        }
    }

    private void waitForThreadComplete(){
        new Handler().postDelayed(() -> {
            isWaitComplete = true;
            onNextScreenDecided();
        }, SPLASH_TIME_OUT);
    }

    //Additional task--------------------------------------
}
