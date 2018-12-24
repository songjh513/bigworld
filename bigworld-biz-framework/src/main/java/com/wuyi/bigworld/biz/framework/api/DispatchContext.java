package com.wuyi.bigworld.biz.framework.api;

import com.alibaba.fastjson.JSON;

/**
 * Created  by songjh on 2018-10-14 11:43.
 */
public class DispatchContext {

    private String biz;
    private String action;
    private String request;
    private RequestData requestData;
    private String response;
    private ResponseData responseData;


    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public RequestData getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestData requestData) {
        this.requestData = requestData;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
        if (responseData != null) {
            this.response =  JSON.toJSONString(responseData);
        }

    }
}
