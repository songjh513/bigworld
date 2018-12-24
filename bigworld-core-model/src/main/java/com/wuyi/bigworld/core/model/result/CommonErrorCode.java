package com.wuyi.bigworld.core.model.result;


/**
 * Created  by songjh on 2018-10-17 23:09.
 */
public enum CommonErrorCode {

    INVALID_PARAMETER("INVALID_PARAMETER", "参数异常"),;

    /**
     * code
     */
    String code;

    /**
     * desc
     */
    String desc;

    CommonErrorCode(String code, String desc) {
        this.desc = desc;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
