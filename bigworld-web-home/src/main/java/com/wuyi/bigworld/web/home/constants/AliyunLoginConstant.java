package com.wuyi.bigworld.web.home.constants;

/**
 * Created  by songjh on 2018-11-03 17:03.
 */
public class AliyunLoginConstant {


    public static final String ALIYUN_LOGIN_KEY = "aliyunLoginKey";

    public static final String REDIRECT_URI_HOST = "http://192.168.126.1:8080/";

    public static final String AUTH_CALLBACK_METHOD = "userLogin";

    public static final String REDIRECT_URI= REDIRECT_URI_HOST+AUTH_CALLBACK_METHOD;

    public static final String CLIENT_ID = "4607555940783953781";

    public static final String CLIENT_SECRET = "gIGG6pKu5qaxdO04oRlditxo1E2v23M3otupT9R6zyYlG7BTtWzqZ3o1Ifk1HcZx";

    public static final String AUTH_CODE_ENDPOINT = "https://signin.aliyun.com/oauth2/v1/auth?response_type=code&client_id="+CLIENT_ID+"&redirect_uri="+REDIRECT_URI;

    public static String TOKEN_ENDPOINT = "https://oauth.aliyun.com/v1/token?grant_type=authorization_code&client_id="+CLIENT_ID+"&redirect_uri="+REDIRECT_URI
              +"&client_secret="+CLIENT_SECRET+"&code=";



}
