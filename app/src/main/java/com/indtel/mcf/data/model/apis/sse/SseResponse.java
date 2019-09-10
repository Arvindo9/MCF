package com.indtel.mcf.data.model.apis.sse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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
public class SseResponse {
    @SerializedName("TotalCases")
    @Expose
    private Integer totalCases;
    @SerializedName("CaseList")
    @Expose
    private List<CaseList> caseList = null;

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public List<CaseList> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<CaseList> caseList) {
        this.caseList = caseList;
    }
}
