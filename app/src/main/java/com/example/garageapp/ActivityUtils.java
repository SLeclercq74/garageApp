package com.example.garageapp;

import android.app.Activity;
import android.content.Intent;

public class ActivityUtils {

    public static final int TYPE_FADE = 0;
    public static final int TYPE_SLIDE = 1;

    public static void launchActivity(Activity activity, Intent intent, int type) {
        launchActivity(activity, intent, type, true);
    }

    public static void launchActivity(Activity activity, Class activityClass, int type) {
        Intent intent = new Intent(activity, activityClass);
        launchActivity(activity, intent, type, true);
    }

    public static void launchActivity(Activity activity, Class activityClass, int type, boolean isFinish) {
        launchActivity(activity, new Intent(activity, activityClass), type, isFinish);
    }

    public static void launchActivity(Activity activity, Intent intent, int type, boolean isFinish) {
        activity.startActivity(intent);
        if (type == TYPE_SLIDE) {
            activity.overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_right);
        } else {
            activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
        if (isFinish) {
            activity.finish();
        }
    }
}
