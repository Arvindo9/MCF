package com.indtel.mcf.core.fragments.sse.adapter;

import android.view.View;

import com.indtel.mcf.R;
import com.indtel.mcf.base.BaseAdapter;
import com.indtel.mcf.data.model.apis.sse.CaseList;
import com.indtel.mcf.databinding.AdapterSseBinding;

import java.util.ArrayList;
import java.util.List;

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
public class SseAdapter extends BaseAdapter<AdapterSseBinding, CaseList> {
    public static final String TAG = SseAdapter.class.getSimpleName();
    private AdapterListener listener;
    private int openInterface;

    /**
     * @param adapterList list args require to bind adapter up to the size of array
     */
    public SseAdapter(ArrayList<CaseList> adapterList) {
        super(adapterList);
    }

    public interface AdapterListener {
        void onRetryClick();

        void onCardClick(int openInterfaceType, String applicationId);
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
                    case SSE_CASES_AFTER_SERUTINY_OF_DOCUMENTS:
                        binding.itemNameText.setText(R.string.tender_no);
                        binding.empty1Text.setText(R.string.tender_date);
                        binding.empty2Text.setText(R.string.letter_no);
                        binding.status.setText(R.string.letter_date);
                        break;

                    case SSE_CASES_AFTER_ASSESSMENT_REPORT_SCRUTINY:
                        binding.itemNameText.setVisibility(View.GONE);
                        binding.empty1Text.setVisibility(View.GONE);
                        binding.empty2Text.setVisibility(View.GONE);
                        break;

                    case SSE_CASES_REVERT_TO_VENDOR_AFTER_ASSESSMENT_REPORT:
                        binding.empty1Text.setVisibility(View.GONE);
                        binding.empty2Text.setVisibility(View.GONE);
                        break;
                }
            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(CaseList data) {
                binding.setData(new SseAdapterViewModel(data, openInterface, position));
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

            }

            /**
             * Initialised holder by new operator
             *
             * @param binding  DataBinding
             * @param data     dataList
             * @param position of adapter
             * @return new ViewHolderClickListener<B, D>(binding, data, position)
             */
            @Override
            protected ViewHolderClickListener viewHolderReference(AdapterSseBinding binding, CaseList data,
                                                                  int position) {
                return null;
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
