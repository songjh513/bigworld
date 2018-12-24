package com.wuyi.bigworld.biz.inspect.api;

import com.wuyi.bigworld.biz.framework.api.AbstractApi;
import com.wuyi.bigworld.biz.framework.api.ResponseData;
import com.wuyi.bigworld.biz.framework.api.annotation.Api;
import com.wuyi.bigworld.biz.inspect.data.request.RequestTestApiQuery;
import com.wuyi.bigworld.biz.inspect.data.response.ResponseCommon;
import com.wuyi.bigworld.biz.inspect.data.response.ResponseTestApiQuery;
import com.wuyi.bigworld.biz.inspect.service.RpUserInfoService;
import com.wuyi.bigworld.common.util.StringUtil;
import com.wuyi.bigworld.core.model.entity.user.RpUserInfo;
import com.wuyi.bigworld.core.model.enums.PublicStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created  by songjh on 2018-12-22 12:39.
 */
@Api(value = "user.add")
public class UserAddApi extends AbstractApi<ResponseCommon, RequestTestApiQuery> {

    @Autowired
    private RpUserInfoService rpUserInfoService;

    @Override
    public ResponseCommon execute(RequestTestApiQuery request) {
        ResponseCommon responseCommon = new ResponseCommon();
        RpUserInfo rpUserInfo = new RpUserInfo();
        rpUserInfo.setAccountNo("songjh");
        rpUserInfo.setCreateTime(new Date());
        rpUserInfo.setId(StringUtil.get32UUID());
        rpUserInfo.setStatus(PublicStatusEnum.ACTIVE.name());
        rpUserInfo.setUserName("小飞哥");
        rpUserInfo.setUserNo("songjh");
        rpUserInfo.setMobile("15396002495");
        rpUserInfo.setPassword("123456");
        rpUserInfo.setPayPwd("888888");
        rpUserInfo.setVersion(0);
        rpUserInfoService.saveData(rpUserInfo);
        responseCommon.setTip("操作成功");
        return responseCommon;
    }
}
