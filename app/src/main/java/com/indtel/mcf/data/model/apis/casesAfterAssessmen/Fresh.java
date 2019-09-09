package com.indtel.mcf.data.model.apis.casesAfterAssessmen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class Fresh {

    @SerializedName("ID")
    @Expose
    private Double iD;
    @SerializedName("NAMEOFFIRM")
    @Expose
    private String nAMEOFFIRM;
    @SerializedName("ITEM_NAME")
    @Expose
    private String iTEMNAME;
    @SerializedName("STATUS_OF_ASSESSMENT")
    @Expose
    private String sTATUSOFASSESSMENT;
    @SerializedName("REMARK_BY_ASSESSMENT_OFFICER")
    @Expose
    private String rEMARKBYASSESSMENTOFFICER;
    @SerializedName("DATE_OF_REMARK_OF_ASSESSMENT")
    @Expose
    private String dATEOFREMARKOFASSESSMENT;
    @SerializedName("SSE_ID")
    @Expose
    private Double sSEID;
    @SerializedName("IS_ASSESSMENT_RERQUIRED")
    @Expose
    private String iSASSESSMENTRERQUIRED;
    @SerializedName("DATE_OF_REMARK_OF_SSE_ON_ASSESSMENT")
    @Expose
    private Object dATEOFREMARKOFSSEONASSESSMENT;
    @SerializedName("REVERT_SSE_ASSESSMENT")
    @Expose
    private Object rEVERTSSEASSESSMENT;
    @SerializedName("AME_ID")
    @Expose
    private Double aMEID;

    public Double getID() {
        return iD;
    }

    public void setID(Double iD) {
        this.iD = iD;
    }

    public String getNAMEOFFIRM() {
        return nAMEOFFIRM;
    }

    public void setNAMEOFFIRM(String nAMEOFFIRM) {
        this.nAMEOFFIRM = nAMEOFFIRM;
    }

    public String getITEMNAME() {
        return iTEMNAME;
    }

    public void setITEMNAME(String iTEMNAME) {
        this.iTEMNAME = iTEMNAME;
    }

    public String getSTATUSOFASSESSMENT() {
        return sTATUSOFASSESSMENT;
    }

    public void setSTATUSOFASSESSMENT(String sTATUSOFASSESSMENT) {
        this.sTATUSOFASSESSMENT = sTATUSOFASSESSMENT;
    }

    public String getREMARKBYASSESSMENTOFFICER() {
        return rEMARKBYASSESSMENTOFFICER;
    }

    public void setREMARKBYASSESSMENTOFFICER(String rEMARKBYASSESSMENTOFFICER) {
        this.rEMARKBYASSESSMENTOFFICER = rEMARKBYASSESSMENTOFFICER;
    }

    public String getDATEOFREMARKOFASSESSMENT() {
        return dATEOFREMARKOFASSESSMENT;
    }

    public void setDATEOFREMARKOFASSESSMENT(String dATEOFREMARKOFASSESSMENT) {
        this.dATEOFREMARKOFASSESSMENT = dATEOFREMARKOFASSESSMENT;
    }

    public Double getSSEID() {
        return sSEID;
    }

    public void setSSEID(Double sSEID) {
        this.sSEID = sSEID;
    }

    public String getISASSESSMENTRERQUIRED() {
        return iSASSESSMENTRERQUIRED;
    }

    public void setISASSESSMENTRERQUIRED(String iSASSESSMENTRERQUIRED) {
        this.iSASSESSMENTRERQUIRED = iSASSESSMENTRERQUIRED;
    }

    public Object getDATEOFREMARKOFSSEONASSESSMENT() {
        return dATEOFREMARKOFSSEONASSESSMENT;
    }

    public void setDATEOFREMARKOFSSEONASSESSMENT(Object dATEOFREMARKOFSSEONASSESSMENT) {
        this.dATEOFREMARKOFSSEONASSESSMENT = dATEOFREMARKOFSSEONASSESSMENT;
    }

    public Object getREVERTSSEASSESSMENT() {
        return rEVERTSSEASSESSMENT;
    }

    public void setREVERTSSEASSESSMENT(Object rEVERTSSEASSESSMENT) {
        this.rEVERTSSEASSESSMENT = rEVERTSSEASSESSMENT;
    }

    public Double getAMEID() {
        return aMEID;
    }

    public void setAMEID(Double aMEID) {
        this.aMEID = aMEID;
    }
}
