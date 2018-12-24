package com.wuyi.bigworld.biz.framework.api.interceptor;

import com.wuyi.bigworld.biz.framework.api.invocation.ApiInvocation;

/**
 * Created  by songjh on 2018-10-14 12:11.
 */
public interface ApiInterceptor {

    String intercept(ApiInvocation apiInvocation);
}
