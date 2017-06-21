package com.example.codercats.delegateadapters.views;

import android.view.View;

import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.models.Cat;

import butterknife.ButterKnife;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class CatViewHolder extends BaseViewHolder<Cat> {

    public CatViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(ViewType cat, BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        super.bind(cat, onItemSelectedListener);
        if (cat instanceof Cat) bindItem((Cat) cat);
    }

    @Override
    protected void bindItem(Cat item) {

    }
}
