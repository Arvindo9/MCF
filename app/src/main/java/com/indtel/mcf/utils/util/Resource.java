package com.indtel.mcf.utils.util;

import android.widget.EditText;

import com.indtel.mcf.base.BaseActivity;

/**
 * Author       : Arvindo Mondal
 * Created on   : 21-06-2019
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
public interface Resource {

    <A extends BaseActivity> boolean validateUserId(A activity, EditText editText);

    <A extends BaseActivity> boolean validatePassword(A activity, EditText editText);
}
