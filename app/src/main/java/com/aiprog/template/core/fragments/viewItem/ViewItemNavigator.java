package com.aiprog.template.core.fragments.viewItem;

import com.aiprog.template.base.BaseNavigator;
import com.aiprog.template.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.aiprog.template.data.model.apis.viewItem.ViewItem;

import java.util.List;

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
interface ViewItemNavigator extends BaseNavigator {

    void updateListView(List<ViewItem> model);

    void onBackButtonClick();

    void onClearButtonClick();

    void onSearchClick();
}
