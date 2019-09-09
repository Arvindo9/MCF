package com.indtel.mcf.core.fragments;

import com.indtel.mcf.base.BaseViewModel;
import com.indtel.mcf.data.DataManager;
import com.indtel.mcf.utils.rx.SchedulerProvider;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
 * Email        : arvindo@indtel.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.indtel.in
 */
public class FragmentHandlerViewModel extends BaseViewModel<FragmentHandlerNavigator> {

    public FragmentHandlerViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
