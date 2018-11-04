package com.wuyi.bigworld.biz.inspect.api;

import com.wuyi.bigworld.biz.framework.api.AbstractApi;
import com.wuyi.bigworld.biz.framework.api.annotation.Api;
import com.wuyi.bigworld.biz.inspect.data.request.RequestTestApiQuery;
import com.wuyi.bigworld.biz.inspect.data.response.ResponseTestApiQuery;

/**
 * Created  by songjh on 2018-10-18 00:12.
 */

@Api(value = "inspect.api")
public class TestApi extends AbstractApi<ResponseTestApiQuery, RequestTestApiQuery> {


    @Override
    public ResponseTestApiQuery execute(RequestTestApiQuery request) {
       // System.out.println(request.getUsername());
        ResponseTestApiQuery result = new ResponseTestApiQuery();
        result.setSuccess(true);
        return result;
    }


}
