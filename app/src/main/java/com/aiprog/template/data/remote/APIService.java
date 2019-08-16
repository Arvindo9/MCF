package com.aiprog.template.data.remote;


import com.aiprog.template.data.model.apis.flag.FlagApi;
import com.aiprog.template.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.aiprog.template.data.model.db.login.LoginDb;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Author       : Arvindo Mondal
 * Created on   : 23-12-2018
 */
public interface APIService {
    @GET("dating/api/Flag/GetCountryFlag")
    Flowable<FlagApi> countryCode();

/*
    @Multipart
    @POST("abc")
    Flowable<String> mediaUploadApi(
            @Part("Data") RequestBody data,
            @Part MultipartBody.Part file
    );
*/

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/GetUserDetails")
    Flowable<LoginDb> userLogin(
            @Field("UserId") String userId,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/GetUserDetails1")
    Flowable<LoginDb> userLoginVendor(
            @Field("UserId") String userId,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/BindStatus")
    Flowable<List<StatusOfApplicationResponse>> statusOfApplicationApi(
            @Field("id") String userId
    );


}
