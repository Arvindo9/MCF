package com.indtel.mcf.core.dialogs.vendorWise;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseDialog;
import com.indtel.mcf.core.dialogs.DialogListener;
import com.indtel.mcf.data.model.apis.firmName.FirmName;
import com.indtel.mcf.di.module.ViewModelProviderFactory;
import com.indtel.mcf.utils.AppConstants;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.DialogVendorWiseBinding;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 22-08-2019
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
public class VendorWiseDialog extends BaseDialog<DialogVendorWiseBinding, VendorWiseViewModel>
        implements VendorWiseNavigator{
    public static final String TAG = VendorWiseDialog.class.getSimpleName();

    @Inject
    ViewModelProviderFactory factory;
    private VendorWiseViewModel viewModel;
    private DialogVendorWiseBinding binding;
    private DialogListener callBack;
    private String selectionRadio = "";
    private HashMap<String, Integer> map;

    public static VendorWiseDialog newInstance() {
        VendorWiseDialog fragment = new VendorWiseDialog();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    public void setCallBack(DialogListener callBack){
        this.callBack = callBack;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    protected int getLayout() {
        return R.layout.dialog_vendor_wise;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public VendorWiseViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(VendorWiseViewModel.class);
    }

    /**
     * Override for set binding variable
     *
     * @return BR.data;
     */
    @Override
    public int getBindingVariable() {
        return BR.data;
    }

    /**
     * @param binding activity class data binding
     */
    @Override
    public void getActivityBinding(DialogVendorWiseBinding binding) {
        this.binding = binding;
    }

    /**
     * Do anything on onCreateView after binding
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);
        setUp();
//        setUpSpinner();
    }

/*
    private void setUpSpinner() {
        binding.firmNameAuto.setOnItemClickListener((parent, view, position, id) -> {

            String key = binding.firmNameAuto.getText().toString();
//            String idTb = hashMap.get(key);

            Log.e("Text", key);
//            Log.e("idcc", idTb);
        });
    }
*/

    private void setUp() {
        map = new HashMap<>();
        binding.caseInProgress.setChecked(true);
        selectionRadio = AppConstants.CASE_IN_PROGRESS;
        viewModel.onProcessListOfVendors();
//        viewModel.onApprovedVendorList();
//        viewModel.onClosedVendorList();
    }

    //Navigator-----------------------

    @Override
    public void onSpinnerDataLoad(String[] strings, List<FirmName> response) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getBaseActivity(),
                android.R.layout.simple_spinner_dropdown_item, strings);

        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        binding.firmNameAuto.setAdapter(adapter);
//        binding.firmNameAuto.setOnItemSelectedListener(this);
        adapter.notifyDataSetChanged();


        map.clear();
        for (FirmName data: response) {
            map.put(data.getNameOfFirm(), data.getReferenceId());
        }
    }

    @Override
    public void handleError(Throwable throwable) {

    }

    @Override
    public void handleMessage(String message) {

    }

    @Override
    public void handleMessage(int index) {

    }

    @Override
    public void onCancelClick() {
        dismiss();
    }

    @Override
    public void onSelectionClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.caseInProgress:
                if(checked) {
                    viewModel.onProcessListOfVendors();
                    selectionRadio = AppConstants.CASE_IN_PROGRESS;
                    binding.firmNameAuto.setText("");
                }
                break;

            case R.id.approved:
                if(checked) {
                    viewModel.onApprovedVendorList();
                    selectionRadio = AppConstants.APPROVED;
                    binding.firmNameAuto.setText("");
                }
                break;

            case R.id.closed:
                if(checked) {
                    viewModel.onClosedVendorList();
                    selectionRadio = AppConstants.CLOSED;
                    binding.firmNameAuto.setText("");
                }
                break;
        }
    }

    @Override
    public void onProceedClick() {
        if(selectionRadio.isEmpty()){
            return;
        }

        if(binding.firmNameAuto.getText() != null && binding.firmNameAuto.getText().toString().equals("")){
            return;
        }

        Integer id = map.get(binding.firmNameAuto.getText().toString());

        callBack.onSuccessDialogResponse(TAG, selectionRadio, String.valueOf(id));
    }
}
