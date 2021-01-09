package com.lamda.flow.meterController.meterLib;

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
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class MeterLibrary {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MeterLibrary.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getMeterLibraryList")
    @ResponseBody
    public String getMeterLibraryList(@RequestParam("userId") String userId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取计量库量仪台账《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getMeasureMeterList?userId=" + userId;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);
        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》获取计量库量仪台账数据成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取计量库量仪台账数据失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
