package me.xiaobai.test.dragger.ui.component;

import android.app.Activity;

import dagger.Component;
import me.xiaobai.test.dragger.ui.module.ActivityModule;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/5.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface BaseActivityComponent {
    Activity getActivity();
    void inject(Activity activity);
}
