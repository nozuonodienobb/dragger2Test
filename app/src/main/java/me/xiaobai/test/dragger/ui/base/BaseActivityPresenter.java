package me.xiaobai.test.dragger.ui.base;


import android.content.Context;
import android.util.Log;

import javax.inject.Inject;


/**
 * Created by tianqing on 2018/3/1.
 */

public class BaseActivityPresenter<V extends BaseActivity>   {

    protected V view;

//    public BaseActivityPresenter(Context context) {
//        this. = checkNotNull(view, "view can't to be null");
//    }

    @Inject
    public BaseActivityPresenter() {}

    public void onDestory() {
        Log.i("onDestory", "ondestory");
        view = null;
    }



    public void setView(V view) {
        Log.i("oncreate", "setView");
        this.view = view;
    }
}
