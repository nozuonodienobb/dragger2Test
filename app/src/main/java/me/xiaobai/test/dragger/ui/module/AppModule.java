package me.xiaobai.test.dragger.ui.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tianqing on 2018/3/1.
 */
@Module
public class AppModule {

    Context context;

    public AppModule (Context context) {
        this.context = context;
    }

    @Provides @Singleton
    public Context getAppContext() {
        return context;
    }
}
