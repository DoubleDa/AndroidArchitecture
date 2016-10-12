package com.dyx.aa;

import android.app.Application;
import android.content.Context;

/**
 * Author: dayongxin(yongxinda89@gmail.com)
 * Date: 2016-10-12
 * Time: 17:00
 * Project:
 * Function:
 * Description：
 */
public class XApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}