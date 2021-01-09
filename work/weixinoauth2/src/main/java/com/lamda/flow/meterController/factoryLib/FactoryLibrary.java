package com.lamda.flow.meterController.factoryLib;

import com.lamda.flow.meterController.scrapLib.ScrapLibrary;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(maxAge = 10)
@RequestMapping("/meter")
public class FactoryLibrary {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FactoryLibrary.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getFactoryLibraryList")
    @ResponseBody
    public String getFactoryLibraryList(@RequestParam("userId") String userId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取分厂库量仪台账《-----------");
        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getFactoryMeterList?userId=" + userId;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);
        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》获取分厂库量仪数据成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取分厂库量仪数据失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }
    }
}
