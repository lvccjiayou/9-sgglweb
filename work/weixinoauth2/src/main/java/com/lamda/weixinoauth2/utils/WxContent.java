package com.lamda.weixinoauth2.utils;

/**
 * 企业微信相关配置常量类
 */
public class WxContent {
    /**填写自己的企业微信ID*/
    public static final String WX_APP_ID = "wx7f82ec59227d4f07";
    /**填写自己创建应用的SECRENT*/
    public static final  String WX_SECRENT="Cb1KhlshodpcxdFnBdm-dP9yPQsKCmaQaa-NPihjZKE";
    /**应用授权作用域。企业自建应用固定填写：snsapi_base*/
    public static final String WX_SNSAPI_BASE = "snsapi_userinfo";
    /**重定向后会带上state参数，企业可以填写a-zA-Z0-9的参数值，长度不可超过128个字节*/
    public static final String WX_STATE= "STATE";
    /**网页授权连接URL，固定*/
    public static String WX_CONNECT_OAUTH2_AUTHORIZE_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=%s&state=%s&connect_redirect=1#wechat_redirect";
    /**获取token地址URL，固定*/
    public static String WX_GET_TOKEN_URL="https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET";
    /**获取访问用户身份URL，固定*/
    public static String WX_GET_USERID_URL="https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
    /**读取通讯录用户信息URL，固定*/
    public static String WX_GET_USERINFO_URL="https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";
    /**获取企业jsapi的参数的URL，固定*/
    public static String WX_GET_JSAPI_TICKET_URL="https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token=ACCESS_TOKEN";
    /**获取企业jsapi的参数的URL，固定*/
    public static String WX_GET_AGENT_JSAPI_TICKET_URL="https://qyapi.weixin.qq.com/cgi-bin/ticket/get?access_token=ACCESS_TOKEN&type=agent_config";
}
