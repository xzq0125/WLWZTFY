package com.tfy.wlwztfy;

import android.app.Application;

/**
 * App
 * Created by Wesley on 2018/6/20.
 */
public class App extends Application {

    public static App myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }

    public static App getApp() {
        return myApp;
    }
}
