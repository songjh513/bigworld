package com.wuyi.bigworld.web.home.templete;

/**
 * Created  by songjh on 2018-11-08 22:03.
 */
public interface CommonOperateCallback {

    /**
     * 操作前处理
     */
    void before();

    /**
     * 操作执行
     * @return
     */
    Object execute();

    /**
     * 操作后处理
     * @throws Exception
     */
    void after() throws Exception;

}
