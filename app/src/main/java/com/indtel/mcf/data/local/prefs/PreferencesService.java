package com.indtel.mcf.data.local.prefs;


import com.indtel.mcf.data.DataManager;

/**
 * Author       : Arvindo Mondal
 * Created on   : 23-12-2018
 */
public interface PreferencesService {
    int getLoggedInMode();

    void setLoggedInMode(DataManager.LoggedInMode mode);

    void setEmail(String email);

    String getEmail();

    void setCountryCode(String countryCode);

    String getCountryCode();

    void setMobile(String mobile);

    String getMobile();

    void setUserId(String userId);

    String getUserId();

    void setUserName(String userName);

    String getUserName();

    void setUserType(String userType);

    String getUserType();

    void setReferenceId(String referenceId);

    String getReferenceId();

}
