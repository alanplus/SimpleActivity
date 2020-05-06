package com.alan.lib.simple.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Alan
 * 时 间：2020-05-06
 * 简 述：<功能简述>
 */
public class SimpleActivity extends AppCompatActivity {

    private static IActivity iActivity;


    public static void register(IActivity iActivity) {
        SimpleActivity.iActivity = iActivity;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (null != iActivity) {
            iActivity.onCreate(this);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (null != iActivity) {
            iActivity.onStart(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (null != iActivity) {
            iActivity.onResume(this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (null != iActivity) {
            iActivity.onPause(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (null != iActivity) {
            iActivity.onStop(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != iActivity) {
            iActivity.onDestroy(this);
        }
    }
}
