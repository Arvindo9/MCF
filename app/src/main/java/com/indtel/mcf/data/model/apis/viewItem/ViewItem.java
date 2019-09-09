package com.indtel.mcf.data.model.apis.viewItem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author       : Arvindo Mondal
 * Created on   : 18-08-2019
 * Email        : arvindo@indtel.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.indtel.in
 */
public class ViewItem {
    @SerializedName("CATEGORY_NAME")
    @Expose
    private String cATEGORYNAME;
    @SerializedName("SUB_CATEGORY_NAME")
    @Expose
    private String sUBCATEGORYNAME;
    @SerializedName("ITEM_NAME")
    @Expose
    private String iTEMNAME;
    @SerializedName("PLNO")
    @Expose
    private String pLNO;
    @SerializedName("DRAWING")
    @Expose
    private String dRAWING;
    @SerializedName("SPECIFICATION_NO")
    @Expose
    private String sPECIFICATIONNO;

    public String getCATEGORYNAME() {
        return cATEGORYNAME;
    }

    public void setCATEGORYNAME(String cATEGORYNAME) {
        this.cATEGORYNAME = cATEGORYNAME;
    }

    public String getSUBCATEGORYNAME() {
        return sUBCATEGORYNAME;
    }

    public void setSUBCATEGORYNAME(String sUBCATEGORYNAME) {
        this.sUBCATEGORYNAME = sUBCATEGORYNAME;
    }

    public String getITEMNAME() {
        return iTEMNAME;
    }

    public void setITEMNAME(String iTEMNAME) {
        this.iTEMNAME = iTEMNAME;
    }

    public String getPLNO() {
        return pLNO;
    }

    public void setPLNO(String pLNO) {
        this.pLNO = pLNO;
    }

    public String getDRAWING() {
        return dRAWING;
    }

    public void setDRAWING(String dRAWING) {
        this.dRAWING = dRAWING;
    }

    public String getSPECIFICATIONNO() {
        return sPECIFICATIONNO;
    }

    public void setSPECIFICATIONNO(String sPECIFICATIONNO) {
        this.sPECIFICATIONNO = sPECIFICATIONNO;
    }
}
