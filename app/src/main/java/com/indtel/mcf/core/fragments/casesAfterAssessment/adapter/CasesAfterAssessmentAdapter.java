package com.indtel.mcf.core.fragments.casesAfterAssessment.adapter;

import android.view.View;

import com.indtel.mcf.base.BaseAdapter;
import com.indtel.mcf.R;
import com.indtel.mcf.data.model.apis.casesAfterAssessmen.CasesAfterAssessment;
import com.indtel.mcf.databinding.AdapterCasesAfterAssessmentBinding;

import java.util.ArrayList;
import java.util.List;

import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.VIEW_ITEM_DETAILS;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class CasesAfterAssessmentAdapter extends BaseAdapter<AdapterCasesAfterAssessmentBinding, CasesAfterAssessment> {
    public static final String TAG = CasesAfterAssessmentAdapter.class.getSimpleName();
    private AdapterListener listener;
    private int openInterface;

    /**
     * @param adapterList list args require to bind adapter up to the size of array
     */
    public CasesAfterAssessmentAdapter(ArrayList<CasesAfterAssessment> adapterList) {
        super(adapterList);
    }

    public interface AdapterListener {
        void onRetryClick();

        void onViewItemDetailsClick(int openInterfaceType, String applicationId);
    }

    public void setListener(AdapterListener listener, int openInterface) {
        this.listener = listener;
        this.openInterface = openInterface;
    }

    public void addItems(List<CasesAfterAssessment> model) {
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
        return R.layout.adapter_cases_after_assessment;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterCasesAfterAssessmentBinding binding) {
        return new ViewHolder<AdapterCasesAfterAssessmentBinding, CasesAfterAssessment>(binding) {
            /**
             * If there is anything to do then do here otherwise leave it blank
             *
             * @param binding  layout reference for single view
             * @param data     for single view
             * @param position position of ArrayList
             */
            @Override
            protected void doSomeWorkHere(AdapterCasesAfterAssessmentBinding binding, CasesAfterAssessment data, int position) {

            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(CasesAfterAssessment data) {
                binding.setData(new CasesAfterAssessmentAdapterViewModel( String.valueOf(position), data, openInterface));
            }

            /**
             * Method to set click listeners on view holder or groups
             *
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             * @param binding     DataBinding
             * @param data        data
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext, AdapterCasesAfterAssessmentBinding binding,
                                          CasesAfterAssessment data) {
                binding.viewItemButton.setOnClickListener(thisContext);
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
            protected ViewHolderClickListener viewHolderReference(AdapterCasesAfterAssessmentBinding binding,
                                                                  CasesAfterAssessment data, int position) {
                return new ViewHolderClickListener<AdapterCasesAfterAssessmentBinding, CasesAfterAssessment>(
                        binding, data, position) {
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
                        switch (view.getId()){
                            case R.id.viewItemButton:
                                //TODO view item
                                String id = data.getiD().toString();
                                String ids = id.contains(".") ? id.substring(0, id.indexOf(".")) : id;
                                listener.onViewItemDetailsClick(VIEW_ITEM_DETAILS, ids);
                                break;
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
