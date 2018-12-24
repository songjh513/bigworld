package com.wuyi.bigworld.biz.framework.api.interceptor;

import com.alibaba.fastjson.JSON;
import com.wuyi.bigworld.biz.framework.RuntimeContext;
import com.wuyi.bigworld.biz.framework.RuntimeContextHolder;
import com.wuyi.bigworld.biz.framework.api.DispatchContext;
import com.wuyi.bigworld.biz.framework.api.RequestData;
import com.wuyi.bigworld.biz.framework.api.ResponseData;
import com.wuyi.bigworld.biz.framework.api.enums.RuntimeKeysEnum;
import com.wuyi.bigworld.biz.framework.api.invocation.ApiInvocation;
import com.wuyi.bigworld.biz.framework.api.utils.ApiUtils;
import com.wuyi.bigworld.core.model.result.CommonErrorCode;
import org.apache.commons.lang3.StringUtils;

/**
 * Created  by songjh on 2018-10-14 12:32.
 */
public class ContextInterceptor extends AbstractApiInterceptor {

    @Override
    protected void before(ApiInvocation invocation) {
        DispatchContext dispatchContext = invocation.getDispatchContext();
        try {
            RuntimeContext context = RuntimeContextHolder.currentRuntimeContext();
            // 如果对象有值则取对象， 否则取字符串参数
            RequestData requestData = null;
            if (StringUtils.isNotBlank(dispatchContext.getRequest())
                    && dispatchContext.getRequestData() == null) {
                requestData = JSON.parseObject(dispatchContext.getRequest(), ApiUtils.getRequestType(invocation.getApi().getClass()));
                dispatchContext.setRequestData(requestData);
            } else {
                requestData = dispatchContext.getRequestData();
            }

            context.set(RuntimeKeysEnum.REQUEST_DATA_STRING,
                    dispatchContext.getRequest());
            context.set(RuntimeKeysEnum.REQUEST_DATA_OBJECT, requestData);
        } catch (Exception e) {
            ResponseData response = new ResponseData();
            response.setSuccess(false);
            response.setErrorCode(CommonErrorCode.INVALID_PARAMETER.getCode());
            response.setErrorMsg(CommonErrorCode.INVALID_PARAMETER.getDesc());
            dispatchContext.setResponseData(response);
            return;
        }
    }

    @Override
    protected void after(ApiInvocation invocation) {
//        LoggerUtil.info(LOGGER, "before context clear ");
        RuntimeContextHolder.clear();
//        LoggerUtil.info(LOGGER, "after context clear ");
    }

}
