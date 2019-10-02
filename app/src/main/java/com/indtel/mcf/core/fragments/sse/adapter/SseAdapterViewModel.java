package com.indtel.mcf.core.fragments.sse.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.data.model.apis.sse.CaseList;
import com.indtel.mcf.utils.util.General;

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
    public final ObservableField<String> attachmentText;

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
        attachmentText = new ObservableField<>();

        setData(data, openInterface);
    }

    private void setData(CaseList data, int openInterface) {
        switch (openInterface){
            case FragmentHandlerActivity.SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
                itemName.set(data.getTenderNo());
                empty1Text.set(validateDate(data.getTenderDate()));
                empty2Text.set(data.getLetterNo());
                status.set(validateDate(data.getLetterDate()));
                remark.set(data.getRemarkByVendor());
                break;

            case FragmentHandlerActivity.SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                status.set(data.getStatusBySSEVDC());
                remark.set(data.getRemarkByVendor());
                break;

            case FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                itemName.set(data.getItemName());
                status.set(data.getStatusBySSEVDC());
                remark.set(data.getRemarkBySSEVDC());
                break;

            case FragmentHandlerActivity.CASES_FOR_RECOMMENDATION:
                empty1Text.set(data.getrECOMMENDEDAONAME());
                empty2Text.set(data.getrEMARKOFSCRUTINY());
                date.set(validateDate(data.getdATEOFSCRUTINY()));

                //download ATTACHMENT_OF_SCRUTINY
                //text Attachment by SSE
                break;

            case FragmentHandlerActivity.CASES_FOR_SCRUTINY_FRESH_CASES:
                empty1Text.set(data.getISASSESSMENTRERQUIRED());
                status.set(data.getSTATUSOFASSESSMENTREPORTSSE());
                remark.set(data.getREMARKOFSSEONASSESSMENT());
                date.set(validateDate(data.getDATEOFREMARKOFSSEONASSESSMENT()));

                //download ATTACHMENT_OF_ASSESSMENT_REPORT
                //text Initial Scutiny Report
                break;

            case FragmentHandlerActivity.CASES_FOR_NOMINATIONS:
                remark.set(data.getrEMARK_BY_AME_ON_RECOMMENDATION());
                date.set(validateDate(data.getdATEOFSCRUTINY()));

                //download ATTACHMENT_OF_SCRUTINY
                //text Attachment by SSE
                break;

            case FragmentHandlerActivity.CASES_FOR_ASSESSMENT:
                remark.set(data.getREMARK_OF_DYCME());
                date.set(validateDate(data.getDATE_OF_SUBMISSION()));
                empty1Text.set(validateDate(data.getPROBABLE_DATE_OF_VISIT()));

                //no attachment
                break;

            case FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY:
                status.set(data.getSTATUSOFASSESSMENTREPORTSSE());
                remark.set(data.getREMARKOFSSEONASSESSMENT());
                date.set(validateDate(data.getDATE_OF_SUBMISSION()));
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
