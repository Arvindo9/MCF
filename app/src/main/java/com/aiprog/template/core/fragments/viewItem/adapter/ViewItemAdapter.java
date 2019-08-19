package com.aiprog.template.core.fragments.viewItem.adapter;

import com.aiprog.template.R;
import com.aiprog.template.base.BaseAdapter;
import com.aiprog.template.core.fragments.statusOfApplication.adapter.StatusOfApplicationAdapter;
import com.aiprog.template.data.model.apis.viewItem.ViewItem;
import com.aiprog.template.databinding.AdapterViewItemBinding;

import java.util.ArrayList;
import java.util.List;

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
public class ViewItemAdapter extends BaseAdapter<AdapterViewItemBinding, ViewItem> {
    public static final String TAG = ViewItemAdapter.class.getSimpleName();

    private AdapterListener listener;

    public interface AdapterListener {
        void onRetryClick();
    }

    public void setListener(AdapterListener listener) {
        this.listener = listener;
    }

    public void addItems(List<ViewItem> model) {
        list.addAll(model);
        notifyDataSetChanged();
    }

    public void clearItems() {
        list.clear();
        mainList.clear();
    }

    /**
     * @param adapterList list args require to bind adapter up to the size of array
     */
    public ViewItemAdapter(ArrayList<ViewItem> adapterList) {
        super(adapterList);
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
        return R.layout.adapter_view_item;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterViewItemBinding binding) {
        return new ViewHolder<AdapterViewItemBinding, ViewItem>(binding) {
            @Override
            protected void doSomeWorkHere(AdapterViewItemBinding binding, ViewItem data, int position) {

            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(ViewItem data) {
                binding.setData(new ViewItemAdapterViewModel(String.valueOf(position+1), data));
            }

            /**
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext, AdapterViewItemBinding binding, ViewItem data) {

            }

            /**
             * @return new ViewHolderClickListener<B, D>(binding, data, position)
             */
            @Override
            protected ViewHolderClickListener viewHolderReference(AdapterViewItemBinding binding, ViewItem data, int position) {
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
