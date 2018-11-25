package com.wuyi.bigworld.web.home.controller;

import com.wuyi.bigworld.web.home.annoation.Anoymous;
import com.wuyi.bigworld.web.home.constants.AliyunLoginConstant;
import com.wuyi.bigworld.web.home.model.IdTokenInfo;
import com.wuyi.bigworld.web.home.model.TokenInfo;
import com.wuyi.bigworld.web.home.model.UserInfo;
import com.wuyi.bigworld.web.home.templete.DefaultOperateCallback;
import com.wuyi.bigworld.web.home.templete.WebCommonOperateTemplate;
import com.wuyi.bigworld.web.home.utils.AliyunLoginHelper;
import com.wuyi.bigworld.web.home.utils.CookieUtil;
import com.wuyi.bigworld.web.home.utils.HttpClientUtil;
import com.wuyi.bigworld.web.home.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created  by songjh on 2018-10-13 10:54.
 */

@Controller
public class UserLoginController {

    protected static Logger logger = LoggerFactory.getLogger(UserLoginController.class);

    @Anoymous
    @RequestMapping(value = "userLogin", method = {RequestMethod.GET, RequestMethod.POST})
    public String doLoginUser(String code, HttpServletRequest request, HttpServletResponse response) {

        System.out.println("authCode"+code);
        //1、authCode 换token
        String token = HttpClientUtil.HttpGet(AliyunLoginConstant.TOKEN_ENDPOINT+code);
        TokenInfo tokenInfo = AliyunLoginHelper.parseToken(token);
        //2、从token中获取用户信息
        UserInfo userInfo = getUserInfoFromToken(tokenInfo);

        //3、把用户信息存入session（用redies）
        String sessionId = UUIDUtils.getUUID();
        HttpSession session = request.getSession();
        session.setAttribute(sessionId,userInfo);
        session.setMaxInactiveInterval(tokenInfo.getExpiresIn());

        //4、把sessionId存入Cookie
        Cookie cookie = CookieUtil.genCookie(AliyunLoginConstant.ALIYUN_LOGIN_KEY, sessionId,"/",tokenInfo.getExpiresIn());
        CookieUtil.setCookie(response,cookie);

        return "redirect:/";

    }

    /**
     * 从token中获取用户信息
     * @param tokenInfo
     * @return
     */
    private UserInfo getUserInfoFromToken(TokenInfo tokenInfo) {

        IdTokenInfo idTokenInfo = AliyunLoginHelper.parseIdToken(tokenInfo.getIdToken());

        UserInfo userInfo = AliyunLoginHelper.getUserInfoFromIdToken(idTokenInfo);

        return userInfo;
    }



    @Anoymous
    @RequestMapping(value = "test", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Object test(HttpServletRequest request, HttpServletResponse response) {

          return WebCommonOperateTemplate.operate(logger, "test", new DefaultOperateCallback() {
              @Override
              public Object execute() {
                  Map<String,Object> test = new HashMap<>();
                  test.put("name","zhangsan");
                  test.put("age",18);
                  return test;
              }
          });
    }

}
