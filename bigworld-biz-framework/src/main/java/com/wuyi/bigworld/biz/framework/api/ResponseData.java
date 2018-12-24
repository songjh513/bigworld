package com.wuyi.bigworld.biz.framework.api;

import com.wuyi.bigworld.core.model.common.ToString;

/**
 * Created  by songjh on 2018-10-14 11:48.
 */
public class ResponseData extends ToString {

    private static final long serialVersionUID = 6126730154604952991L;

    /**
     * 成功与否
     */
    private boolean success = false;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误详情
     */
    private String errorMsg;

    /**
     * 错误名
     */
    private String errorName;

    /**
     * 错误提示
     */
    private String tip;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
