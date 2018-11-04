package com.wuyi.bigworld.biz.framework;

/**
 * Created  by songjh on 2018-10-14 12:28.
 */
public class RuntimeContextHolder {

    private static  ThreadLocal<RuntimeContext> CURRENT_RUNTIME_CONTEXT = new ThreadLocal<>();

    public static RuntimeContext currentRuntimeContext() {
        RuntimeContext context = CURRENT_RUNTIME_CONTEXT.get();
        if(context == null){
            setCurrentRuntimeContext(new RuntimeContext());
        }
        return CURRENT_RUNTIME_CONTEXT.get();
    }

    private static void setCurrentRuntimeContext(RuntimeContext runtimeContext) {
        CURRENT_RUNTIME_CONTEXT.set(runtimeContext);
    }

    public static void clear(){
        CURRENT_RUNTIME_CONTEXT.remove();
    }

}
