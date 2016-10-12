package com.dyx.aa.mvp.data;

import com.dyx.aa.mvp.BasePresenter;
import com.dyx.aa.mvp.BaseView;

/**
 * Created by dayongxin on 2016/10/12.
 */

public interface NewsContract {
    interface View extends BaseView<Presenter> {
        /**
         * 显示空白信息
         */
        void showEmpty();

        /**
         * 显示新闻
         */
        void showNews();

        /**
         * 显示错误信息
         */
        void showError();

        /**
         * 是否活跃
         *
         * @return
         */
        boolean isActive();
    }

    interface Presenter extends BasePresenter {
        /**
         * 获取新闻列表
         */
        void getNewsList();

        /**
         * 保存新闻列表数据到本地
         */
        void saveNews();
    }
}
