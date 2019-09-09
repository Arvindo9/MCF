package com.indtel.template.core.dialogs.deficiencies;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.template.BR;
import com.indtel.template.R;
import com.indtel.template.base.BaseDialog;
import com.indtel.template.core.dialogs.DialogListener;
import com.indtel.template.databinding.DialogDeficienciesBinding;
import com.indtel.template.di.module.ViewModelProviderFactory;

import javax.inject.Inject;

import static com.indtel.template.utils.AppConstants.DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY;
import static com.indtel.template.utils.AppConstants.DEFICIENCY_AFTER_SCRUTINY;

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

    @Inject
    ViewModelProviderFactory factory;
    private DeficienciesViewModel viewModel;
    private DialogDeficienciesBinding binding;
    private DialogListener callBack;

    public static DeficienciesDialog newInstance() {
        DeficienciesDialog fragment = new DeficienciesDialog();
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
        return R.layout.dialog_deficiencies;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public DeficienciesViewModel getViewModel() {
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
                callBack.onSuccessDialogResponse(TAG, DEFICIENCY_AFTER_SCRUTINY);
                break;

            case R.id.deficiencyAfterAssessmentScrutiny:
                if(checked)
                callBack.onSuccessDialogResponse(TAG, DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY);
                break;
        }
    }
}
