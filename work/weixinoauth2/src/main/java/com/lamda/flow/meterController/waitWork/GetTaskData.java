package com.lamda.flow.meterController.waitWork;

import com.lamda.flow.entity.MeterInStockCheckEntity;
import com.lamda.flow.meterController.meterLib.MeterLibrary;
import com.lamda.flow.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.apache.logging.log4j.core.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.nio.ch.IOUtil;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

@Controller
@RequestMapping("/meter")
@CrossOrigin(maxAge = 10)
public class GetTaskData {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GetTaskData.class);

    @Autowired
    private HttpUtil httpUtil;

    @RequestMapping("/getTaskData")
    @ResponseBody
    public String getTaskData(@RequestParam("taskId") String taskId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取代办数据表单《-----------");

        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getTaskData?taskId=" + taskId;
        JSONObject jsonObject = httpUtil.doPostJson(url, token);

        if (jsonObject.get("ok").equals(true)) {
            log.info("------------》获取代办数据表单成功《-----------");
            return jsonObject.toString();
        } else {
            log.info("------------》获取代办数据表单失败《-----------");
            log.info("异常信息：" + jsonObject.toString());
            return null;
        }

    }

    @RequestMapping("/getFlowImage")
    @ResponseBody
    public byte[] getFlowImage(@RequestParam("processInstanceId") String processInstanceId, @RequestParam("token") String token) throws Exception {
        log.info("------------》获取流程图片《-----------");

        String url = "http://172.80.11.62:8181/part/rest/meterLedgerApiController/getFlowImage?processInstanceId=" + processInstanceId;

        InputStream inputStream = httpUtil.doPostObject(url, token);

        if (inputStream != null) {
            //图片输入流转为字节数组输出
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[4096 * 2];
            int read;
            while ((read = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,read);
            }
            byte[] png = outputStream.toByteArray();
            inputStream.close();
            outputStream.close();
            log.info("------------》获取流程图片成功《-----------");
            return png;
        } else {
            inputStream.close();
            log.info("------------》获取流程图片失败《-----------");
            return null;
        }

    }
}
