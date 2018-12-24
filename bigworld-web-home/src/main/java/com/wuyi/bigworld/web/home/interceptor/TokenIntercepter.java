package com.wuyi.bigworld.web.home.interceptor;


import com.wuyi.bigworld.web.home.annoation.Anoymous;
import com.wuyi.bigworld.web.home.constants.AliyunLoginConstant;
import com.wuyi.bigworld.web.home.utils.CookieUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


public class TokenIntercepter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        HandlerMethod handlerMethod=(HandlerMethod)handler;

        if(isAnoymous(handlerMethod)){
            return true;
        }

        String sessionId= CookieUtil.getCookieValue(request, AliyunLoginConstant.ALIYUN_LOGIN_KEY);

        System.out.println("aliyunLoginKey:"+sessionId);

        if(StringUtils.isEmpty(sessionId)){
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("{\"code\":\"deny\",\"msg\":\"用户未登录\",\"target\":\""+AliyunLoginConstant.AUTH_CODE_ENDPOINT+"\"}");
            return false;
        }

        System.out.println("sessionId="+request.getSession().getId());

        Object attribute = request.getSession().getAttribute(sessionId);
        System.out.println("user="+attribute);

        if(request.getSession().getAttribute(sessionId)==null){
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("{\"code\":\"deny\",\"msg\":\"用户未登录\",\"target\":\""+AliyunLoginConstant.AUTH_CODE_ENDPOINT+"\"}");
            return false;
        }
        //更新过期时间
        request.getSession().setMaxInactiveInterval(3600);

        return false;
    }

    private boolean isAnoymous(HandlerMethod handlerMethod){
        Object bean=handlerMethod.getBean();
        Class clazz=bean.getClass();
        if(clazz.getAnnotation(Anoymous.class)!=null){
            return true;
        }
        Method method=handlerMethod.getMethod();
        return method.getAnnotation(Anoymous.class)!=null;
    }
}
