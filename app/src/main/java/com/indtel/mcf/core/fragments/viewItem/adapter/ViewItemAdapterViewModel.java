package com.indtel.mcf.core.fragments.viewItem.adapter;

import androidx.databinding.ObservableField;

import com.indtel.mcf.data.model.apis.viewItem.ViewItem;

/**
 * Author       : Arvindo Mondal
 * Created on   : 18-08-2019
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
public class ViewItemAdapterViewModel {
    public final ObservableField<String> sNo;
    public final ObservableField<String> category;
    public final ObservableField<String> subCategory;
    public final ObservableField<String> itemName;
    public final ObservableField<String> plNo;
    public final ObservableField<String> drawingNo;
    public final ObservableField<String> specificationNo;

    public ViewItemAdapterViewModel(String position, ViewItem data) {
        sNo = new ObservableField<>(position);
        category = new ObservableField<>(data.getCATEGORYNAME());
        subCategory = new ObservableField<>(data.getSUBCATEGORYNAME());
        itemName = new ObservableField<>(data.getITEMNAME());
        plNo = new ObservableField<>(data.getPLNO());
        drawingNo = new ObservableField<>(data.getDRAWING());
        specificationNo = new ObservableField<>(data.getSPECIFICATIONNO());
    }
}
