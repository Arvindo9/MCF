package com.aiprog.template.core.fragments.statusOfApplication.adapter;

import android.content.Context;
import android.view.View;

import com.aiprog.template.R;
import com.aiprog.template.base.BaseAdapter;
import com.aiprog.template.data.model.apis.statusOfApplication.StatusOfApplicationResponse;
import com.aiprog.template.databinding.AdapterStatusOfApplicationBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Author       : Arvindo Mondal
 * Created on   : 16-08-2019
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
public class StatusOfApplicationAdapter extends BaseAdapter<AdapterStatusOfApplicationBinding,
        StatusOfApplicationResponse> {
    public static final String TAG = StatusOfApplicationAdapter.class.getSimpleName();

    private AdapterListener listener;

    public interface AdapterListener {
        void onRetryClick();
    }

    public void setListener(AdapterListener listener) {
        this.listener = listener;
    }

    public void addItems(List<StatusOfApplicationResponse> model) {
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
    public StatusOfApplicationAdapter(ArrayList<StatusOfApplicationResponse> list) {
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
        return R.layout.adapter_status_of_application;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterStatusOfApplicationBinding binding) {
        return new ViewHolder<AdapterStatusOfApplicationBinding, StatusOfApplicationResponse>(binding) {
            @Override
            protected void doSomeWorkHere(AdapterStatusOfApplicationBinding binding, StatusOfApplicationResponse data, int position) {

            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(StatusOfApplicationResponse data) {
                binding.setData(new AdapterViewModel(String.valueOf(position), data));
            }

            /**
             * Method to set click listeners on view holder or groups
             *
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             * @param binding     DataBinding
             * @param data        data
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext,
                                          AdapterStatusOfApplicationBinding binding, StatusOfApplicationResponse data) {
                binding.viewApplicationButton.setOnClickListener(thisContext);
                binding.viewItemButton.setOnClickListener(thisContext);
            }

            /**
             * @return new ViewHolderClickListener<B, D>(binding, data, position)
             */
            @Override
            protected ViewHolderClickListener viewHolderReference(AdapterStatusOfApplicationBinding binding,
                                                                  StatusOfApplicationResponse data, int position) {
                return new ViewHolderClickListener<AdapterStatusOfApplicationBinding,
                        StatusOfApplicationResponse>(binding, data, position) {
                    @Override
                    public void onClick(View view) {
                        switch (view.getId()){
                            case R.id.viewItemButton:
                                break;

                            case R.id.viewApplicationButton:
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
        return new FilterClass() {
            @Override
            public Context getContext() {
                return null;
            }

            @Override
            public ArrayList<StatusOfApplicationResponse> filterData(CharSequence constraint,
                                    ArrayList<StatusOfApplicationResponse> list,
                                    ArrayList<StatusOfApplicationResponse> filteredArrayList) {

                for (StatusOfApplicationResponse data : list) {
                    if (data.getNAMEOFFIRM().toLowerCase().contains(constraint))
                        filteredArrayList.add(data);
                }
                return filteredArrayList;
            }
        };
    }
}
