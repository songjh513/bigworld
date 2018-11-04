package com.wuyi.bigworld.core.model.enums;

/**
 * Created  by songjh on 2018-10-17 23:12.
 */
public class Result {
    String code;
    String desc;

    public Result(String code, String desc) {
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
