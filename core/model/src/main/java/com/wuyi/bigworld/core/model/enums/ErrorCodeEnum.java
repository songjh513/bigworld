package com.wuyi.bigworld.core.model.enums;

/**
 * Created  by songjh on 2018-11-08 22:22.
 */
public enum ErrorCodeEnum {

    SYSTEM_ERROR("SYSTEM_ERROR","系统错误"),

    ILLEGAL_PARAMETERS("ILLEGAL_PARAMETERS","非法参数"),

    ;


    ErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * 错误码
     */
    String errorCode;

    /**
     * 错误详情
     */
    String errorMessage;


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
