package com.example.codercats.delegateadapters.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.codercats.delegateadapters.R;
import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.models.Dog;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class DogViewHolder extends BaseViewHolder<Dog> {

    @BindView(R.id.viewtype_dog_imageview)
    ImageView mImageView;

    @BindView(R.id.viewtype_dog_textview_name)
    TextView mNameTextView;

    public DogViewHolder(Context context, View itemView) {
        super(context, itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(ViewType dog, BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        super.bind(dog, onItemSelectedListener);
        if (dog instanceof Dog) bindItem((Dog) dog);
    }

    @Override
    protected void bindItem(Dog dog) {
        Glide.with(mContext)
                .load(dog.getImage())
                .into(mImageView);
        mNameTextView.setText(dog.getName());
    }
}
