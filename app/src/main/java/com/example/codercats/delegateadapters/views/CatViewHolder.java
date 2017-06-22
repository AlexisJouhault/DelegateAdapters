package com.example.codercats.delegateadapters.views;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.codercats.delegateadapters.R;
import com.example.codercats.delegateadapters.adapters.BaseAdapter;
import com.example.codercats.delegateadapters.models.Cat;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class CatViewHolder extends BaseViewHolder<Cat> {

    @BindView(R.id.viewtype_cat_imageview)
    ImageView mImageView;

    @BindView(R.id.viewtype_cat_textview_name)
    TextView mNameTextView;

    public CatViewHolder(Context context, View itemView) {
        super(context, itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bind(ViewType cat, BaseAdapter.OnItemSelectedListener onItemSelectedListener) {
        super.bind(cat, onItemSelectedListener);
        if (cat instanceof Cat) bindItem((Cat) cat);
    }

    @Override
    protected void bindItem(Cat cat) {
        Glide.with(mContext)
                .load(cat.getImage())
                .into(mImageView);
        mNameTextView.setText(cat.getName());
    }
}
