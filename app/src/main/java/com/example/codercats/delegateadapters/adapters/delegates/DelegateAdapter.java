package com.example.codercats.delegateadapters.adapters.delegates;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.codercats.delegateadapters.views.ViewType;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public interface DelegateAdapter {
    RecyclerView.ViewHolder createViewHolder(Context context, ViewGroup parent);

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder, ViewType item);
}

