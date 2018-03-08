package me.xiaobai.test.dragger.ui;

import android.app.Application;

import me.xiaobai.test.dragger.ui.component.AppComponent;
import me.xiaobai.test.dragger.ui.component.DaggerAppComponent;
import me.xiaobai.test.dragger.ui.module.AppModule;

/**
 * Created by tianqing on 2018/3/1.
 */

public class App extends Application {
    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initAppContext();
    }

    protected void initAppContext() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return  appComponent;
    }
}
