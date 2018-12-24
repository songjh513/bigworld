package com.wuyi.bigworld.biz.inspect.data.response;

import com.wuyi.bigworld.biz.framework.api.ResponseData;
import com.wuyi.bigworld.core.model.entity.user.RpUserInfo;

import java.util.List;

/**
 * Created  by songjh on 2018-10-18 00:16.
 */
public class ResponseTestApiQuery extends ResponseData {

   private List<RpUserInfo> userInfos;

    public List<RpUserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<RpUserInfo> userInfos) {
        this.userInfos = userInfos;
    }
}
