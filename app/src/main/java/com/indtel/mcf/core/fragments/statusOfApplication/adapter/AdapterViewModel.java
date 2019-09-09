package com.indtel.mcf.core.fragments.statusOfApplication.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.indtel.mcf.utils.util.General;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
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
public class AdapterViewModel {
    public final ObservableField<String> sNo;
    public final ObservableField<String> referenceNo;
    public final ObservableField<String> firmName;
    public final ObservableField<String> stage;
    public final ObservableField<String> date;

    public AdapterViewModel(String position, StatusOfApplicationResponse data) {
        this.sNo = new ObservableField<>(position);
        this.referenceNo = new ObservableField<>(data.getID().toString());
        this.firmName = new ObservableField<>(data.getNAMEOFFIRM());
        this.stage = new ObservableField<>(data.getSTAGE());
        this.date = new ObservableField<>(validateDate(data.getDATEOFACCEPTANCEREJECTIONLETTER()));
    }

    private String validateDate(String date){
        String dataStr = General.standardFormatDate(date);
        if(dataStr != null && dataStr.length() >= 10){
            return dataStr.substring(0, 10);
        }
        return date;
    }
}
