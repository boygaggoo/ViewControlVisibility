package com.jbarbosa.viewcontrolvisibility;

import android.view.View;

import java.util.Arrays;
import java.util.HashSet;

import static com.jbarbosa.viewcontrolvisibility.Constants.VIEW_NULL;

/**
 * Created by Josinaldo on 06/07/2015.
 */

public class ViewControlVisibility {

    private HashSet<View> mViews;

    public ViewControlVisibility(View... views) {
        mViews = new HashSet<>();
        mViews.addAll(Arrays.asList(views));
        hideAll();
    }

    private void hideAll() {
        for (View view : mViews) {
            turnGone(view);
        }
    }

    public void show(View... views) {
        hideAll();

        for (View view : views) {
            if (mViews.contains(view)) {
                turnVisible(view);
            } else {
                throw new IllegalStateException(Constants.TAG + Constants.VIEW_NOT_FOUND);
            }
        }
    }

    /* Visibility controls */
    public static void turnVisible(View view) {
        if (view != null)
            view.setVisibility(View.VISIBLE);
        else
            throw new IllegalStateException(Constants.TAG + VIEW_NULL);
    }

    public static void turnGone(View view) {
        if (view != null)
            view.setVisibility(View.GONE);
        else
            throw new IllegalStateException(Constants.TAG + VIEW_NULL);
    }

    public static void turnInvisible(View view) {
        if (view != null)
            view.setVisibility(View.INVISIBLE);
        else
            throw new IllegalStateException(Constants.TAG + VIEW_NULL);
    }

}
