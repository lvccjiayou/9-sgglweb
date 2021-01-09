package com.lamda.flow.meterController.function;

import com.lamda.flow.entity.MeterInStockCheckEntity;
import com.lamda.flow.entity.MeterScrapEntity;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class Scrap {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Scrap.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/scrap")
    @ResponseBody
    public String scrap(@RequestBody MeterScrapEntity scrapEntity, @RequestParam("token") String token) throws Exception {
        JSONObject objectToJson = JSONObject.fromObject(scrapEntity);
        JSONObject jsonObject = null;

        log.info("------------》报废申请《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/scrapSave";

        if (objectToJson != null) {
            jsonObject = httpUtil.doPostParams(url, objectToJson, token);
        }

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》报废申请成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》报废申请失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }
}
