package com.example.codercats.delegateadapters.models;

import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class Dog extends Animal {

    private final String mName;
    private final String mImage;

    public Dog(String name, String image) {
        mName = name;
        mImage = image;
    }

    @Override
    public int getViewType() {
        return DOG;
    }

    public String getName() {
        return mName;
    }

    public String getImage() {
        return mImage;
    }
}
