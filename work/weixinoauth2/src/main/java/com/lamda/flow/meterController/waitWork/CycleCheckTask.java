package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterCycleCheckEntity;
import com.lamda.flow.entity.MeterOutStockEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class CycleCheckTask {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CycleCheckTask.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/cycleCheck")
    @ResponseBody
    public String cycleCheck(@RequestBody MeterCycleCheckEntity cycleCheckEntity, @RequestParam("token") String token , @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(cycleCheckEntity);

        JSONObject jsonObject = null;

        log.info("------------》周期检定《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/cycleTaskSave?comment=" + comment;
        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》周期检定成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》周期检定失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }

    @RequestMapping("/cycleCheckTask")
    @ResponseBody
    public String cycleCheckTask(@RequestBody MeterCycleCheckEntity cycleCheckEntity, @RequestParam("token") String token , @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(cycleCheckEntity);

        JSONObject jsonObject = null;

        log.info("------------》周期检定审批《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/cycleTaskSave?comment=" + comment;
        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》周期检定审批成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》周期检定审批失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
