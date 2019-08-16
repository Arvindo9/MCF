package com.aiprog.template.utils.util;

import android.widget.EditText;

import com.aiprog.template.R;
import com.aiprog.template.base.BaseActivity;

import javax.inject.Singleton;

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
@Singleton
public class ResourceUtils implements Resource {


    @Override
    public <A extends BaseActivity> boolean validateUserId(A activity, EditText editText) {
        return _validateUserId(activity, editText);
    }
    @Override
    public <A extends BaseActivity> boolean validatePassword(A activity, EditText editText) {
        return _validatePassword(activity, editText);
    }


    //Implementation-------------------------

    private <A extends BaseActivity> boolean _validateUserId(A activity, EditText editText) {
        if(editText.getText() != null) {
            if (editText.getText().toString().trim().isEmpty()) {
                editText.setError(activity.getString(R.string.invalide_user_Id));
                activity.requestFocus(editText);
                return false;
            } else {
                editText.setError(null);
            }
        }
        else{
            editText.setError(activity.getString(R.string.invalide_user_Id));
            return false;
        }
        return true;
    }

    private <A extends BaseActivity> boolean _validatePassword(A activity, EditText editText) {
        if(editText.getText() != null) {
            if (editText.getText().toString().trim().isEmpty()) {
                editText.setError(activity.getString(R.string.invalide_password));
                activity.requestFocus(editText);
                return false;
            } else {
                editText.setError(null);
            }
        }
        else{
            editText.setError(activity.getString(R.string.invalide_password));
            return false;
        }
        return true;
    }
}
