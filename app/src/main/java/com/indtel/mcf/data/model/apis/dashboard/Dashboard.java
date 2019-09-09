package com.indtel.mcf.data.model.apis.dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/23/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class Dashboard {
    @SerializedName("STAGE")
    @Expose
    private String sTAGE;
    @SerializedName("TotalCases")
    @Expose
    private String totalCases;
    @SerializedName("SrNo")
    @Expose
    private String srNo;
    @SerializedName("ID")
    @Expose
    private String iD;

    public String getSTAGE() {
        return sTAGE;
    }

    public void setSTAGE(String sTAGE) {
        this.sTAGE = sTAGE;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }
}
