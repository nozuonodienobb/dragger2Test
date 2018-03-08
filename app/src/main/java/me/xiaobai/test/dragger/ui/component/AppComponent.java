package me.xiaobai.test.dragger.ui.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import me.xiaobai.test.dragger.ui.module.AppModule;

/**
 * Created by tianqing on 2018/3/1.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context getAppContext();
}
