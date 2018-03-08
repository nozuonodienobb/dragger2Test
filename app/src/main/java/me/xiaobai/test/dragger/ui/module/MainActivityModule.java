package me.xiaobai.test.dragger.ui.module;



import dagger.Module;
import dagger.Provides;
import me.xiaobai.test.dragger.ui.MainActivity;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/1.
 */

@Module
public  class MainActivityModule {

    private MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    public MainActivity getActivity() {
        return this.activity;
    }
}
