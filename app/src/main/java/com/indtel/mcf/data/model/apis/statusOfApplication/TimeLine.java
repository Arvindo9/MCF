package com.indtel.mcf.data.model.apis.statusOfApplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author       : Arvindo Mondal
 * Created on   : 11-09-2019
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
class TimeLine {
    @SerializedName("ReferenceId")
    @Expose
    private Integer referenceId;
    @SerializedName("Stage")
    @Expose
    private String stage;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("DateOfReceiving")
    @Expose
    private String dateOfReceiving;
    @SerializedName("DateOfForwarding")
    @Expose
    private String dateOfForwarding;
    @SerializedName("Remark")
    @Expose
    private Object remark;
    @SerializedName("Status")
    @Expose
    private Object status;
    @SerializedName("DocumentAttachedByUser")
    @Expose
    private String documentAttachedByUser;

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(String dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public String getDateOfForwarding() {
        return dateOfForwarding;
    }

    public void setDateOfForwarding(String dateOfForwarding) {
        this.dateOfForwarding = dateOfForwarding;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getDocumentAttachedByUser() {
        return documentAttachedByUser;
    }

    public void setDocumentAttachedByUser(String documentAttachedByUser) {
        this.documentAttachedByUser = documentAttachedByUser;
    }
}
