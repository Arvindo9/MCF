package com.indtel.mcf.core.dialogs.caseDefault;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.lifecycle.ViewModelProviders;

import com.indtel.mcf.BR;
import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseDialog;
import com.indtel.mcf.core.dialogs.DialogListener;
import com.indtel.mcf.core.dialogs.cases.CasesDialog;
import com.indtel.mcf.core.dialogs.cases.CasesViewModel;
import com.indtel.mcf.databinding.DialogCaseDefaultBinding;
import com.indtel.mcf.databinding.DialogCasesBinding;
import com.indtel.mcf.di.builder.ViewModelProviderFactory;
import com.indtel.mcf.ui.home.ame.AmeHomeActivity;
import com.indtel.mcf.ui.home.cple.CpleHomeActivity;
import com.indtel.mcf.ui.home.dycme.DyCmeHomeActivity;
import com.indtel.mcf.utils.AppConstants;

import javax.inject.Inject;

/**
 * Author       : Arvindo Mondal
 * Created on   : 30-09-2019
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
public class CaseDefaultDialog extends BaseDialog<DialogCaseDefaultBinding, CaseDefaultViewModel>
        implements CaseDefaultNavigator{
    public static final String TAG = CaseDefaultDialog.class.getSimpleName();
    private static final String KEY_TAG = "KEY_TAG";
    private static final String KEY_TYPE = "KEY_TYPE";


    @Inject
    ViewModelProviderFactory factory;
    private CaseDefaultViewModel viewModel;
    private DialogCaseDefaultBinding binding;
    private DialogListener callBack;
    private String tag = "";
    private String type = "";

    public static CaseDefaultDialog newInstance(String tag, String type) {
        CaseDefaultDialog fragment = new CaseDefaultDialog();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TAG, tag);
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
        return R.layout.dialog_case_default;
    }

    /**
     * Override for get the instance of viewModel
     *
     * @return viewModel = ViewModelProviders.of(this,factory).get(WelcomeViewModel.class);
     */
    @Override
    public CaseDefaultViewModel getViewModel() {
        tag = getArguments()!=null ? getArguments().getString(KEY_TAG): "";
        type = getArguments()!=null ? getArguments().getString(KEY_TYPE):"";
        return viewModel = ViewModelProviders.of(this,factory).get(CaseDefaultViewModel.class);
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
    public void getActivityBinding(DialogCaseDefaultBinding binding) {
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
        if((tag.equals(AmeHomeActivity.TAG) || tag.equals(DyCmeHomeActivity.TAG))
                && type.equals(AppConstants.CASES_FOR_SCRUTINY)){
            binding.title.setText(R.string.cases_for_scrutiny_of_assessment_report);

            binding.FirstSelect.setText(R.string.fresh_cases);
            binding.SecondSelect.setText(R.string.revert_cases_from_SSE_VDC);
            binding.ThirdSelect.setText(R.string.cases_reverted_by_Dy_CME);
        }
        else if(tag.equals(CpleHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_SCRUTINY)){
            binding.title.setText(R.string.casesForApprovalRejection);

            binding.FirstSelect.setText(R.string.fresh_cases);
            binding.SecondSelect.setText(R.string.revert_cases_by_dycme);
            binding.ThirdSelect.setVisibility(View.GONE);
        }
        else if(tag.equals(DyCmeHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_VERIFICATION)){
            binding.title.setText(R.string.case_for_verification_of_assessment);

            binding.FirstSelect.setText(R.string.fresh_cases);
            binding.SecondSelect.setText(R.string.cases_by_ame);
            binding.ThirdSelect.setText(R.string.cese_revert_by_cple);
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
        String string = "";

        switch (view.getId()){
            case R.id.FirstSelect:
                if(checked){
                    if((tag.equals(AmeHomeActivity.TAG) || tag.equals(DyCmeHomeActivity.TAG))
                            && type.equals(AppConstants.CASES_FOR_SCRUTINY)){
                        string = AppConstants.FRESH_CASES;
                    }else if (tag.equals(CpleHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_SCRUTINY)) {
                        string = AppConstants.FRESH_CASES;
                    }else if (tag.equals(DyCmeHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_VERIFICATION)) {
                        string = AppConstants.FRESH_CASES;
                    }
                }
                break;

            case R.id.SecondSelect:
                if(checked) {
                    if ((tag.equals(AmeHomeActivity.TAG) || tag.equals(DyCmeHomeActivity.TAG))
                            && type.equals(AppConstants.CASES_FOR_SCRUTINY)) {
                        string = AppConstants.REVERT_CASES_FROM_SSE_SDC;
                    } else if (tag.equals(CpleHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_SCRUTINY)) {
                        string = AppConstants.CASES_REVERTED_BY_DY_CME;
                    }else if (tag.equals(DyCmeHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_VERIFICATION)) {
                        string = AppConstants.REVERT_CASES_FROM_SSE_SDC;
                    }
                }
                break;

            case R.id.ThirdSelect:
                if(checked){
                    if((tag.equals(AmeHomeActivity.TAG) || tag.equals(DyCmeHomeActivity.TAG))
                            && type.equals(AppConstants.CASES_FOR_SCRUTINY)){
                        string = AppConstants.CASES_REVERTED_BY_DY_CME;
                    }else if (tag.equals(DyCmeHomeActivity.TAG) && type.equals(AppConstants.CASES_FOR_VERIFICATION)) {
                        string = AppConstants.CASES_REVERTED_BY_DY_CME;
                    }
                }
                break;
        }

        callBack.onSuccessDialogResponse(TAG, type, string);
        dismiss();
    }
}
