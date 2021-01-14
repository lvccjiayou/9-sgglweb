package com.lamda.weixinoauth2.oauth2;

import com.lamda.weixinoauth2.utils.HttpUtils;
import com.lamda.weixinoauth2.utils.WxContent;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/weixin")
@CrossOrigin(maxAge = 10)
public class Oauth2 {

    @Autowired
    private HttpUtils httpUtils;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Oauth2.class);
    /**
     * 获取token
     * @return
     * @throws Exception
     */
    public String getToken() throws Exception {
        //获取token
        String tokenUrl = WxContent.WX_GET_TOKEN_URL.replace("ID", WxContent.WX_APP_ID).replace("SECRET", WxContent.WX_SECRENT);
        String token = httpUtils.doGetJson(tokenUrl).get("access_token").toString();
        log.info("获取到的token为：" + token);
        return token;
    }
    /**
     * 获取userId
     * @param code
     * @return
     * @throws Exception
     */
    @RequestMapping("/getUserId")
    @ResponseBody
    public JSONObject getUserId(String code) throws Exception {
        log.info("-------->微信授权用户验证<----------");
        String token = getToken();
        //组装请求userId的请求路径
        String userIdUrl = WxContent.WX_GET_USERID_URL.replace("CODE", code).replace("ACCESS_TOKEN", token);
        JSONObject jsonObject = httpUtils.doGetJson(userIdUrl);
        log.info("获取到的用户基本信息为:" + jsonObject);

        return jsonObject;
    }

    /**
     * 获取用户详细信息
     * @param jsonObject
     * @return
     * @throws Exception
     */
    public JSONObject getUserInfo(JSONObject jsonObject) throws Exception {
        log.info("-------->微信获取用户详细信息<----------");
        String token = getToken();
//        //获取访问用户身份的详细信息
        String userUrl = WxContent.WX_GET_USERINFO_URL.replace("ACCESS_TOKEN", token).replace("USERID", jsonObject.getString("UserId"));
        JSONObject userInfo = httpUtils.doGetJson(userUrl);
        log.info("访问用户身份详细信息:"+userInfo);
        return userInfo;
    }

    /**
     * 获取企业jsapi_ticket
     * @param url
     * @return
     * @throws Exception
     */
    @RequestMapping("/getJsapi")
    @ResponseBody
    public JSONObject getJsapi(String url) throws Exception {
        log.info("--------->获取jsapi参数<--------");
        String token = getToken();
        Map<String, String> ret = new HashMap<>();
        //请求jsapi的路径
        String jsapiUrl = WxContent.WX_GET_JSAPI_TICKET_URL.replace("ACCESS_TOKEN", token);
        JSONObject jsapiJson = httpUtils.doGetJson(jsapiUrl);
        log.info("获取到的jsapi信息为:" + jsapiJson);

        //组装解析为signature的字符串
        String nonceStr = UUID.randomUUID().toString();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        String string1 = "jsapi_ticket=" + jsapiJson.get("ticket") +
                "&noncestr=" + nonceStr +
                "&timestamp=" + timestamp +
                "&url=" + url;
        //使用SHA1安全签名算法生成signature签名
        String signature = SHA1(string1);
        log.info("生成的签名为:" + signature);
        //组装响应的json对象
        ret.put("appId", WxContent.WX_APP_ID);
        ret.put("nonceStr", nonceStr);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        JSONObject jsonObject = JSONObject.fromObject(ret);
        log.info("获取签名的响应结果为:" + jsonObject.toString());
        return jsonObject;
    }

    /**
     * 获取应用jsapi_ticket
     * @param url
     * @return
     * @throws Exception
     */
    @RequestMapping("/getJsapi_agent")
    @ResponseBody
    public JSONObject getAgentJsapi(String url) throws Exception {
        log.info("--------->获取Jsapi_agent参数<--------");
        String token = getToken();
        Map<String, String> ret = new HashMap<>();
        //请求jsapi的路径
        String jsapiUrl = WxContent.WX_GET_AGENT_JSAPI_TICKET_URL.replace("ACCESS_TOKEN", token);
        JSONObject jsapiJson = httpUtils.doGetJson(jsapiUrl);
        log.info("获取到的jsapi信息为:" + jsapiJson);

        //组装解析为signature的字符串
        String nonceStr = UUID.randomUUID().toString();
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        String string1 = "jsapi_ticket=" + jsapiJson.get("ticket") +
                "&noncestr=" + nonceStr +
                "&timestamp=" + timestamp +
                "&url=" + url;
        //使用SHA1安全签名算法生成signature签名
        String signature = SHA1(string1);
        log.info("生成的签名为:" + signature);
        //组装响应的json对象
        ret.put("corpid", WxContent.WX_APP_ID);
        ret.put("nonceStr", nonceStr);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        JSONObject jsonObject = JSONObject.fromObject(ret);
        log.info("获取签名的响应结果为:" + jsonObject.toString());
        return jsonObject;
    }

    /**
     * SHA1安全加密算法
     * @param str
     * @return
     */
    public String SHA1(String str) {
        try {
            //如果是SHA加密只需要将"SHA-1"改成"SHA"即可
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
            digest.update(str.getBytes());
            byte[] messageDigest = digest.digest();
            // Create Hex String
            StringBuilder hexStr = new StringBuilder();
            // 字节数组转换为 十六进制 数
            for (byte b : messageDigest) {
                String shaHex = Integer.toHexString(b & 0xFF);
                if (shaHex.length() < 2) {
                    hexStr.append(0);
                }
                hexStr.append(shaHex);
            }
            return hexStr.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 微信oauth2验证测试
     * @return
     */
    @RequestMapping("/weixinTest")
    @ResponseBody
    public String test() {
        return "微信验证测试方法!!!!!!!!!!!!!";
    }
}
