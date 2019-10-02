package com.indtel.mcf.core.dialogs.caseDefault;

import android.view.View;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;

/**
 * Author       : Arvindo Mondal
 * Created on   : 30-09-2019
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
public class CaseDefaultViewModel extends BaseViewModel<CaseDefaultNavigator> {

    public CaseDefaultViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }


    //Resources----------------------

    public void onCancelClick(){
        getNavigator().onCancelClick();
    }
    public void onSelectionClick(View view){
        getNavigator().onSelectionClick(view);
    }
}
