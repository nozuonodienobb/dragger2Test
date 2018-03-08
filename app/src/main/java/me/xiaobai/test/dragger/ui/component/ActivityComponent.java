package me.xiaobai.test.dragger.ui.component;


import dagger.Component;
import me.xiaobai.test.dragger.ui.MainActivity;
import me.xiaobai.test.dragger.ui.module.MainActivityModule;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/1.
 */

@ActivityScope
@Component( dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface ActivityComponent {
//    void inject(MainActivity activity);
}
