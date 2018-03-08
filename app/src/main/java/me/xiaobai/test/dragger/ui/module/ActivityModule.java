package me.xiaobai.test.dragger.ui.module;

import android.app.Activity;
import android.content.Context;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import me.xiaobai.test.dragger.ui.MainActivity;
import me.xiaobai.test.dragger.ui.component.AppComponent;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/5.
 */

@Module
public  class ActivityModule {

    public Activity context;

    public ActivityModule(Activity context) {
        this.context = context;
    }

    @ActivityScope
    @Provides
    public Activity context () {
        return context;
    }
}
