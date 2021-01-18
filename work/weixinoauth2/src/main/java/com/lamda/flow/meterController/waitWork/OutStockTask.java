package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterInStockCheckEntity;
import com.lamda.flow.entity.MeterOutStockEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class OutStockTask {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OutStockTask.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/outStockTask")
    @ResponseBody
    public String outStockTask(@RequestBody MeterOutStockEntity outStockEntity, @RequestParam("token") String token , @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(outStockEntity);
        JSONObject jsonObject = null;

        log.info("------------》出库审批《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/outStockTaskSave?comment=" + comment;
        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》出库审批成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》出库审批失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return jsonObject.toString();
        }

    }
}
