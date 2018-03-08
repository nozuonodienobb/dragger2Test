package me.xiaobai.test.dragger.ui.component;

import dagger.Component;
import me.xiaobai.test.dragger.ui.MainActivity;
import me.xiaobai.test.dragger.ui.module.ActivityModule;
import me.xiaobai.test.dragger.ui.module.SecondModule;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/5.
 */

@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, SecondModule.class} )
@ActivityScope
public interface SecondActivityComponent extends BaseActivityComponent {
    void inject(MainActivity mainActivity);
}
