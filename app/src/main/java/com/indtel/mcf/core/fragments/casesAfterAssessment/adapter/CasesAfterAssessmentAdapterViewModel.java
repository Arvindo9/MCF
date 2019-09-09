package com.indtel.mcf.core.fragments.casesAfterAssessment.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.utils.util.General;
import com.indtel.mcf.data.model.apis.casesAfterAssessmen.CasesAfterAssessment;

import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.CASES_AFTER_ASSESSMENT_FRESH;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class CasesAfterAssessmentAdapterViewModel {
    public final ObservableField<String> sNo;
    public final ObservableField<String> referenceNo;
    public final ObservableField<String> firmName;
    public final ObservableField<String> address;
    public final ObservableField<String> itemName;
    public final ObservableField<String> assessmentRequired;
    public final ObservableField<String> status;
    public final ObservableField<String> remark;
    public final ObservableField<String> date;

    public CasesAfterAssessmentAdapterViewModel(String position, CasesAfterAssessment data, int openInterface) {
        this.sNo = new ObservableField<>(position);
        this.referenceNo = new ObservableField<>(data.getiD().toString());
        this.firmName = new ObservableField<>(data.getnAMEOFFIRM());
        this.address = new ObservableField<>(data.getoFFICEADDRESS());
        this.itemName = new ObservableField<>(data.getiTEMNAME());
        this.assessmentRequired = new ObservableField<>(data.getiSASSESSMENTRERQUIRED());
        this.date = new ObservableField<>(validateDate(data.getdATEOFREMARKOFASSESSMENT()));


        if(openInterface == CASES_AFTER_ASSESSMENT_FRESH) {
            this.status = new ObservableField<>(data.getsTATUSOFASSESSMENT());
            this.remark = new ObservableField<>(data.getrEMARKBYASSESSMENTOFFICER());
        }
        else{
            this.status = new ObservableField<>(data.getrEMARKONASSESSMENTBYAME());
            this.remark = new ObservableField<>(data.getsCRUTINYSTATUSOFASSESSMENTREPORT());
        }
    }

    private String validateDate(String date){
        String dataStr = General.standardFormatDate(date);
        if(dataStr != null && dataStr.length() >= 10){
            return dataStr.substring(0, 10);
        }
        return date;
    }
}
