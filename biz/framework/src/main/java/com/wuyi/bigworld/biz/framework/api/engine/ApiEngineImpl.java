package com.wuyi.bigworld.biz.framework.api.engine;

import com.wuyi.bigworld.biz.framework.api.*;
import com.wuyi.bigworld.biz.framework.api.interceptor.ApiInterceptor;
import com.wuyi.bigworld.biz.framework.api.invocation.ApiInvocation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created  by songjh on 2018-10-14 11:58.
 */
public class ApiEngineImpl implements ApiEngine {


    @Autowired
    private ApiService apiService;

    List<ApiInterceptor> interceptors =new ArrayList<ApiInterceptor>();

    @Override
    public String run(DispatchContext dispatchContext) {

        OpenApi<ResponseData, RequestData> openApi = this.apiService.getApi(dispatchContext.getBiz(), dispatchContext.getAction());

        run(openApi, dispatchContext);

        return dispatchContext.getResponse();
    }


    private void run(OpenApi openApi,  DispatchContext dispatchContext) {
        ApiInvocation invocation = new ApiInvocation(interceptors.iterator());
        if (dispatchContext == null) {
            dispatchContext = new DispatchContext();
        }
        invocation.setDispatchContext(dispatchContext);
        if (openApi != null) {
            invocation.setApi(openApi);
            invocation.invoke();
        } else {
            //错误日志打印
            dispatchContext.setResponseData(null);
        }
    }

    public void setInterceptors(List<ApiInterceptor> interceptors) {
        this.interceptors = interceptors;
    }
}
