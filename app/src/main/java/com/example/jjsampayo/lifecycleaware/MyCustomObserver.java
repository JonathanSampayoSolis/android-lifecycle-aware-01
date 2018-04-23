package com.example.jjsampayo.lifecycleaware;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by
 *      jjsampayo on 19/03/2018.
 */

public class MyCustomObserver implements LifecycleObserver{
    private static final String TAG = "LIFECYCLE_OBSERVER";

    private Context context;

    public MyCustomObserver(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Log.d(TAG,"onCreate");
        Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Log.d(TAG,"onStart");
        Toast.makeText(context, "onStart", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.d(TAG,"onResume");
        Toast.makeText(context, "onResume", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.d(TAG,"onPause");
        Toast.makeText(context, "onPause", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Log.d(TAG,"onStop");
        Toast.makeText(context, "onStop", Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.d(TAG,"onDestroy");
        Toast.makeText(context, "onDestoy", Toast.LENGTH_SHORT).show();
    }
}
