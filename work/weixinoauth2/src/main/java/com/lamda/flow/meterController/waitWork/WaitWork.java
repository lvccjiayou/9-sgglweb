package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.meterController.myApply.MyApply;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(maxAge = 10)
@RequestMapping("/meter")
public class WaitWork {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WaitWork.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getWaitWork")
    @ResponseBody
    public String getWaitWork(@RequestParam("userId") String userId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取待办工作列表《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getTodoList?userId=" + userId;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);
        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》获取待办工作列表数据成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取待办工作列表数据失败《-----------");
            return null;
        }
    }
}
