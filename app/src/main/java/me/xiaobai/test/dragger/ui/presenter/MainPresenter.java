package me.xiaobai.test.dragger.ui.presenter;


import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

import javax.inject.Inject;

import me.xiaobai.test.dragger.R;
import me.xiaobai.test.dragger.ui.MainActivity;
import me.xiaobai.test.dragger.ui.XiaobaiTest;
import me.xiaobai.test.dragger.ui.base.BaseActivityPresenter;

/**
 * Created by tianqing on 2018/3/1.
 */

public class MainPresenter extends BaseActivityPresenter<MainActivity> {

    Context xiaobaiTest;

    @Inject
    AlertDialog alertDialog;

    @Inject
    public MainPresenter(Context xiaobaiTest) {
        this.xiaobaiTest = xiaobaiTest;
    }

    public void showToast() {
        alertDialog.show();
    }


}
