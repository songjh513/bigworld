package com.wuyi.bigworld.web.home.controller;

import com.wuyi.bigworld.web.home.utils.HttpClientUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created  by songjh on 2018-10-13 10:59.
 */
@RestController
public class RestfullController {

    @RequestMapping("/api/{path}")
    public String requestDispatch(@PathVariable String path, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "https://preview.pro.ant.design/api/" + path;
        System.out.println(url);
        String result = HttpClientUtil.HttpGet(url);
        return result;
    }

}
