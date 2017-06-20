package com.example.codercats.delegateadapters.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;

import com.example.codercats.delegateadapters.views.ViewType;
import com.example.codercats.delegateadapters.adapters.delegates.DelegateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class BaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected List<ViewType> mItems;
    protected SparseArray<DelegateAdapter> mAdapters;

    public BaseAdapter() {
        mItems = new ArrayList<>();
        mAdapters = new SparseArray<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mAdapters.get(viewType).createViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mAdapters.get(getItemViewType(position)).onBindViewHolder(holder, mItems.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mItems.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void addItems(List<? extends ViewType> items) {
        mItems.addAll(items);
        notifyDataSetChanged();
    }

    public interface OnItemSelectedListener {
        void onItemSelected(ViewType item);
    }
}