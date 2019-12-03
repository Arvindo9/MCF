package com.indtel.mcf.core.fragments.dashboard.adapter;

import android.view.View;

import com.indtel.mcf.base.BaseAdapter;
import com.indtel.mcf.data.model.apis.dashboard.Dashboard;
import com.indtel.mcf.R;
import com.indtel.mcf.databinding.AdapterDashboardBinding;

import java.util.ArrayList;
import java.util.List;

import static com.indtel.mcf.core.fragments.FragmentHandlerActivity.DASHBOARD_SCRUTINY_OF_DOCUMENTS;

/**
 * Author : Arvindo Mondal
 * Email : arvindomondal@gmail.com
 * Created Date : 8/23/2019
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm, by born Creator
 * Motto : Never Give Up
 * Thought : Every thing starts from one single thing
 */
public class DashboardAdapter extends BaseAdapter<AdapterDashboardBinding, Dashboard> {

    public static final String TAG = DashboardAdapter.class.getSimpleName();

    private AdapterListener listener;

    /**
     * @param adapterList list args require to bind adapter up to the size of array
     */
    public DashboardAdapter(ArrayList<Dashboard> adapterList) {
        super(adapterList);
    }

    public interface AdapterListener {
        void onRetryClick();

        void onViewItemDetailsClick(int openInterfaceType, String applicationId, String title);
    }

    public void setListener(AdapterListener listener) {
        this.listener = listener;
    }

    public void addItems(List<Dashboard> model) {
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
        return R.layout.adapter_dashboard;
    }

    /**
     * Initialised View Holder
     *
     * @param binding DataBinding
     * @return new ViewHolder<B, D>(binding);
     */
    @Override
    public ViewHolder getViewHolder(AdapterDashboardBinding binding) {
        return new ViewHolder<AdapterDashboardBinding, Dashboard>(binding) {
            /**
             * If there is anything to do then do here otherwise leave it blank
             *
             * @param binding  layout reference for single view
             * @param data     for single view
             * @param position position of ArrayList
             */
            @Override
            protected void doSomeWorkHere(AdapterDashboardBinding binding, Dashboard data, int position) {

            }

            /**
             * @param data binding.setData(new AdapterViewModel(data));
             */
            @Override
            protected void bindData(Dashboard data) {
                binding.setData(new DashboardAdapterViewModel(String.valueOf(position+1),data));
            }

            /**
             * Method to set click listeners on view holder or groups
             *
             * @param thisContext set it on method : binding.layout.setOnClickListener(thisContext);
             * @param binding     DataBinding
             * @param data        data
             */
            @Override
            public void setClickListeners(ViewHolderClickListener thisContext, AdapterDashboardBinding binding,
                                          Dashboard data) {
                binding.cardLayout.setOnClickListener(thisContext);
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
            protected ViewHolderClickListener viewHolderReference(AdapterDashboardBinding binding,
                                                                  Dashboard data, int position) {
                return new ViewHolderClickListener<AdapterDashboardBinding, Dashboard>(binding, data, position) {
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
                            case R.id.cardLayout:
                                //TODO open dashboard
                                String id = data.getID().toString();
                                String ids = id.contains(".") ? id.substring(0, id.indexOf(".")) : id;
                                listener.onViewItemDetailsClick(DASHBOARD_SCRUTINY_OF_DOCUMENTS, ids, data.getSTAGE());
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
