package com.wuyi.bigworld.biz.inspect.data.request;

import com.wuyi.bigworld.biz.framework.api.RequestData;

/**
 * Created  by songjh on 2018-10-18 00:16.
 */
public class RequestTestApiQuery extends RequestData {

    private static final long serialVersionUID = 6774628966512637235L;
    private String username;


    private int age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
