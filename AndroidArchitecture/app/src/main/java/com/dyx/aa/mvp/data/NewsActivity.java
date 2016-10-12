package com.dyx.aa.mvp.data;

import android.app.Activity;
import android.os.Bundle;

import com.dyx.aa.R;

/**
 * Author: dayongxin(yongxinda89@gmail.com)
 * Date: 2016-10-12
 * Time: 17:26
 * Project:
 * Function:
 * Description：
 */
public class NewsActivity extends Activity {
    private NewsPresenter mNewsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mNewsPresenter = new NewsPresenter();
    }
}