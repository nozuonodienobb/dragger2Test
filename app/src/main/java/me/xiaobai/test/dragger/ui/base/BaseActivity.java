package me.xiaobai.test.dragger.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import javax.inject.Inject;

import me.xiaobai.test.dragger.ui.App;
import me.xiaobai.test.dragger.ui.component.ActivityComponent;
import me.xiaobai.test.dragger.ui.component.AppComponent;
import me.xiaobai.test.dragger.ui.component.DaggerActivityComponent;
import me.xiaobai.test.dragger.ui.module.MainActivityModule;

/**
 * Created by tianqing on 2018/3/1.
 */

public abstract class BaseActivity<P extends BaseActivityPresenter> extends AppCompatActivity {

    @Inject
    @Nullable
    protected P  mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComponent();
        if (mPresenter != null) {
            mPresenter.setView(this);
        }
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDestory();//释放资源
        this.mPresenter = null;
    }

    protected abstract void initComponent();

    protected AppComponent getAppComponent() {
        return new App().getAppComponent();
    }



}
