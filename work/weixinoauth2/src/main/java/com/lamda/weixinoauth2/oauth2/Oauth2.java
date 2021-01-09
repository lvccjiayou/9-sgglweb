package com.lamda.weixinoauth2.oauth2;

import com.lamda.weixinoauth2.utils.HttpUtils;
import com.lamda.weixinoauth2.utils.WxContent;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weixin")
@CrossOrigin(maxAge = 10)
public class Oauth2 {

    @Autowired
    private HttpUtils httpUtil;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Oauth2.class);

    @RequestMapping("/getUserId")
    @ResponseBody
    public JSONObject getUserId(String code) throws Exception {
        log.info("-------->微信授权用户验证<----------");
        //获取token
        String tokenUrl = WxContent.WX_GET_TOKEN_URL.replace("ID", WxContent.WX_APP_ID).replace("SECRET", WxContent.WX_SECRENT);
        String token = httpUtil.doGetJson(tokenUrl).get("access_token").toString();
        log.info("获取到的token为：" + token);

        //组装请求userId的请求路径
        log.info("前端传递的code="+code);
        String userIdUrl = WxContent.WX_GET_USERID_URL.replace("CODE", code).replace("ACCESS_TOKEN", token);
        JSONObject jsonObject = httpUtil.doGetJson(userIdUrl);
        log.info("获取到的用户基本信息为:" + jsonObject);

//        //获取访问用户身份的详细信息
//        String userUrl = WxContent.WX_GET_USERINFO_URL.replace("ACCESS_TOKEN", token).replace("USERID", jsonObject.getString("UserId"));
//        JSONObject userInfo = httpUtil.doGetJson(userUrl);
//        log.info("访问用户身份详细信息:"+userInfo);
        return jsonObject;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "测试方法!!!!!!!!!!!!!";
    }
}
