package com.wuyi.bigworld.biz.framework.api;


import com.wuyi.bigworld.biz.framework.api.interceptor.AbstractApiInterceptor;
import com.wuyi.bigworld.biz.framework.api.utils.ApiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created  by songjh on 2018-10-17 22:44.
 */
public class ApiServiceImpl extends ApplicationObjectSupport implements ApiService {

    protected static Logger logger = LoggerFactory.getLogger(AbstractApiInterceptor.class);

    /**
     * service库
     */
    private Map<String,OpenApi> serviceMap = new HashMap<String,OpenApi>();

    @Override
    public OpenApi<ResponseData, RequestData> getApi(String biz, String action) {
        String apiName = ApiUtils.getApiName(biz,action);
        if(serviceMap.containsKey(apiName)){
            return serviceMap.get(apiName);
        }
        return null;
    }

    @Override
    public <T extends OpenApi<?, ?>> T getApi(Class<T> clazz) {
        String apiName = ApiUtils.getApiName(clazz);
        if(serviceMap.containsKey(apiName)){
            return (T) serviceMap.get(apiName);
        }
        return null;
    }

    @Override
    protected void initApplicationContext(ApplicationContext context) throws BeansException {
        super.initApplicationContext(context);
        String[] beanNames = context.getBeanNamesForType(OpenApi.class);
        for (String beanName : beanNames) {
            OpenApi<ResponseData,RequestData> openApi = null;
            try {
                openApi = (OpenApi<ResponseData, RequestData>) context.getBean(beanName);
            } catch (Exception e) {
                //TODO error log
            }
            if(openApi!=null){
                String apiName = ApiUtils.getApiName(openApi.getClass());
                if(!serviceMap.containsKey(apiName)){
                    serviceMap.put(apiName,openApi);
                    System.out.println(String.format(" scan api {0} {1}", apiName, openApi));
                    // info log scan api {0} {1}
                }else{
                    System.out.println(String.format(" scan api {0} {1} alread exist ", apiName, openApi));

                    // error log scan api {0} {1} alread exist
                }
            }
        }
    }
}
