package com.lamda.flow.meterController.function;

import com.lamda.flow.entity.MeterCycleCheckEntity;
import com.lamda.flow.entity.MeterInStockCheckEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class SubmitInspection {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SubmitInspection.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/submitInspection")
    @ResponseBody
    public String submitInspection(@RequestBody MeterCycleCheckEntity cycleCheckEntity, @RequestParam("token") String token) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(cycleCheckEntity);
        JSONObject jsonObject = null;

        log.info("------------》周期检定申请《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/cycleSave";

        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》周期检定申请成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》周期检定申请失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
