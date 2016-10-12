package com.dyx.aa.mvp.data;

/**
 * Created by dayongxin on 2016/10/12.
 */

public interface NewsDataSource {
    interface GetNewsCallback {
        void doGetNews();

        void newsUnable();
    }
}
