package com.example.codercats.delegateadapters.adapters.delegates;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.codercats.delegateadapters.models.Cat;
import com.example.codercats.delegateadapters.views.ViewType;
import com.example.codercats.delegateadapters.adapters.BaseAdapter;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class CatDelegateAdapter implements DelegateAdapter {

    private final BaseAdapter.OnItemSelectedListener mOnItemSelectedListener;
    private Cat mCat;

    public CatDelegateAdapter(BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        mOnItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewGroup parent) {
        parent.setOnClickListener(view -> { mOnItemSelectedListener.onItemSelected(mCat); });
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, ViewType item) {

    }


}
