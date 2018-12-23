package com.wuyi.bigworld.biz.inspect.api;

import com.wuyi.bigworld.biz.framework.api.AbstractApi;
import com.wuyi.bigworld.biz.framework.api.annotation.Api;
import com.wuyi.bigworld.biz.inspect.data.request.RequestTestApiQuery;
import com.wuyi.bigworld.biz.inspect.data.response.ResponseTestApiQuery;
import com.wuyi.bigworld.biz.inspect.service.RpUserInfoService;
import com.wuyi.bigworld.common.dal.user.RpUserInfoDao;
import com.wuyi.bigworld.core.model.entity.user.RpUserInfo;
import com.wuyi.bigworld.core.model.enums.PublicStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created  by songjh on 2018-10-18 00:12.
 */

@Api(value = "user.list")
public class UserListApi extends AbstractApi<ResponseTestApiQuery, RequestTestApiQuery> {


    @Autowired
    private RpUserInfoService rpUserInfoService;

    @Override
    public ResponseTestApiQuery execute(RequestTestApiQuery request) {
       // System.out.println(request.getUsername());
        ResponseTestApiQuery responseTestApiQuery = new ResponseTestApiQuery();
        List<RpUserInfo> rpUserInfos = rpUserInfoService.listAll();
        responseTestApiQuery.setUserInfos(rpUserInfos);
        return responseTestApiQuery;
    }

}
