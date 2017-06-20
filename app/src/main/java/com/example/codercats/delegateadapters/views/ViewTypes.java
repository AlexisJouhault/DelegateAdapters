package com.example.codercats.delegateadapters.views;

import android.support.annotation.IntDef;

import static com.example.codercats.delegateadapters.views.ViewTypes.CAT;
import static com.example.codercats.delegateadapters.views.ViewTypes.DOG;

/**
 * Created by alexisjouhault on 20/06/2017.
 *
 */

@IntDef({CAT, DOG})
public @interface ViewTypes {
    int CAT = 0;
    int DOG = 1;
}
