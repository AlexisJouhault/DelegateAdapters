package com.example.codercats.delegateadapters.adapters.delegates;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codercats.delegateadapters.R;
import com.example.codercats.delegateadapters.models.Cat;
import com.example.codercats.delegateadapters.views.CatViewHolder;
import com.example.codercats.delegateadapters.views.ViewType;
import com.example.codercats.delegateadapters.adapters.BaseAdapter;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class CatDelegateAdapter implements DelegateAdapter {

    private final BaseAdapter.OnItemSelectedListener mOnItemSelectedListener;

    public CatDelegateAdapter(BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        mOnItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(Context context, ViewGroup parent) {
        return new CatViewHolder(context, LayoutInflater.from(context).inflate(R.layout.viewtype_cat, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, ViewType item) {
        ((CatViewHolder) viewHolder).bind(item, mOnItemSelectedListener);
    }
}
