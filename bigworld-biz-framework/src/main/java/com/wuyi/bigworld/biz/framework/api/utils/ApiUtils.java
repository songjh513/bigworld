package com.wuyi.bigworld.biz.framework.api.utils;

import com.wuyi.bigworld.biz.framework.api.annotation.Api;
import com.wuyi.bigworld.biz.framework.api.annotation.Biz;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created  by songjh on 2018-10-14 12:34.
 */
public class ApiUtils {

    /**
     * API名称分割线
     */
    private static final String SPILT = "/";

    public static Type getRequestType(Class<?> clazz) {
        Type superClass = getGenericSuperclass(clazz);
        Type[] actualTypeArguments = ((ParameterizedType) superClass).getActualTypeArguments();
        return actualTypeArguments[actualTypeArguments.length - 1];
    }

    /**
     * 获取定义了request泛型的类
     * @param clazz
     * @return
     */
    private static Type getGenericSuperclass(Class<?> clazz) {
        Type superClass = clazz.getGenericSuperclass();
        if (superClass instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) superClass).getActualTypeArguments();
            if (types != null && types.length == 2) {
                return superClass;
            }
        }
        return getGenericSuperclass(clazz.getSuperclass());
    }

    /**
     * 根据业务线和API名称获取API标识
     *
     * @param biz
     * @param action
     * @return
     */
    public static String getApiName(String biz, String action) {
        return SPILT + biz +SPILT+ action;
    }

    /**
     * 根据API类获取ApiName
     *
     * @param apiClazz
     * @return
     */
    public static String getApiName(Class<?> apiClazz) {
        Biz biz = apiClazz.getPackage().getAnnotation(Biz.class);
        String bizName = biz.value();
        Api api = apiClazz.getAnnotation(Api.class);
        String action = api.value();
        return getApiName(bizName, action);
    }
}
