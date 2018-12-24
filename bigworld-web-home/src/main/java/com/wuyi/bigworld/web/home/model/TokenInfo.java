package com.wuyi.bigworld.web.home.model;

import com.wuyi.bigworld.core.model.common.ToString;

/**
 * Created  by songjh on 2018-11-03 17:27.
 */
public class TokenInfo extends ToString{
    
    private String accessToken;
    
    private int expiresIn;
    
    private String tokenType;
    
    private String idToken;
    
    private String refreshToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
