package com.lamda.flow.meterController.function;

import com.lamda.flow.entity.MeterAdjustEntity;
import com.lamda.flow.entity.MeterScrapEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class Adjust {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Adjust.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/adjust")
    @ResponseBody
    public String adjust(@RequestBody MeterAdjustEntity adjustEntity, @RequestParam("token") String token) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(adjustEntity);
        JSONObject jsonObject = null;

        log.info("------------》校对申请《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/adjustSave";

        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》校对申请成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》校对申请失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
