package com.lamda.flow.utils;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Component
public class HttpUtil {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HttpUtil.class);

    //带参数请求
    public JSONObject doPostParams(String url, JSONObject params, String token) throws IOException {
        JSONObject jsonObject = null;
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Post方式进行提交
        HttpPost httpPost = new HttpPost(url);
        log.info("--------------》建立请求《--------------");

        //设置请求头
        httpPost.setHeader("X-AUTH-TOKEN",token);
        httpPost.setHeader("Content-Type","application/json");
        httpPost.setHeader("Charset","UTF-8");

        //设置请求参数
        StringEntity stringEntity = new StringEntity(params.toString(), StandardCharsets.UTF_8);
        stringEntity.setContentType("application/json");
        httpPost.setEntity(stringEntity);

        //发送请求
        HttpResponse response = client.execute(httpPost);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        }
        //释放链接
        httpPost.releaseConnection();
        log.info("--------------》结束请求《--------------");
        return jsonObject;
    }

    //不带参数请求
    public JSONObject doGetJson(String url) throws IOException {

        JSONObject jsonObject = null;
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Get方式进行提交
        HttpGet httpGet = new HttpGet(url);
        log.info("--------------》建立请求《--------------");
        //发送请求
        HttpResponse response = client.execute(httpGet);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        }
        //释放链接
        httpGet.releaseConnection();
        log.info("--------------》结束请求《--------------");
        return jsonObject;
    }

    //不带参数请求
    public JSONObject doPostJson(String url,String token) throws IOException {
        JSONObject jsonObject = null;
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Post方式进行提交
        HttpPost httpPost = new HttpPost(url);
        log.info("--------------》建立请求《--------------");
        //设置请求头
        httpPost.setHeader("X-AUTH-TOKEN",token);
        //发送请求
        HttpResponse response = client.execute(httpPost);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        }
        //释放链接
        httpPost.releaseConnection();
        log.info("--------------》结束请求《--------------");
        return jsonObject;
    }

    //返回String请求
    public String doGetString(String url) throws IOException {
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Post方式进行提交
        HttpPost httpPost = new HttpPost(url);
        log.info("--------------》建立请求《--------------");
        //发送请求
        HttpResponse response = client.execute(httpPost);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        String result = EntityUtils.toString(entity, "UTF-8");
        //释放链接
        httpPost.releaseConnection();
        log.info("--------------》结束请求《--------------");
        return result;
    }

    //返回String请求
    public String doPostString(String url, String token) throws IOException {
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Post方式进行提交
        HttpPost httpPost = new HttpPost(url);
        log.info("--------------》建立请求《--------------");
        if (token != null){
            //设置请求头
            httpPost.setHeader("X-AUTH-TOKEN",token);
        }
        //发送请求
        HttpResponse response = client.execute(httpPost);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        String result = EntityUtils.toString(entity, "UTF-8");
        //释放链接
        httpPost.releaseConnection();
        log.info("--------------》请求完成《--------------");
        return result;
    }


    /**
     在进行流的读写时，将连接关闭会导致下一次流读写错误，一定要在流读写完并关闭后才能关闭连接
     在流读写未关闭的情况下关闭连接，会导致后续读写失败
     */
    //返回InputStream请求
    public InputStream doPostObject(String url, String token) throws IOException {
        //初始化httpClient
        DefaultHttpClient client = new DefaultHttpClient();
        //用Post方式进行提交
        HttpPost httpPost = new HttpPost(url);
        log.info("--------------》建立请求《--------------");
        if (token != null){
            //设置请求头
            httpPost.setHeader("X-AUTH-TOKEN",token);
        }
        //发送请求
        HttpResponse response = client.execute(httpPost);
        //获取数据
        HttpEntity entity = response.getEntity();
        //格式转换
        InputStream entityContent = entity.getContent();
        //释放链接
//        httpPost.releaseConnection();
        log.info("--------------》结束请求《--------------");
        return entityContent;
    }
}
