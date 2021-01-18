package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterAdjustEntity;
import com.lamda.flow.entity.MeterOutStockEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class AdjustTask {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdjustTask.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/adjustTask")
    @ResponseBody
    public String adjustTask(@RequestBody MeterAdjustEntity adjustEntity, @RequestParam("token") String token , @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(adjustEntity);
        JSONObject jsonObject = null;

        log.info("------------》" + adjustEntity.getBpmStatus() + "审批《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/adjustTaskSave?comment=" + comment;
        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》" + adjustEntity.getBpmStatus() + "审批成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》" + adjustEntity.getBpmStatus() + "审批失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return jsonObject.toString();
        }

    }
}
