package com.wuyi.bigworld.biz.framework.api;

/**
 * Created  by songjh on 2018-10-14 12:04.
 */
public abstract class AbstractApi<M extends ResponseData, N extends RequestData> implements OpenApi {

    private ApiService  apiService;

    @Override
    public ResponseData execute(RequestData request) {
        return null;
    }
}
