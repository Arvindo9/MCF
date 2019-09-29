package com.indtel.mcf.core.dialogs.cases;

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
import com.indtel.mcf.databinding.DialogCasesBinding;

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
public class CasesDialog extends BaseDialog<DialogCasesBinding, CasesViewModel> implements CasesNavigator {
    public static final String TAG = CasesDialog.class.getSimpleName();

    @Inject
    ViewModelProviderFactory factory;
    private CasesViewModel viewModel;
    private DialogCasesBinding binding;
    private DialogListener callBack;

    public static CasesDialog newInstance() {
        CasesDialog fragment = new CasesDialog();
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
        return R.layout.dialog_cases;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public CasesViewModel getViewModel() {
        return viewModel = ViewModelProviders.of(this,factory).get(CasesViewModel.class);
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
    public void getActivityBinding(DialogCasesBinding binding) {
        this.binding = binding;
    }

    /**
     * Do anything on onCreateView after binding
     */
    @Override
    protected void init() {
        viewModel.setNavigator(this);
    }

    //Navigator------------------------

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
            case R.id.freshCases:
                if(checked)
                    callBack.onSuccessDialogResponse(TAG, AppConstants.FRESH_CASES);
                break;

            case R.id.casesRevertedByAmeVdc:
                if(checked)
                    callBack.onSuccessDialogResponse(TAG, AppConstants.CASES_REVERTED_BY_AME_VDC);
                break;
        }
        dismiss();
    }
}
