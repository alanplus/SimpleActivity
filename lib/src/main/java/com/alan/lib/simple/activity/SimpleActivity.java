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
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onCreate(this);
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        if (null != iActivity) {
            iActivity.onInflaterFinish(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onStart(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onResume(this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onPause(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onStop(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        IActivity iActivity = getIActivity();
        if (null != iActivity) {
            iActivity.onDestroy(this);
        }
    }

    public IActivity getIActivity() {
        return iActivity;
    }
}
