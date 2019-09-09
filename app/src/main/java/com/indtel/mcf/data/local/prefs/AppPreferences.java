package com.indtel.mcf.data.local.prefs;


import android.content.Context;
import android.content.SharedPreferences;

import com.indtel.mcf.di.annotation.PreferenceInfo;
import com.indtel.mcf.data.DataManager;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 23-12-2018
 */
public class AppPreferences implements PreferencesService {

    private static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
    private static final String KEY_EMAIL = "PREF_KEY_EMAIL";
    private static final String KEY_COUNTRY_CODE = "PREF_KEY_COUNTRY_CODE";
    private static final String KEY_MOBILE = "PREF_KEY_MOBILE";
    private static final String KEY_USER_ID = "PREF_KEY_USER_ID";
    private static final String KEY_USER_NAME = "PREF_KEY_USER_NAME";
    private static final String KEY_USER_TYPE = "PREF_KEY_USER_TYPE";
    private static final String KEY_APPLICATION_ID = "PREF_KEY_APPLICATION_ID";

    private final SharedPreferences pref;

    @Inject
    public AppPreferences(Context context, @PreferenceInfo String prefFileName) {
        pref = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public int getLoggedInMode() {
        return pref.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
                DataManager.LoggedInMode.LOGGED_IN_MODE_FIRST_TIME.getType());
    }

    @Override
    public void setLoggedInMode(DataManager.LoggedInMode mode) {
        pref.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getType()).apply();
    }


    @Override
    public void setEmail(String email) {
        pref.edit().putString(KEY_EMAIL, email).apply();
    }

    @Override
    public String getEmail() {
        return pref.getString(KEY_EMAIL, "");
    }

    @Override
    public void setCountryCode(String countryCode) {
        pref.edit().putString(KEY_COUNTRY_CODE, countryCode).apply();
    }

    @Override
    public String getCountryCode() {
        return pref.getString(KEY_COUNTRY_CODE, "");
    }

    @Override
    public void setMobile(String mobile) {
        pref.edit().putString(KEY_MOBILE, mobile).apply();
    }

    @Override
    public String getMobile() {
        return pref.getString(KEY_MOBILE, "");
    }

  /*  @Override
    public void setVendorId(String vendorId) {
        pref.edit().putString(KEY_VENDOR_ID, vendorId).apply();
    }

    @Override
    public String getVendorId() {
        return pref.getString(KEY_VENDOR_ID, "");
    }*/

    @Override
    public void setUserId(String userId) {
        pref.edit().putString(KEY_USER_ID, userId).apply();
    }

    @Override
    public String getUserId() {
        return pref.getString(KEY_USER_ID, "");
    }

    @Override
    public void setUserName(String userName) {
        pref.edit().putString(KEY_USER_NAME, userName).apply();
    }

    @Override
    public String getUserName() {
        return pref.getString(KEY_USER_NAME, "");
    }

    @Override
    public void setUserType(String userType) {
        pref.edit().putString(KEY_USER_TYPE, userType).apply();
    }

    @Override
    public String getUserType() {
        return pref.getString(KEY_USER_TYPE, "");
    }

    @Override
    public void setReferenceId(String referenceId) {
        pref.edit().putString(KEY_APPLICATION_ID, referenceId).apply();
    }

    @Override
    public String getReferenceId() {
        return pref.getString(KEY_APPLICATION_ID, "");
    }

}
