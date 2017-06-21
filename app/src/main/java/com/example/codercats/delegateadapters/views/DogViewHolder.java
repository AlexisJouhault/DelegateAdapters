package com.example.codercats.delegateadapters.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.models.Dog;

import butterknife.ButterKnife;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class DogViewHolder extends BaseViewHolder<Dog> {

    public DogViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(ViewType dog, BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        super.bind(dog, onItemSelectedListener);
        if (dog instanceof Dog) bindItem((Dog) dog);
    }

    @Override
    protected void bindItem(Dog item) {

    }
}
