package com.example.codercats.delegateadapters.models;

import static com.example.codercats.delegateadapters.views.ViewTypes.CAT;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public class Cat extends Animal {

    private final String mImage;
    private final String mName;

    public Cat(String name, String image) {
        mImage = image;
        mName = name;
    }

    @Override
    public int getViewType() {
        return CAT;
    }

    public String getImage() {
        return mImage;
    }

    public String getName() {
        return mName;
    }
}
