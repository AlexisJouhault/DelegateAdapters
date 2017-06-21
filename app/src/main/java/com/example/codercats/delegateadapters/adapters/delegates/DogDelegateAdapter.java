package com.example.codercats.delegateadapters.adapters.delegates;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.codercats.delegateadapters.R;
import com.example.codercats.delegateadapters.models.Dog;
import com.example.codercats.delegateadapters.views.DogViewHolder;
import com.example.codercats.delegateadapters.views.ViewType;
import com.example.codercats.delegateadapters.adapters.BaseAdapter;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class DogDelegateAdapter implements DelegateAdapter {

    private final BaseAdapter.OnItemSelectedListener mOnItemSelectedListener;

    public DogDelegateAdapter(BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        mOnItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public RecyclerView.ViewHolder createViewHolder(Context context, ViewGroup parent) {
        return new DogViewHolder(View.inflate(context, R.layout.viewtype_dog, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, ViewType item) {
        ((DogViewHolder) viewHolder).bind(item, mOnItemSelectedListener);
    }
}
