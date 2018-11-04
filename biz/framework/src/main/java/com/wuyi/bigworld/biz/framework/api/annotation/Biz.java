package com.wuyi.bigworld.biz.framework.api.annotation;


import java.lang.annotation.*;

/**
 * Created  by songjh on 2018-10-17 22:45.
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Biz {

    String value();

    String version();
}
