package com.dbyl.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import mx4j.log.Logger;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class HttpClientTest {
	
	private static final String APPLICATION_JSON = "application/json";
	private static final String CONTENT_TYPE_TEXT_JSON = "text/json";
	@SuppressWarnings("deprecation")
	public static void httpPostWithJSON(String url,String json) throws Exception{
		//将JSON进行UTF-8编码，以便传输中文
		String encoderJson = URLEncoder.encode(json,HTTP.UTF_8);
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader(HTTP.CONTENT_TYPE,APPLICATION_JSON);
		StringEntity se = new StringEntity(encoderJson);
		se.setContentType(CONTENT_TYPE_TEXT_JSON);
		se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,APPLICATION_JSON));
		httpPost.setEntity(se);
		CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity);
        } finally {
            response.close();
        }
	}
	
	/*public static String sendSetHeaderGetRequestByPostForJson(String url,Map<String,String> map,Map<String,Object> psotMapString appUid,String listMsgIds ) throws Exception{
		BufferedReader buffer=null;
		String result="";
		try {
		      CloseableHttpClient httpclient = HttpClients.createDefault();
	              RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(3000).setConnectTimeout(3000).build();//设置请求和传输超时时间
		      HttpPost httpPost = new HttpPost(url);
		      httpPost.setConfig(requestConfig);
		      httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
		      httpPost.addHeader(HTTP.CONTENT_TYPE,  "text/json");
		      httpPost.setHeader("appKey", map.get("appKey"));
		      httpPost.setHeader("nonce", map.get("nonce"));
		      httpPost.setHeader("timestamp", map.get("timestamp"));
		      httpPost.setHeader("signature", map.get("signature"));
		      JSONObject obj=JSONObject.fromObject(psotMap);
		       StringEntity se = new StringEntity(obj.toString());
		       se.setContentType("text/json");
		       se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		       httpPost.setEntity(se);
		       CloseableHttpResponse  response= httpclient.execute(httpPost);
		       buffer=new BufferedReader(new InputStreamReader(response.getEntity().getContent(),"utf-8"));
		       result =buffer.readLine();
		       return result;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			buffer.close();
		}
	    return null;
	  }*/
	
	public static String receivePost(HttpServletRequest request) throws IOException, UnsupportedEncodingException {
	        
	        // 读取请求内容
	        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
	        String line = null;
	        StringBuilder sb = new StringBuilder();
	        while((line = br.readLine())!=null){
	            sb.append(line);
	        }
	
	        // 将资料解码
	        String reqBody = sb.toString();
	        return URLDecoder.decode(reqBody, HTTP.UTF_8);
	    }
	
    public static void main(String[] args) throws Exception {
        //新的创建httpClient的方法
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpClient hc = new HttpClient();
        try {
            HttpGet httpGet = new HttpGet("http://test.vop.onlyou.com/interface/bpo/getCustomerList.htm");
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            // The underlying HTTP connection is still held by the response object
            // to allow the response content to be streamed directly from the network socket.
            // In order to ensure correct deallocation of system resources
            // the user MUST call CloseableHttpResponse#close() from a finally clause.
            // Please note that if response content is not fully consumed the underlying
            // connection cannot be safely re-used and will be shut down and discarded
            // by the connection manager.
            try {
                System.out.println(response1.getStatusLine());
                HttpEntity entity1 = response1.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity1);
            } finally {
                response1.close();
            }
            PostMethod method = null;
            //同步企业名录
            //method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/getCustomerList.htm");
            method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/UserValidate.htm");
            JSONObject jsonObject = new JSONObject();
           // jsonObject.put("lastSyncDate", "201501");
            jsonObject.put("username", "pancs_qd");
            jsonObject.put("password", "123456");
            String transJson = jsonObject.toString();
            RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
            method.setRequestEntity(se);
            //使用系统提供的默认的恢复策略
            method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
            //设置超时的时间
            method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);
            
            int statusCode = hc.executeMethod(method);
            System.out.println(statusCode);
            byte[] responseBody = method.getResponseBody();
            System.out.println(new String(responseBody));
            System.out.println("getStatusLine:"+method.getStatusLine());
            String response = new String(method.getResponseBodyAsString().getBytes("utf-8"));
            System.out.println("response:"+response);
            //httpPostWithJSON("http://test.vop.onlyou.com/interface/bpo/getCustomerList.htm",strJson);
            //httpPostWithJSON("http://test.vop.onlyou.com/interface/bpo/billFinished.htm","{'billsCount':1,'customerCode':'66c84403d7b949b4ad70377ac87b360c','path':'/bills/086240201_2/9568679728809/201601/V204200022','date':'201601'}");
/*            
            HttpPost httpPost = new HttpPost("http://test.vop.onlyou.com:80/interface/bpo/billFinished.htm");
            httpPost.addHeader("Content-Type", "application/json");
            List <NameValuePair> nvps = new ArrayList <NameValuePair>();
            nvps.add(new BasicNameValuePair("billsCount", "1"));
            nvps.add(new BasicNameValuePair("customerCode", "66c84403d7b949b4ad70377ac87b360c"));
            nvps.add(new BasicNameValuePair("path","/bills/086240201_2/9568679728809/201601/V204200022"));
            nvps.add(new BasicNameValuePair("date","201601"));
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            CloseableHttpResponse response2 = httpclient.execute(httpPost);
 
            try {
                System.out.println(response2.getStatusLine());
                HttpEntity entity2 = response2.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity2);
            } finally {
                response2.close();
            }*/
        } finally {
            httpclient.close();
        }
    }
}
