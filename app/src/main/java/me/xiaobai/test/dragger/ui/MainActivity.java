package me.xiaobai.test.dragger.ui;

import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import me.xiaobai.test.dragger.R;
import me.xiaobai.test.dragger.ui.base.BaseActivity;
import me.xiaobai.test.dragger.ui.component.DaggerActivityComponent;
import me.xiaobai.test.dragger.ui.component.DaggerSecondActivityComponent;
import me.xiaobai.test.dragger.ui.component.SecondActivityComponent;
import me.xiaobai.test.dragger.ui.module.ActivityModule;
import me.xiaobai.test.dragger.ui.module.MainActivityModule;
import me.xiaobai.test.dragger.ui.module.SecondModule;
import me.xiaobai.test.dragger.ui.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void initComponent() {
//        DaggerActivityComponent.builder()
//                .appComponent(getAppComponent())
//                .mainActivityModule(new MainActivityModule(this))
//                .build()
//                .inject(this);
//        SecondActivityComponent.b
        DaggerSecondActivityComponent.builder()
                .appComponent(getAppComponent())
                .activityModule(new ActivityModule(this))
                .secondModule(new SecondModule(this))
                .build()
                .inject(this);
    }


    public void Test() {
//        Toast.makeText(this, "DAGGER MVP SHOW", Toast.LENGTH_SHORT).show();


    }

    public void init() {
        mPresenter.showToast();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.
    }
}
