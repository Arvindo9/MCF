package com.indtel.mcf.core.dialogs.deficiencies;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.base.BaseDialog;
import com.indtel.mcf.core.dialogs.DialogListener;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;
import com.indtel.mcf.utils.AppConstants;
import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.DialogDeficienciesBinding;

import javax.inject.Inject;

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
public class DeficienciesDialog extends BaseDialog<DialogDeficienciesBinding, DeficienciesViewModel>
        implements DeficienciesNavigator{
    public static final String TAG = DeficienciesDialog.class.getSimpleName();
    private static final String KEY_TYPE = "KEY_TYPE";


    public static final String TYPE_VENDOR = "Vendor";
    public static final String TYPE_SSE = "SSE";

    @Inject
    ViewModelProviderFactory factory;
    private DeficienciesViewModel viewModel;
    private DialogDeficienciesBinding binding;
    private DialogListener callBack;
    private String type = TYPE_VENDOR;

    public static DeficienciesDialog newInstance(String type) {
        DeficienciesDialog fragment = new DeficienciesDialog();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TYPE, type);
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
        return R.layout.dialog_deficiencies;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public DeficienciesViewModel getViewModel() {
        type = getArguments()!=null ? getArguments().getString(KEY_TYPE):"";
        return viewModel = ViewModelProviders.of(this,factory).get(DeficienciesViewModel.class);
    }

    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    @Override
    public int getBindingVariable() {
        return BR.data;
    }

    /**
     * @param binding activity class data binding
     */
    @Override
    public void getActivityBinding(DialogDeficienciesBinding binding) {
        this.binding = binding;
    }

    /**
     * Do anything on onCreateView after binding
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);

        setUp();
    }

    private void setUp() {
        if(type.equals(TYPE_SSE)){
            binding.deficiencyAfterScrutiny.setText(R.string.cases_for_scrutiny_doc);
            binding.deficiencyAfterAssessmentScrutiny.setText(R.string.cases_for_assessment_report);
            binding.title.setText(R.string.vendor_replied_cases);
        }
    }

    //Navigator-----------------------

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
            case R.id.deficiencyAfterScrutiny:
                if(checked)
                callBack.onSuccessDialogResponse(TAG, AppConstants.DEFICIENCY_AFTER_SCRUTINY);
                break;

            case R.id.deficiencyAfterAssessmentScrutiny:
                if(checked)
                callBack.onSuccessDialogResponse(TAG, AppConstants.DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY);
                break;
        }
        dismiss();
    }
}
