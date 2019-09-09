package com.indtel.mcf.data.remote;


import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.data.model.apis.casesAfterAssessmen.CasesAfterAssessment;
import com.indtel.mcf.data.model.apis.flag.FlagApi;
import com.indtel.mcf.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.mcf.data.model.apis.viewItem.ViewItem;
import com.indtel.mcf.data.model.db.login.LoginDb;


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
            @Field("id") String applicationId
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/ViewItemDetails")
    Flowable<List<ViewItem>> viewItemDetailsApi(
            @Field("ApplicationId") String applicationId
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/sseWiseDashobard ")
    Flowable<List<Dashboard>> dashboardData(
            @Field("userid") String referenceCode
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/BindDashboard ")
    Flowable<List<DashboardScrutinyOfDocument>> dashboardScrutinyOfDocuments(
            @Field("id") String id
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/BindSSEAssessment ")
    Flowable<List<CasesAfterAssessment>> casesAfterAssessmentFresh(
            @Field("id") String id
    );

    @FormUrlEncoded
    @POST("/mcf_vr/DataService.asmx/BindSSEAssessmentRevertAME ")
    Flowable<List<CasesAfterAssessment>> casesAfterAssessmentReverted(
            @Field("id") String id
    );


}
