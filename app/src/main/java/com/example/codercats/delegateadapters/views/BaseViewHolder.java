package com.example.codercats.delegateadapters.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.codercats.delegateadapters.adapters.BaseAdapter;

/**
 * Created by alexisjouhault on 21/06/2017.
 *
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    protected Context mContext;

    public BaseViewHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
    }

    protected void bind(ViewType item, BaseAdapter.OnItemSelectedListener mOnItemSelectedListener) {
        itemView.setOnClickListener(v -> { mOnItemSelectedListener.onItemSelected(item); });
    }

    protected abstract void bindItem(T item);
}
