package com.iakie.todayinhistory.base;

import android.app.Application;

import org.xutils.x;

/**
 * Author: iqiqiya
 * Date: 2019-12-24
 * Time: 20:14
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class UniteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
