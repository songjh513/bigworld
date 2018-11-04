package com.wuyi.bigworld.biz.framework.api;

/**
 * Created  by songjh on 2018-10-14 12:03.
 */
public interface OpenApi<M extends ResponseData, N extends RequestData> {

    M execute();

//    M execute(final N request);

    void initAfterStart();

}
