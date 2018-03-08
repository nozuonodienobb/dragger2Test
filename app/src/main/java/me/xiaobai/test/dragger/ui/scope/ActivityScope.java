package me.xiaobai.test.dragger.ui.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tianqing on 2018/3/1.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {}