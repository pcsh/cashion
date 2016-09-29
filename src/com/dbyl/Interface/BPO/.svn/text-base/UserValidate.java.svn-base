package com.dbyl.Interface.BPO;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.JSONObject;

public class UserValidate {
	  public static void main(String[] args) throws Exception {
	        HttpClient hc = new HttpClient();
	            PostMethod method = null;
	            //同步企业名录
	            method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/UserValidate.htm");
	            JSONObject jsonObject = new JSONObject();
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
	    }
}
