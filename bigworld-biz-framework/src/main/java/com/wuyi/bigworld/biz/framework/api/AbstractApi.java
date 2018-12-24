package com.wuyi.bigworld.biz.framework.api;

import com.wuyi.bigworld.biz.framework.RuntimeContext;
import com.wuyi.bigworld.biz.framework.RuntimeContextHolder;
import com.wuyi.bigworld.biz.framework.api.enums.RuntimeKeysEnum;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created  by songjh on 2018-10-14 12:04.
 */
public abstract class AbstractApi<M extends ResponseData, N extends RequestData> implements OpenApi {

    @Autowired
    private ApiService  apiService;

    public M execute() {
        RuntimeContext context = RuntimeContextHolder.currentRuntimeContext();
        N request =  context.get(RuntimeKeysEnum.REQUEST_DATA_OBJECT);
        return execute(request);
    }

    public abstract M execute(final N request);

    @Override
    public void initAfterStart() {

    }
}
