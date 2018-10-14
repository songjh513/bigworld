package com.wuyi.bigworld.biz.framework.api.interceptor;

import com.wuyi.bigworld.biz.framework.api.invocation.ApiInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created  by songjh on 2018-10-14 12:13.
 */
public abstract class AbstractApiInterceptor {
    protected static Logger logger = LoggerFactory.getLogger(AbstractApiInterceptor.class);

    abstract void before(final ApiInvocation invocation);

    protected abstract void after(final ApiInvocation invocation);

    public String intercept(final ApiInvocation invocation) {
        {
            before(invocation);
            try {
                invocation.invoke();
            } catch (Exception e) {
                logger.error("intercept exception", e);
            } finally {
                after(invocation);
            }
            return null;
        }

    }
}
