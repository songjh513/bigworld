package com.wuyi.bigworld.biz.framework;

import com.wuyi.bigworld.biz.framework.api.RequestData;
import com.wuyi.bigworld.biz.framework.api.enums.RuntimeKeysEnum;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created  by songjh on 2018-10-14 12:27.
 */
public class RuntimeContext {

    /**
     * 上下文json对象
     */
    private final Map<String, Object> runtimeMaps = new ConcurrentHashMap<>();

    public <T> T get(RuntimeKeysEnum runtimeKey) {
        if (runtimeMaps != null && !runtimeMaps.isEmpty() && runtimeKey != null) {
            return (T) runtimeMaps.get(runtimeKey);
        }
        return null;
    }

    public void set(RuntimeKeysEnum runtimeKey, Object value) {
        if (runtimeMaps != null && runtimeKey != null && value != null) {
            runtimeMaps.put(runtimeKey.name(), value);
        }
    }
}
