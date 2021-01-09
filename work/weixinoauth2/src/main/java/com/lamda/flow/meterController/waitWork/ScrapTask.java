package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterOutStockEntity;
import com.lamda.flow.entity.MeterScrapEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class ScrapTask {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ScrapTask.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/scrapTask")
    @ResponseBody
    public String scrapTask(@RequestBody MeterScrapEntity scrapEntity, @RequestParam("token") String token , @RequestParam("comment") String comment) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(scrapEntity);
        JSONObject jsonObject = null;

        log.info("------------》报废审批《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/scrapTaskSave?comment=" + comment;
        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》报废审批成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》报废审批失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
