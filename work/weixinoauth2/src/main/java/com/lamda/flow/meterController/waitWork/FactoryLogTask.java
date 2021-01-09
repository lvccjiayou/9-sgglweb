package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterFactoryLogEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class FactoryLogTask {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FactoryLogTask.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/factoryLogTask")
    @ResponseBody
    public String factoryLogTask(@RequestBody MeterFactoryLogEntity factoryLogEntity, @RequestParam("token") String token, @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(factoryLogEntity);
        JSONObject jsonObject = null;

        log.info("------------》" + factoryLogEntity.getAction() + "审批《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/factoryLogTaskSave?comment=" + comment;

        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》" + factoryLogEntity.getAction() + "审批成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》" + factoryLogEntity.getAction() + "审批失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
