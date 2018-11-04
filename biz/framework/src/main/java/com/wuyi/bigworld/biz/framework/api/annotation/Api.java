package com.wuyi.bigworld.biz.framework.api.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created  by songjh on 2018-10-17 22:47.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Component
public @interface Api {

    String value();
}
