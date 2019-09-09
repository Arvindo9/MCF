package com.indtel.mcf.data;

import android.content.Context;

import com.indtel.mcf.data.local.db.DatabaseService;
import com.indtel.mcf.data.local.prefs.PreferencesService;
import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.data.model.apis.flag.FlagApi;
import com.indtel.mcf.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.mcf.data.model.apis.viewItem.ViewItem;
import com.indtel.mcf.data.model.db.flag.Flag;
import com.indtel.mcf.data.model.db.login.LoginDb;
import com.indtel.mcf.data.remote.APIService;
import com.indtel.mcf.data.model.apis.casesAfterAssessmen.CasesAfterAssessment;
import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Flowable;

/**
 * Author       : Arvindo Mondal
 * Created on   : 09-05-2019
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
public class AppDataManager implements DataManager {

    private final APIService apiService;
    private final Context context;
    private final DatabaseService dbService;
    private final Gson gson;
    private final PreferencesService pref;

    @Inject
    AppDataManager(Context context, PreferencesService preferencesService,
                   APIService apiService, DatabaseService dbService, Gson gson) {
        this.context = context;
        this.pref = preferencesService;
        this.dbService = dbService;
        this.gson = gson;
        this.apiService = apiService;
    }

    @Override
    public void updateUserInfo(String accessToken, Long userId, LoggedInMode loggedInMode,
                               String userName, String email, String profilePicPath) {
    }

    //Preferences----------------------------

    @Override
    public int getLoggedInMode() {
        return pref.getLoggedInMode();
    }

    @Override
    public void setLoggedInMode(LoggedInMode mode) {
        pref.setLoggedInMode(mode);
    }

    @Override
    public void setEmail(String email) {
        pref.setEmail(email);
    }

    @Override
    public String getEmail() {
        return pref.getEmail();
    }

    @Override
    public void setCountryCode(String countryCode) {
        pref.setCountryCode(countryCode);
    }

    @Override
    public String getCountryCode() {
        return pref.getCountryCode();
    }

    @Override
    public void setMobile(String mobile) {
        pref.setMobile(mobile);
    }

    @Override
    public String getMobile() {
        return pref.getMobile();
    }

    @Override
    public void setUserId(String userId) {
        pref.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return pref.getUserId();
    }

    @Override
    public void setUserName(String userName) {
        pref.setUserName(userName);
    }

    @Override
    public String getUserName() {
        return pref.getUserName();
    }

    @Override
    public void setUserType(String userType) {
        pref.setUserType(userType);
    }

    @Override
    public String getUserType() {
        return pref.getUserType();
    }

    @Override
    public void setReferenceId(String referenceId) {
        pref.setReferenceId(referenceId);
    }

    @Override
    public String getReferenceId() {
        return pref.getReferenceId();
    }

    //Database---------------------------------

    @Override
    public Flowable<List<Flag>> getAllFlagsDb() {
        return dbService.getAllFlagsDb();
    }

    @Override
    public Flowable<Boolean> saveFlagsListDb(List<Flag> flagList) {
        return dbService.saveFlagsListDb(flagList);
    }

    @Override
    public Flowable<Boolean> updateFlagBaseUrlDb(String flagBaseUrl) {
        return dbService.updateFlagBaseUrlDb(flagBaseUrl);
    }

    @Override
    public Flowable<FlagApi> countryCode() {
        return apiService.countryCode();
    }

    @Override
    public Flowable<LoginDb> userLogin(String userName, String password) {
        return apiService.userLogin(userName, password);
    }

    @Override
    public Flowable<LoginDb> userLoginVendor(String userName, String password) {
        return apiService.userLoginVendor(userName, password);
    }

    @Override
    public Flowable<List<StatusOfApplicationResponse>> statusOfApplicationApi(String userId) {
        return apiService.statusOfApplicationApi(userId);
    }

    @Override
    public Flowable<List<ViewItem>> viewItemDetailsApi(String applicationId) {
        return apiService.viewItemDetailsApi(applicationId);
    }

    @Override
    public Flowable<List<Dashboard>> dashboardData(String referenceCode) {
        return apiService.dashboardData(referenceCode);
    }

    @Override
    public Flowable<List<DashboardScrutinyOfDocument>> dashboardScrutinyOfDocuments(String id) {
        return apiService.dashboardScrutinyOfDocuments(id);
    }

    @Override
    public Flowable<List<CasesAfterAssessment>> casesAfterAssessmentFresh(String id) {
        return apiService.casesAfterAssessmentFresh(id);
    }

    @Override
    public Flowable<List<CasesAfterAssessment>> casesAfterAssessmentReverted(String id) {
        return apiService.casesAfterAssessmentReverted(id);
    }

}
