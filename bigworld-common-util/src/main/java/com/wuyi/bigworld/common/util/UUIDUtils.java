package com.wuyi.bigworld.common.util;

import java.util.UUID;

/**
 * Created  by songjh on 2018-11-03 18:06.
 */
public class UUIDUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
