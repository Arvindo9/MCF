package com.indtel.template.data.remote;


import com.indtel.template.data.model.apis.flag.FlagApi;
import com.indtel.template.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.template.data.model.apis.viewItem.ViewItem;
import com.indtel.template.data.model.db.login.LoginDb;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Flowable;
import retrofit2.Retrofit;

/**
 * Author       : Arvindo Mondal
 * Created on   : 24-12-2018
 * Email        : arvindomondal@gmail.com
 */
public class APIs implements APIService {

    private final APIService apiService;
    private final APIService apiServiceUtils;

    @Inject
    public APIs(@Named("APP") Retrofit retrofit, @Named("UTILS") Retrofit retrofitUtils) {
        this.apiService = retrofit.create(APIService.class);
        this.apiServiceUtils = retrofitUtils.create(APIService.class);
    }

    //Pref----------------------------


    //DB------------------------------


    //APIs----------------------------

    @Override
    public Flowable<FlagApi> countryCode() {
        return apiServiceUtils.countryCode();
    }

    @Override
    public Flowable<LoginDb> userLogin(String userId, String password) {
        return apiService.userLogin(userId, password);
    }

    @Override
    public Flowable<LoginDb> userLoginVendor(String userId, String password) {
        return apiService.userLoginVendor(userId, password);
    }

    @Override
    public Flowable<List<StatusOfApplicationResponse>> statusOfApplicationApi(String applicationId) {
        return apiService.statusOfApplicationApi(applicationId);
    }

    @Override
    public Flowable<List<ViewItem>> viewItemDetailsApi(String applicationId) {
        return apiService.viewItemDetailsApi(applicationId);
    }

}
