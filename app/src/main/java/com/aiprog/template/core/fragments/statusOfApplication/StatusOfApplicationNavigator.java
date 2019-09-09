package com.indtel.template.core.fragments.statusOfApplication;

import com.indtel.template.base.BaseNavigator;
import com.indtel.template.data.model.apis.statusOfApplication.StatusOfApplicationResponse;

import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
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
interface StatusOfApplicationNavigator extends BaseNavigator {

    void updateListView(List<StatusOfApplicationResponse> model);

    void onBackButtonClick();

    void onClearButtonClick();

    void onSearchClick();
}
