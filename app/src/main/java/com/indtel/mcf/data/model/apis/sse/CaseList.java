package com.indtel.mcf.data.model.apis.sse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author       : Arvindo Mondal
 * Created on   : 10-09-2019
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
public class CaseList {
    @SerializedName("ReferenceId")
    @Expose
    private Integer referenceId;
    @SerializedName("FirmName")
    @Expose
    private String firmName = "";
    @SerializedName("TenderNo")
    @Expose
    private String tenderNo = "";
    @SerializedName("TenderDate")
    @Expose
    private String tenderDate = "";
    @SerializedName("LetterNo")
    @Expose
    private String letterNo = "";
    @SerializedName("LetterDate")
    @Expose
    private String letterDate = "";
    @SerializedName("RemarkByVendor")
    @Expose
    private String remarkByVendor = "";
    @SerializedName("DateOfReceiving")
    @Expose
    private String dateOfReceiving = "";
    @SerializedName("AttachmentByVendor")
    @Expose
    private String attachmentByVendor = "";
    @SerializedName("StatusBySSEVDC")
    @Expose
    private String statusBySSEVDC;
    @SerializedName("AttachmentReport")
    @Expose
    private String attachmentReport;


    @SerializedName("ItemName")
    @Expose
    private String itemName;
    @SerializedName("IsAssessmentRequired")
    @Expose
    private String isAssessmentRequired;
    @SerializedName("StatusByAssessmentOfficer")
    @Expose
    private String statusByAssessmentOfficer;
    @SerializedName("RemarkByAO")
    @Expose
    private String remarkByAO;

    @SerializedName("AssessmentReport")
    @Expose
    private String assessmentReport;

    @SerializedName("RemarkBySSEVDC")
    @Expose
    private String remarkBySSEVDC;








    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getTenderNo() {
        return tenderNo;
    }

    public void setTenderNo(String tenderNo) {
        this.tenderNo = tenderNo;
    }

    public String getTenderDate() {
        return tenderDate;
    }

    public void setTenderDate(String tenderDate) {
        this.tenderDate = tenderDate;
    }

    public String getLetterNo() {
        return letterNo;
    }

    public void setLetterNo(String letterNo) {
        this.letterNo = letterNo;
    }

    public String getLetterDate() {
        return letterDate;
    }

    public void setLetterDate(String letterDate) {
        this.letterDate = letterDate;
    }

    public String getRemarkByVendor() {
        return remarkByVendor;
    }

    public void setRemarkByVendor(String remarkByVendor) {
        this.remarkByVendor = remarkByVendor;
    }

    public String getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(String dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public String getAttachmentByVendor() {
        return attachmentByVendor;
    }

    public void setAttachmentByVendor(String attachmentByVendor) {
        this.attachmentByVendor = attachmentByVendor;
    }

    public String getStatusBySSEVDC() {
        return statusBySSEVDC;
    }

    public void setStatusBySSEVDC(String statusBySSEVDC) {
        this.statusBySSEVDC = statusBySSEVDC;
    }

    public String getAttachmentReport() {
        return attachmentReport;
    }

    public void setAttachmentReport(String attachmentReport) {
        this.attachmentReport = attachmentReport;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getIsAssessmentRequired() {
        return isAssessmentRequired;
    }

    public void setIsAssessmentRequired(String isAssessmentRequired) {
        this.isAssessmentRequired = isAssessmentRequired;
    }

    public String getStatusByAssessmentOfficer() {
        return statusByAssessmentOfficer;
    }

    public void setStatusByAssessmentOfficer(String statusByAssessmentOfficer) {
        this.statusByAssessmentOfficer = statusByAssessmentOfficer;
    }

    public String getRemarkByAO() {
        return remarkByAO;
    }

    public void setRemarkByAO(String remarkByAO) {
        this.remarkByAO = remarkByAO;
    }

    public String getAssessmentReport() {
        return assessmentReport;
    }

    public void setAssessmentReport(String assessmentReport) {
        this.assessmentReport = assessmentReport;
    }

    public String getRemarkBySSEVDC() {
        return remarkBySSEVDC;
    }

    public void setRemarkBySSEVDC(String remarkBySSEVDC) {
        this.remarkBySSEVDC = remarkBySSEVDC;
    }
}
