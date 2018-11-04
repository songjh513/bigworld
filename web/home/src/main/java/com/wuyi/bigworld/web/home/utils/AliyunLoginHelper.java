package com.wuyi.bigworld.web.home.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wuyi.bigworld.web.home.model.IdTokenInfo;
import com.wuyi.bigworld.web.home.model.TokenInfo;
import com.wuyi.bigworld.web.home.model.UserInfo;

/**
 * Created  by songjh on 2018-11-03 17:25.
 */
public class AliyunLoginHelper {

    /**
     * 解析token
     * @param token
     * @return
     */
    public static TokenInfo parseToken(String token) {
        TokenInfo tokenInfo = new TokenInfo();
        JSONObject jsonToken = JSON.parseObject(token);
        System.out.println(jsonToken);
        tokenInfo.setAccessToken(jsonToken.getString("access_token"));
        tokenInfo.setExpiresIn(Integer.parseInt(jsonToken.getString("expires_in")));
        tokenInfo.setIdToken(jsonToken.getString("id_token"));
        tokenInfo.setTokenType(jsonToken.getString("token_type"));
        tokenInfo.setRefreshToken(jsonToken.getString("refresh_token"));
        return tokenInfo;
    }

    public static IdTokenInfo parseIdToken(String idToken) {
        IdTokenInfo idTokenInfo = new IdTokenInfo();

        return idTokenInfo;
    }

    public static UserInfo getUserInfoFromIdToken(IdTokenInfo idTokenInfo) {
        UserInfo userInfo = new UserInfo();

        return userInfo;
    }
}
