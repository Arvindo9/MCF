package com.indtel.mcf.core.fragments.scrutinyOfdocuments.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.utils.util.General;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class ScrutinyOfDocumentAdapterViewModel {
    public final ObservableField<String> sNo;
    public final ObservableField<String> referenceNo;
    public final ObservableField<String> firmName;
    public final ObservableField<String> address;
    public final ObservableField<String> itemName;
    public final ObservableField<String> date;

    public ScrutinyOfDocumentAdapterViewModel(String position, DashboardScrutinyOfDocument data) {
        this.sNo = new ObservableField<>(position);
        this.referenceNo = new ObservableField<>(data.getID().toString());
        this.firmName = new ObservableField<>(data.getNAMEOFFIRM());
        this.address = new ObservableField<>(data.getOFFICEADDRESS());
        this.itemName = new ObservableField<>(data.getITEMNAME());
        this.date = new ObservableField<>(validateDate(data.getDATEOFSUBMISSION()));
    }

    private String validateDate(String date){
        String dataStr = General.standardFormatDate(date);
        if(dataStr != null && dataStr.length() >= 10){
            return dataStr.substring(0, 10);
        }
        return date;
    }
}
