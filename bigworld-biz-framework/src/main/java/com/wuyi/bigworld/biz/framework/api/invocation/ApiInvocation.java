package com.wuyi.bigworld.biz.framework.api.invocation;

import com.wuyi.bigworld.biz.framework.RuntimeContext;
import com.wuyi.bigworld.biz.framework.RuntimeContextHolder;
import com.wuyi.bigworld.biz.framework.api.*;
import com.wuyi.bigworld.biz.framework.api.enums.RuntimeKeysEnum;
import com.wuyi.bigworld.biz.framework.api.interceptor.ApiInterceptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created  by songjh on 2018-10-14 12:12.
 */
public class ApiInvocation implements Invocation{

    private DispatchContext dispatchContext;

    private OpenApi api;


    private Iterator<ApiInterceptor> interceptorChain;

    public ApiInvocation(Iterator<ApiInterceptor> iterator) {
        this.interceptorChain = iterator;
    }


    @Override
    public void invoke() {
        if (this.interceptorChain != null &&  this.interceptorChain.hasNext()) {
            ApiInterceptor interceptor = this.interceptorChain.next();
            interceptor.intercept(this);
        } else {
            ResponseData responseData = this.api.execute();
            this.dispatchContext.setResponseData(responseData);
            RuntimeContext context =   RuntimeContextHolder.currentRuntimeContext();
            RequestData requestData = context.get(RuntimeKeysEnum.REQUEST_DATA_OBJECT);
            this.dispatchContext.setRequestData(requestData);
        }
    }


    public void setDispatchContext(DispatchContext dispatchContext) {
        this.dispatchContext = dispatchContext;
    }

    public DispatchContext getDispatchContext() {
        return dispatchContext;
    }

    public void setApi(OpenApi api) {
        this.api = api;
    }

    public OpenApi getApi() {
        return api;
    }
}
