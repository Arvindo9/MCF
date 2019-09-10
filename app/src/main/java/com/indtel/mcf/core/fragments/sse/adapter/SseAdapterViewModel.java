package com.indtel.mcf.core.fragments.sse.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.data.model.apis.sse.CaseList;
import com.indtel.mcf.utils.util.General;

import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS;
import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT;

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
public class SseAdapterViewModel {

    public final ObservableField<String> sNo;
    public final ObservableField<String> referenceNo;
    public final ObservableField<String> firmName;
    public final ObservableField<String> itemName;
    public final ObservableField<String> empty1Text;
    public final ObservableField<String> empty2Text;
    public final ObservableField<String> date;
    public final ObservableField<String> status;
    public final ObservableField<String> remark;

    public SseAdapterViewModel(CaseList data, int openInterface, int position) {
        sNo = new ObservableField<>(String.valueOf(position));
        referenceNo = new ObservableField<>(String.valueOf(data.getReferenceId()));
        firmName = new ObservableField<>(data.getFirmName());
        itemName = new ObservableField<>(data.getItemName());
        date = new ObservableField<>(validateDate(data.getDateOfReceiving()));
        status = new ObservableField<>();
        remark = new ObservableField<>();
        empty1Text = new ObservableField<>();
        empty2Text = new ObservableField<>();

        setData(data, openInterface);
    }

    private void setData(CaseList data, int openInterface) {
        switch (openInterface){
            case SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
                itemName.set(data.getTenderNo());
                empty1Text.set(validateDate(data.getTenderDate()));
                empty2Text.set(data.getLetterNo());
                status.set(validateDate(data.getLetterDate()));
                remark.set(data.getRemarkByVendor());
                break;

            case SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                status.set(data.getStatusBySSEVDC());
                remark.set(data.getRemarkByVendor());
                break;

            case SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                itemName.set(data.getItemName());
                status.set(data.getStatusBySSEVDC());
                remark.set(data.getRemarkBySSEVDC());
                break;
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
