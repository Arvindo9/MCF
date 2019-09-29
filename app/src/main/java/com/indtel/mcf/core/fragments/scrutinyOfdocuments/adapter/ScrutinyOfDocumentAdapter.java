package com.indtel.mcf.core.fragments.scrutinyOfdocuments.adapter;

import com.indtel.mcf.base.BaseAdapter;
import com.indtel.mcf.data.model.apis.dashboard.DashboardScrutinyOfDocument;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.AdapterScrutinyOfDocumentBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/24/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class ScrutinyOfDocumentAdapter extends BaseAdapter<AdapterScrutinyOfDocumentBinding, DashboardScrutinyOfDocument> {

    public static final String TAG = ScrutinyOfDocumentAdapter.class.getSimpleName();

    private AdapterListener listener;

    public interface AdapterListener {
        void onRetryClick();

        void onViewItemDetailsClick(int openInterfaceType, String applicationId);
    }

    public void setListener(AdapterListener listener) {
        this.listener = listener;
    }

    public void addItems(List<DashboardScrutinyOfDocument> model) {
        list.addAll(model);
        notifyDataSetChanged();
    }

    public void clearItems() {
        list.clear();
        mainList.clear();
    }


    /**
     * @param list list args require to bind adapter up to the size of array
     */
    public ScrutinyOfDocumentAdapter(ArrayList<DashboardScrutinyOfDocument> list) {
        super(list);
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
        return R.layout.adapter_scrutiny_of_document;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterScrutinyOfDocumentBinding binding) {
        return new ViewHolder<AdapterScrutinyOfDocumentBinding, DashboardScrutinyOfDocument>(binding) {
            /**
             * If there is anything to do then do here otherwise leave it blank
             *
             * @param binding  layout reference for single view
             * @param data     for single view
             * @param position position of ArrayList
             */
            @Override
            protected void doSomeWorkHere(AdapterScrutinyOfDocumentBinding binding, DashboardScrutinyOfDocument data,
                                          int position) {

            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(DashboardScrutinyOfDocument data) {
                binding.setData(new ScrutinyOfDocumentAdapterViewModel(String.valueOf(position+1), data));
            }

            /**
             * Method to set click listeners on view holder or groups
             *
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             * @param binding     DataBinding
             * @param data        data
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext, AdapterScrutinyOfDocumentBinding binding,
                                          DashboardScrutinyOfDocument data) {

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
            protected ViewHolderClickListener viewHolderReference(AdapterScrutinyOfDocumentBinding binding,
                                                                  DashboardScrutinyOfDocument data, int position) {
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
