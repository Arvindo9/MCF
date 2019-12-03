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
    @SerializedName(value = "ReferenceId", alternate = "ID")
    @Expose
    private Integer referenceId;
    @SerializedName(value = "FirmName", alternate = "NAMEOFFIRM")
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
    @SerializedName("ATTACHMENT_TO_VENDOR")
    @Expose
    private String ATTACHMENT_TO_VENDOR = "";
    @SerializedName("StatusBySSEVDC")
    @Expose
    private String statusBySSEVDC = "";
    @SerializedName("AttachmentReport")
    @Expose
    private String attachmentReport = "";


    @SerializedName(value = "ItemName", alternate = "ITEM_NAME")
    @Expose
    private String itemName = "";
    @SerializedName("IsAssessmentRequired")
    @Expose
    private String isAssessmentRequired = "";
    @SerializedName("StatusByAssessmentOfficer")
    @Expose
    private String statusByAssessmentOfficer = "";
    @SerializedName("RemarkByAO")
    @Expose
    private String remarkByAO = "";
    @SerializedName("REMARK_OF_DYCME")
    @Expose
    private String REMARK_OF_DYCME = "";

    @SerializedName("AssessmentReport")
    @Expose
    private String assessmentReport = "";

    @SerializedName("RemarkBySSEVDC")
    @Expose
    private String remarkBySSEVDC = "";
    @SerializedName("DATE_OF_SUBMISSION")
    @Expose
    private String DATE_OF_SUBMISSION = "";
    @SerializedName("AO_NAME")
    @Expose
    private String AO_NAME = "";
    @SerializedName("RECOMMENDED_AO_NAME")
    @Expose
    private String RECOMMENDED_AO_NAME = "";








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






    @SerializedName("DATE_OF_REMARK_BY_DYCME")
    @Expose
    private String DATE_OF_REMARK_BY_DYCME = "";
    @SerializedName("REMARK_OF_SCRUTINY")
    @Expose
    private String rEMARKOFSCRUTINY = "";
    @SerializedName("ATTACHMENT_OF_SCRUTINY")
    @Expose
    private String aTTACHMENTOFSCRUTINY = "";
    @SerializedName("DATE_OF_SCRUTINY")
    @Expose
    private String dATEOFSCRUTINY = "";
    @SerializedName("REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String rEMARK_BY_AME_ON_RECOMMENDATION = "";

    public String getrEMARKOFSCRUTINY() {
        return rEMARKOFSCRUTINY;
    }

    public void setrEMARKOFSCRUTINY(String rEMARKOFSCRUTINY) {
        this.rEMARKOFSCRUTINY = rEMARKOFSCRUTINY;
    }

    public String getdATEOFSCRUTINY() {
        return dATEOFSCRUTINY;
    }

    public void setdATEOFSCRUTINY(String dATEOFSCRUTINY) {
        this.dATEOFSCRUTINY = dATEOFSCRUTINY;
    }







    @SerializedName("VERIFICATION_REMARK_BY_DYCME")
    @Expose
    private String VERIFICATION_REMARK_BY_DYCME = "";
    @SerializedName("STATUS_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String STATUS_OF_VERIFICATION_BY_DYCME = "";
    @SerializedName("STATUS_OF_ASSESSMENT_REPORT_SSE")
    @Expose
    private String sTATUSOFASSESSMENTREPORTSSE = "";
    @SerializedName("REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String rEMARKOFSSEONASSESSMENT = "";
    @SerializedName("DATE_OF_REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFSSEONASSESSMENT = "";
    @SerializedName("ATTACHMENT_OF_ASSESSMENT_REPORT")
    @Expose
    private String aTTACHMENTOFASSESSMENTREPORT = "";
    @SerializedName("DATE_OF_REMARK_ON_ASSESSMENT_BY_AME")
    @Expose
    private String dATEOFREMARKONASSESSMENTBYAME = "";
    @SerializedName("DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION")
    @Expose
    private String DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION = "";
    @SerializedName("DATE_OF_VERIFICATION_BY_DYCME")
    @Expose
    private String DATE_OF_VERIFICATION_BY_DYCME = "";
    @SerializedName("AME_ID")
    @Expose
    private Double aMEID;
    @SerializedName("IS_ASSESSMENT_RERQUIRED")
    @Expose
    private String iSASSESSMENTRERQUIRED = "";
    @SerializedName("REVERT_AME_ASSESSMENT")
    @Expose
    private String rEVERTAMEASSESSMENT = "";
    @SerializedName("DATE_OF_REMARK_OF_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFASSESSMENT = "";

    @SerializedName("PROBABLE_DATE_OF_VISIT")
    @Expose
    private String PROBABLE_DATE_OF_VISIT = "";
    @SerializedName("SCRUTINY_STATUS_OF_ASSESSMENT_REPORT")
    @Expose
    private String SCRUTINY_STATUS_OF_ASSESSMENT_REPORT = "";
    @SerializedName("REVERT_SSE_ASSESSMENT")
    @Expose
    private String REVERT_SSE_ASSESSMENT = "";

    public String getSTATUSOFASSESSMENTREPORTSSE() {
        return sTATUSOFASSESSMENTREPORTSSE;
    }

    public void setSTATUSOFASSESSMENTREPORTSSE(String sTATUSOFASSESSMENTREPORTSSE) {
        this.sTATUSOFASSESSMENTREPORTSSE = sTATUSOFASSESSMENTREPORTSSE;
    }

    public String getREMARKOFSSEONASSESSMENT() {
        return rEMARKOFSSEONASSESSMENT;
    }

    public void setREMARKOFSSEONASSESSMENT(String rEMARKOFSSEONASSESSMENT) {
        this.rEMARKOFSSEONASSESSMENT = rEMARKOFSSEONASSESSMENT;
    }

    public String getDATEOFREMARKOFSSEONASSESSMENT() {
        return dATEOFREMARKOFSSEONASSESSMENT;
    }

    public void setDATEOFREMARKOFSSEONASSESSMENT(String dATEOFREMARKOFSSEONASSESSMENT) {
        this.dATEOFREMARKOFSSEONASSESSMENT = dATEOFREMARKOFSSEONASSESSMENT;
    }

    public String getATTACHMENTOFASSESSMENTREPORT() {
        return aTTACHMENTOFASSESSMENTREPORT;
    }

    public void setATTACHMENTOFASSESSMENTREPORT(String aTTACHMENTOFASSESSMENTREPORT) {
        this.aTTACHMENTOFASSESSMENTREPORT = aTTACHMENTOFASSESSMENTREPORT;
    }

    public String getDATEOFREMARKONASSESSMENTBYAME() {
        return dATEOFREMARKONASSESSMENTBYAME;
    }

    public void setDATEOFREMARKONASSESSMENTBYAME(String dATEOFREMARKONASSESSMENTBYAME) {
        this.dATEOFREMARKONASSESSMENTBYAME = dATEOFREMARKONASSESSMENTBYAME;
    }

    public Double getAMEID() {
        return aMEID;
    }

    public void setAMEID(Double aMEID) {
        this.aMEID = aMEID;
    }

    public String getISASSESSMENTRERQUIRED() {
        return iSASSESSMENTRERQUIRED;
    }

    public void setISASSESSMENTRERQUIRED(String iSASSESSMENTRERQUIRED) {
        this.iSASSESSMENTRERQUIRED = iSASSESSMENTRERQUIRED;
    }

    public String getREVERTAMEASSESSMENT() {
        return rEVERTAMEASSESSMENT;
    }

    public void setREVERTAMEASSESSMENT(String rEVERTAMEASSESSMENT) {
        this.rEVERTAMEASSESSMENT = rEVERTAMEASSESSMENT;
    }

    public String getDATEOFREMARKOFASSESSMENT() {
        return dATEOFREMARKOFASSESSMENT;
    }

    public void setDATEOFREMARKOFASSESSMENT(String dATEOFREMARKOFASSESSMENT) {
        this.dATEOFREMARKOFASSESSMENT = dATEOFREMARKOFASSESSMENT;
    }

    public String getrEMARK_BY_AME_ON_RECOMMENDATION() {
        return rEMARK_BY_AME_ON_RECOMMENDATION;
    }

    public void setrEMARK_BY_AME_ON_RECOMMENDATION(String rEMARK_BY_AME_ON_RECOMMENDATION) {
        this.rEMARK_BY_AME_ON_RECOMMENDATION = rEMARK_BY_AME_ON_RECOMMENDATION;
    }

    public String getREMARK_OF_DYCME() {
        return REMARK_OF_DYCME;
    }

    public void setREMARK_OF_DYCME(String REMARK_OF_DYCME) {
        this.REMARK_OF_DYCME = REMARK_OF_DYCME;
    }

    public String getDATE_OF_SUBMISSION() {
        return DATE_OF_SUBMISSION;
    }

    public void setDATE_OF_SUBMISSION(String DATE_OF_SUBMISSION) {
        this.DATE_OF_SUBMISSION = DATE_OF_SUBMISSION;
    }

    public String getPROBABLE_DATE_OF_VISIT() {
        return PROBABLE_DATE_OF_VISIT;
    }

    public void setPROBABLE_DATE_OF_VISIT(String PROBABLE_DATE_OF_VISIT) {
        this.PROBABLE_DATE_OF_VISIT = PROBABLE_DATE_OF_VISIT;
    }

    public String getaTTACHMENTOFSCRUTINY() {
        return aTTACHMENTOFSCRUTINY;
    }

    public void setaTTACHMENTOFSCRUTINY(String aTTACHMENTOFSCRUTINY) {
        this.aTTACHMENTOFSCRUTINY = aTTACHMENTOFSCRUTINY;
    }

    public String getATTACHMENT_TO_VENDOR() {
        return ATTACHMENT_TO_VENDOR;
    }

    public void setATTACHMENT_TO_VENDOR(String ATTACHMENT_TO_VENDOR) {
        this.ATTACHMENT_TO_VENDOR = ATTACHMENT_TO_VENDOR;
    }

    public String getSTATUS_OF_VERIFICATION_BY_DYCME() {
        return STATUS_OF_VERIFICATION_BY_DYCME;
    }

    public void setSTATUS_OF_VERIFICATION_BY_DYCME(String STATUS_OF_VERIFICATION_BY_DYCME) {
        this.STATUS_OF_VERIFICATION_BY_DYCME = STATUS_OF_VERIFICATION_BY_DYCME;
    }

    public String getVERIFICATION_REMARK_BY_DYCME() {
        return VERIFICATION_REMARK_BY_DYCME;
    }

    public void setVERIFICATION_REMARK_BY_DYCME(String VERIFICATION_REMARK_BY_DYCME) {
        this.VERIFICATION_REMARK_BY_DYCME = VERIFICATION_REMARK_BY_DYCME;
    }

    public String getDATE_OF_VERIFICATION_BY_DYCME() {
        return DATE_OF_VERIFICATION_BY_DYCME;
    }

    public void setDATE_OF_VERIFICATION_BY_DYCME(String DATE_OF_VERIFICATION_BY_DYCME) {
        this.DATE_OF_VERIFICATION_BY_DYCME = DATE_OF_VERIFICATION_BY_DYCME;
    }

    public String getSCRUTINY_STATUS_OF_ASSESSMENT_REPORT() {
        return SCRUTINY_STATUS_OF_ASSESSMENT_REPORT;
    }

    public void setSCRUTINY_STATUS_OF_ASSESSMENT_REPORT(String SCRUTINY_STATUS_OF_ASSESSMENT_REPORT) {
        this.SCRUTINY_STATUS_OF_ASSESSMENT_REPORT = SCRUTINY_STATUS_OF_ASSESSMENT_REPORT;
    }

    public String getREVERT_SSE_ASSESSMENT() {
        return REVERT_SSE_ASSESSMENT;
    }

    public void setREVERT_SSE_ASSESSMENT(String REVERT_SSE_ASSESSMENT) {
        this.REVERT_SSE_ASSESSMENT = REVERT_SSE_ASSESSMENT;
    }

    public String getAO_NAME() {
        return AO_NAME;
    }

    public void setAO_NAME(String AO_NAME) {
        this.AO_NAME = AO_NAME;
    }

    public String getRECOMMENDED_AO_NAME() {
        return RECOMMENDED_AO_NAME;
    }

    public void setRECOMMENDED_AO_NAME(String RECOMMENDED_AO_NAME) {
        this.RECOMMENDED_AO_NAME = RECOMMENDED_AO_NAME;
    }

    public String getDATE_OF_REMARK_BY_AME_ON_RECOMMENDATION() {
        return DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION;
    }

    public void setDATE_OF_REMARK_BY_AME_ON_RECOMMENDATION(String DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION) {
        this.DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION = DATE_OF_REMARK_BY_AME_ON_RECOMMENDATION;
    }

    public String getDATE_OF_REMARK_BY_DYCME() {
        return DATE_OF_REMARK_BY_DYCME;
    }

    public void setDATE_OF_REMARK_BY_DYCME(String DATE_OF_REMARK_BY_DYCME) {
        this.DATE_OF_REMARK_BY_DYCME = DATE_OF_REMARK_BY_DYCME;
    }
}
