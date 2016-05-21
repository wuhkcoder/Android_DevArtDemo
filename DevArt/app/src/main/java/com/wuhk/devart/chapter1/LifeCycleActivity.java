package com.wuhk.devart.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wuhk.devart.R;

public class LifeCycleActivity extends AppCompatActivity {
    public static final String TAG = "LifeCycleActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (null != savedInstanceState){
            String test = savedInstanceState.getString("extra_test");
            Log.e(TAG , "[onCreate]restore extra_test:" + test);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState");
        outState.putString("extra_test" , "test");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String test = savedInstanceState.getString("extra_test");
        Log.e(TAG , "[onRestoreInstanceState]restore extra_test:" + test);
    }
}
