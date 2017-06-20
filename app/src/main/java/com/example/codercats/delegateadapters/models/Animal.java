package com.example.codercats.delegateadapters.models;

import com.example.codercats.delegateadapters.views.ViewType;
import com.example.codercats.delegateadapters.views.ViewTypes;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

public abstract class Animal implements ViewType {

    @Override @ViewTypes
    public abstract int getViewType();

}
