package com.indtel.mcf.ui.launcher.credential;

import com.indtel.mcf.base.BaseNavigator;

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
interface LoginNavigator extends BaseNavigator {
    void onLoginClick();

    void openVendorHome();

    void openSSEHome();

    void openAoHome();

    void openAmeHome();

    void openDyCmeHome();

    void openCpleHome();

    void onGuideLineClick();
}
