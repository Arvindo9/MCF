package com.indtel.mcf.core.fragments.dashboard.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.utils.util.General;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/23/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class DashboardAdapterViewModel {

    public final ObservableField<String> sNo;
    public final ObservableField<String> totalCases;
    public final ObservableField<String> stage;

    public DashboardAdapterViewModel(String position, Dashboard data) {
        this.sNo = new ObservableField<>(position);
        this.totalCases = new ObservableField<>(data.getTotalCases());
        this.stage = new ObservableField<>(data.getSTAGE());
    }

    private String validateDate(String date){
        String dataStr = General.standardFormatDate(date);
        if(dataStr != null && dataStr.length() >= 10){
            return dataStr.substring(0, 10);
        }
        return date;
    }
}
