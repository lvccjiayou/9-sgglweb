package com.lamda.flow.tokenController;

import com.lamda.flow.utils.HttpUtil;
import com.lamda.weixinoauth2.oauth2.Oauth2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class GetToken {

    @Autowired
    private HttpUtil httpUtil;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Oauth2.class);

    @RequestMapping("/getToken")
    @ResponseBody
    public String getToken(@RequestParam("username") String username, @RequestParam("password") String password) throws IOException {
        log.info("------------》获取token《------------");
        if (!username.equals("") && !password.equals("")) {
            String url = "http://172.80.11.62:8181/part/rest/tokens?username=" + username + "&password=" + password;
            String token = httpUtil.doPostString(url,null);
            log.info("-----------》获取token成功《------------" + token);
            return token;
        } else {
            log.info("-----------》获取token失败《------------");
            return "用户不存在";
        }

    }
}
