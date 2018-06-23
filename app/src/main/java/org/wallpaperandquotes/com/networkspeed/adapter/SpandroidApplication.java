package org.wallpaperandquotes.com.networkspeed.adapter;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;


/**
 * Created by root on 1/2/18.
 */

public class SpandroidApplication extends Application{


    private static final String TAG = "SpandroidApplication";

    private static Context appContext = null;
    private static SpandroidApplication instance;


    public static SpandroidApplication getStateInstance() {
        return instance;
    }

    public static Context getInstance() {
        return SpandroidApplication.appContext;
    }

    public static SpandroidApplication get(Context context) {
        return (SpandroidApplication) context.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();


    }
}
