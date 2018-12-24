package com.wuyi.bigworld.core.model.exception;

import com.wuyi.bigworld.core.model.enums.ErrorCodeEnum;

/**
 * Created  by songjh on 2018-11-08 22:22.
 */
public class BigWorldException extends RuntimeException {

    /**
     * 错误码枚举
     */
    private ErrorCodeEnum errorCodeEnum;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMessage;


    public BigWorldException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
        this.errorCode = errorCodeEnum.getErrorCode();
        this.errorMessage = errorCodeEnum.getErrorMessage();
    }

    public BigWorldException( ErrorCodeEnum errorCodeEnum, String errorCode, String errorMessage) {
        this.errorCodeEnum = errorCodeEnum;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

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
