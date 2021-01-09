package com.lamda.flow.userByRole;

import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class GetUserByRole {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GetUserByRole.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getUserByRoleList")
    @ResponseBody
    public String getUserByRoleList(@RequestParam("roleCode") String roleCode, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取量仪检定员台账《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getUserByRole?roleCode=" + roleCode;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);
        if (jsonObject != null) {
            log.info("------------》获取量仪检定员台账数据成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取量仪检定员台账数据失败《-----------");
            return null;
        }

    }
}
