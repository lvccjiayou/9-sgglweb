package com.lamda.flow.userInfoController;

import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class GetUserInfo {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GetUserInfo.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String getUserInformation(String userId) throws IOException {
        log.info("----------》获取用户信息《------------");
        String url = "http://172.80.11.62:8181/part/rest/user/" + userId;
        JSONObject jsonObject = httpUtil.doGetJson(url);
        if (jsonObject != null) {
            log.info("----------》获取用户信息完成《------------");
            return jsonObject.toString();
        } else {
            log.info("----------》没有该用户信息《------------");
            return null;
        }
    }
}
