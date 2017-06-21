package com.example.codercats.delegateadapters.adapters;

import android.content.Context;

import com.example.codercats.delegateadapters.adapters.delegates.CatDelegateAdapter;
import com.example.codercats.delegateadapters.adapters.delegates.DogDelegateAdapter;

import static com.example.codercats.delegateadapters.views.ViewTypes.CAT;
import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class AnimalsAdapter extends BaseAdapter {

    public AnimalsAdapter(Context context, OnItemSelectedListener onItemSelectedListener) {
        super(context);
        mAdapters.put(DOG, new DogDelegateAdapter(onItemSelectedListener));
        mAdapters.put(CAT, new CatDelegateAdapter(onItemSelectedListener));
    }
}

