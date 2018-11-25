package com.wuyi.bigworld.core.model.common;

/**
 * Created  by songjh on 2018-10-17 23:12.
 */
public class Result extends ToString{
    String code;
    String desc;

    public Result() {
    }

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
