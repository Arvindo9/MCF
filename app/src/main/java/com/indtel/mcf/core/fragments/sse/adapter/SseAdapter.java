package com.indtel.mcf.core.fragments.sse.adapter;

import android.content.Context;
import android.view.View;

import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseAdapter;
import com.indtel.mcf.core.fragments.FragmentHandlerActivity;
import com.indtel.mcf.data.model.apis.sse.CaseList;
import com.indtel.mcf.databinding.AdapterSseBinding;
import com.indtel.mcf.utils.download.DownloadFileTask;

import java.util.ArrayList;
import java.util.List;

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
public class SseAdapter extends BaseAdapter<AdapterSseBinding, CaseList> {
    public static final String TAG = SseAdapter.class.getSimpleName();
    private AdapterListener listener;
    private int openInterface;
    private Context context;

    /**
     * @param adapterList list args require to bind adapter up to the size of array
     */
    public SseAdapter(ArrayList<CaseList> adapterList) {
        super(adapterList);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public interface AdapterListener {
        void onRetryClick();

        void onCardClick(int openInterfaceType, String applicationId);

        void onViewItemDetailsClick(int openInterface, String id);
    }

    public void setListener(AdapterListener listener, int openInterface) {
        this.listener = listener;
        this.openInterface = openInterface;
    }

    public void addItems(List<CaseList> model) {
        list.addAll(model);
        notifyDataSetChanged();
    }

    public void clearItems() {
        list.clear();
        mainList.clear();
    }

    /**
     * @param position current index of ArrayList
     * @return return 0 if single layout xml else override this method for multiple xml or elements
     */
    @Override
    protected int getItemViewTypeAdapter(int position) {
        return 0;
    }

    /**
     * @return R.layout.layout_file
     */
    @Override
    protected int getLayout() {
        return R.layout.adapter_sse;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterSseBinding binding) {
        return new ViewHolder<AdapterSseBinding, CaseList>(binding) {
            /**
             * If there is anything to do then do here otherwise leave it blank
             *
             * @param binding  layout reference for single view
             * @param data     for single view
             * @param position position of ArrayList
             */
            @Override
            protected void doSomeWorkHere(AdapterSseBinding binding, CaseList data, int position) {
                switch (openInterface){
                    case FragmentHandlerActivity.SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
                        binding.itemNameText.setText(R.string.tender_no);
                        binding.empty1Text.setText(R.string.tender_date);
                        binding.empty2Text.setText(R.string.letter_no);
                        binding.status.setText(R.string.letter_date);
                        break;

                    case FragmentHandlerActivity.SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty1Layout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        break;

                    case FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                        binding.empty1Layout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.statusText.setText(R.string.status_by_SSE);
                        binding.remarkText.setText(R.string.remark_by_sse);
                        binding.attachmentText.setText(R.string.assesment_Report);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_RECOMMENDATION:
                        binding.empty1Text.setText(R.string.recommended_ao);
                        binding.empty2Text.setText(R.string.remark_by_sse);
                        binding.attachmentText.setText(R.string.attachment_by_SSE);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.statusLayout.setVisibility(View.GONE);
                        binding.remarkLayout.setVisibility(View.GONE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_SCRUTINY_FRESH_CASES:
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.statusText.setText(R.string.initial_scrutiny_report);
                        binding.attachmentText.setText(R.string.attachment_by_SSE);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_NOMINATIONS:
                        binding.attachmentText.setText(R.string.attachment_by_SSE);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        binding.empty1Text.setText(R.string.recommendedAO);
                        binding.remarkText.setText(R.string.remarkByAME);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.statusLayout.setVisibility(View.GONE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_ASSESSMENT:
                        binding.remarkText.setText(R.string.remark_by_DyCME);
                        binding.empty1Text.setText(R.string.probable_Date_for_Firm_Visit);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.statusLayout.setVisibility(View.GONE);
                        break;

                        //vendor
                    case FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY:
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty1Layout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.statusText.setText(R.string.status_by_SSE);
                        binding.remarkText.setText(R.string.remark_by_sse);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.attachmentText.setText(R.string.deficiency_attachment);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_SCRUTINY_REVERT_CASE_CME:
                        binding.empty2Text.setText(R.string.is_Reverted_by_Dy_CME);
                        binding.statusText.setText(R.string.status_by_dy);
                        binding.remarkText.setText(R.string.remark_by_Dy);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.attachmentText.setText(R.string.initial_scrutiny_report);
                        binding.attachmentLayout.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_SCRUTINY_REVERT_CASE_SSE:
                        binding.empty1Text.setText(R.string.initial_Scutiny_Report);
                        binding.empty2Text.setText(R.string.is_Case_Reverted_by_SSE);
                        binding.statusText.setText(R.string.status_by_SSE);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        break;

                    case FragmentHandlerActivity.CASES_ALLOTED_TO_INSPECTOR:
                        binding.empty1Text.setText(R.string.assessment_Officer_Name);
                        binding.empty2Text.setText(R.string.probable_Date_ofVisit);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.statusLayout.setVisibility(View.GONE);
                        binding.remarkLayout.setVisibility(View.GONE);
                        break;

                    case FragmentHandlerActivity.CASES_APPROVE_REJECT_FRESH:
                        binding.empty1Layout.setVisibility(View.GONE);
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.statusText.setText(R.string.status_by_dy);
                        binding.remarkText.setText(R.string.remark_by_DyCME);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_REVERT_BY_DYCME:
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.empty1Text.setText(R.string.is_Reverted_to_Dy);
                        binding.statusText.setText(R.string.status_by_dy);
                        binding.remarkText.setText(R.string.remark_by_DyCME);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_SCRUTINY:
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.empty1Layout.setVisibility(View.GONE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.statusLayout.setVisibility(View.GONE);
                        binding.remarkText.setText(R.string.remark_by_DyCME);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        break;

                    case FragmentHandlerActivity.CASES_FOR_VERIFICATION_FRESH_CASES:
                        break;
                    case FragmentHandlerActivity.CASES_FOR_VERIFICATION_REPLY_BY_AME:
                        binding.empty2Layout.setVisibility(View.GONE);
                        binding.itemNameLayout.setVisibility(View.GONE);
                        binding.viewItemButton.setVisibility(View.VISIBLE);
                        binding.remarkText.setText(R.string.remark_by_AME_VDC);
                        binding.statusText.setText(R.string.status_by_AME_VDC);
                        binding.empty1Text.setText(R.string.is_Reverted_by_ame);
                        break;
                    case FragmentHandlerActivity.CASES_FOR_VERIFICATION_REVERT_CASE_CPLE:
                        break;
                }
            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(CaseList data) {
                binding.setData(new SseAdapterViewModel(data, openInterface, position+1));
            }

            /**
             * Method to set click listeners on view holder or groups
             *
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             * @param binding     DataBinding
             * @param data        data
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext, AdapterSseBinding binding,
                                          CaseList data) {
                binding.viewItemButton.setOnClickListener(thisContext);
                binding.attached.setOnClickListener(thisContext);
            }

            /**
             * @return new ViewHolderClickListener<B, D>(binding, data, position)
             */
            @Override
            protected ViewHolderClickListener viewHolderReference(AdapterSseBinding binding, CaseList data,
                                                                  int position) {
                return new ViewHolderClickListener<AdapterSseBinding, CaseList>(binding, data, position) {
                    /**
                     * Called when a view has been clicked.
                     *
                     * @param view The view that was clicked.
                     *             switch (view.getId()){
                     *             case R.id.id:
                     *             break;
                     *             }
                     */
                    @Override
                    public void onClick(View view) {
                        if (view.getId() == R.id.viewItemButton){
                            if(openInterface == FragmentHandlerActivity.CASES_FOR_ASSESSMENT ||
                                openInterface == FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY ||
                                openInterface == FragmentHandlerActivity.CASES_FOR_SCRUTINY_REVERT_CASE_SSE ||
                                openInterface == FragmentHandlerActivity.CASES_ALLOTED_TO_INSPECTOR ||
                                openInterface == FragmentHandlerActivity.CASES_APPROVE_REJECT_FRESH ||
                                openInterface == FragmentHandlerActivity.CASES_REVERT_BY_DYCME ||
                                openInterface == FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_SCRUTINY ||
                                openInterface == FragmentHandlerActivity.CASES_FOR_VERIFICATION_REPLY_BY_AME){
                                String id = data.getReferenceId().toString();
                                listener.onCardClick(openInterface, id);
                            }
                            else if(openInterface == FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT){
                                String id = data.getReferenceId().toString();
                                listener.onCardClick(openInterface, id);
                            }
                            else if(openInterface == FragmentHandlerActivity.CASES_FOR_SCRUTINY_REVERT_CASE_CME){
                                String id = data.getReferenceId().toString();
                                listener.onCardClick(openInterface, id);
                            }
                        }
                        else if(view.getId() == R.id.attached){
                            if(openInterface == FragmentHandlerActivity.CASES_FOR_RECOMMENDATION) {
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        data.getaTTACHMENTOFSCRUTINY());
                            }else if(openInterface == FragmentHandlerActivity.CASES_FOR_SCRUTINY_FRESH_CASES) {
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        data.getATTACHMENTOFASSESSMENTREPORT());
                            }else if(openInterface == FragmentHandlerActivity.CASES_FOR_NOMINATIONS) {
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        data.getaTTACHMENTOFSCRUTINY());
                            }else if(openInterface ==
                                    FragmentHandlerActivity.VENDOR_DEFICIENCY_AFTER_ASSESSMENT_SCRUTINY) {
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        data.getATTACHMENT_TO_VENDOR());
                            }else if(openInterface ==
                                    FragmentHandlerActivity.SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT) {
                                String s = data.getAssessmentReport().substring(
                                        data.getAssessmentReport().lastIndexOf("/")+1);
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        s);
                            }else if(openInterface ==
                                    FragmentHandlerActivity.CASES_FOR_SCRUTINY_REVERT_CASE_CME) {
                                DownloadFileTask.startDownloading(context, data.getReferenceId().toString(),
                                        data.getATTACHMENTOFASSESSMENTREPORT());
                            }

                        }
                    }
                };
            }
        };
    }

    /**
     * @return new FilterClass();
     */
    @Override
    protected FilterClass initialisedFilterClass() {
        return null;
    }
}
