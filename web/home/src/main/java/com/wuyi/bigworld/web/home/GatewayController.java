package com.wuyi.bigworld.web.home;

import com.alibaba.dubbo.common.utils.LogUtil;
import com.wuyi.bigworld.biz.framework.api.DispatchContext;
import com.wuyi.bigworld.biz.framework.api.engine.ApiEngine;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;

/**
 * Created  by songjh on 2018-10-13 10:54.
 */

@Controller
public class GatewayController {

    protected static Logger logger = LoggerFactory.getLogger(GatewayController.class);

    @Autowired
    private ApiEngine apiEngine;


    @RequestMapping(value = "gateway.htm",method = {RequestMethod.GET,RequestMethod.POST})
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            String biz = request.getParameter("biz");
            String action = request.getParameter("action");
            String data = request.getParameter("data");

            if (StringUtils.isNotBlank(data)) {
                data = URLDecoder.decode(data, "UTF-8");
            }
            DispatchContext dispatchContext = new
                    DispatchContext();
            dispatchContext.setBiz(biz);
            dispatchContext.setAction(action);
            dispatchContext.setRequest(data);
            String result = apiEngine.run(dispatchContext);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
