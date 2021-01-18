package com.lamda.flow.meterController.myApply;

import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class MyApply {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MyApply.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/myApply")
    @ResponseBody
    public String getApplyList(@RequestParam("userId") String userId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取我的申请列表《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getMyList?userId=" + userId;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);
        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》获取我的申请列表数据成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取我的申请列表数据失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return jsonObject.toString();
        }

    }

    @RequestMapping("/meterTest")
    @ResponseBody
    public String meterTest(){
        log.info("------------》测试《-----------");
        return "meter请求测试>----------------";
    }

}
