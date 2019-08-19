package com.aiprog.template.core.dialogs.deficiencies;

import android.view.View;

import com.aiprog.template.base.BaseViewModel;
import com.aiprog.template.data.DataManager;
import com.aiprog.template.utils.rx.SchedulerProvider;

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
public class DeficienciesViewModel extends BaseViewModel<DeficienciesNavigator> {

    public DeficienciesViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    //Resource--------------------------

    public void onCancelClick(){
        getNavigator().onCancelClick();
    }
    public void onSelectionClick(View view){
        getNavigator().onSelectionClick(view);
    }
}
