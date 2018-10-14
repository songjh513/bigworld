package com.wuyi.bigworld.biz.framework.api;

/**
 * Created  by songjh on 2018-10-14 12:07.
 */
public interface ApiService {

    OpenApi<ResponseData, RequestData> getApi(String biz, String action);

    <T extends OpenApi<?, ?>> T getApi(Class<T> clazz);
}
