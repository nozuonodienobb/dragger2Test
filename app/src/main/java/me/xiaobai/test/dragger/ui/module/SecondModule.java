package me.xiaobai.test.dragger.ui.module;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

import dagger.Module;
import dagger.Provides;
import me.xiaobai.test.dragger.R;
import me.xiaobai.test.dragger.ui.XiaobaiTest;
import me.xiaobai.test.dragger.ui.scope.ActivityScope;

/**
 * Created by tianqing on 2018/3/5.
 */

@Module
public class SecondModule {

    Context context;

    public SecondModule(Context context) {
        this.context = context;
    }

    @ActivityScope
    @Provides
    public XiaobaiTest xiaobaiTest() {
        return new XiaobaiTest("小白", "23");
    }

    @ActivityScope
    @Provides
    public AlertDialog getDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
// 获取布局
        View view2 = View.inflate(context, R.layout.activity_main, null);
        builder.setTitle("Login").setIcon(R.drawable.ic_launcher_background)
                .setView(view2);
// 创建对话框
        final AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
