package com.example.codercats.delegateadapters.models;

import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class Dog extends Animal {

    @Override
    public int getViewType() {
        return DOG;
    }
}
