package com.example.codercats.delegateadapters.adapters;

import com.example.codercats.delegateadapters.models.Animal;
import com.example.codercats.delegateadapters.adapters.delegates.DogDelegateAdapter;

import java.util.List;

import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class CuteAnimalsAdapter extends BaseAdapter {

    public CuteAnimalsAdapter(List<Animal> animals, OnItemSelectedListener onItemSelectedListener) {
        super();
        addItems(animals);
        mAdapters.put(DOG, new DogDelegateAdapter(onItemSelectedListener));
    }
}

