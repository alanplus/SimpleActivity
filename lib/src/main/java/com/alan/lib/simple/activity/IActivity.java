package com.alan.lib.simple.activity;

import android.app.Activity;

/**
 * @author Alan
 * 时 间：2020-05-06
 * 简 述：<功能简述>
 */
public interface IActivity {

    void onCreate(Activity activity);

    void onStart(Activity activity);

    void onResume(Activity activity);

    void onPause(Activity activity);

    void onStop(Activity activity);

    void onDestroy(Activity activity);

    void onInflaterFinish(Activity activity);
}
