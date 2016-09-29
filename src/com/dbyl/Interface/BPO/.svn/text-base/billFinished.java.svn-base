package com.dbyl.Interface.BPO;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.JSONObject;

/*
 * 已传票完毕通知
 */
public class billFinished {
	  public static void main(String[] args) throws Exception {	       
	            HttpClient hc = new HttpClient();
	            PostMethod method = null;
	            JSONObject jsonObject = new JSONObject();
	            //设置url以及json参数：
	            method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/billFinished.htm");	           
	            jsonObject.put("billsCount", "5");
	            jsonObject.put("customerCode", "937a6c26f8e04f4d941e9dc12d7b7536");
	            jsonObject.put("path","/bills/1004/1474613050035/201602/V241000018");
	            jsonObject.put("date","201602");
	            String transJson = jsonObject.toString();
	            System.out.println(transJson);
	            //String transJson1 ="{\"billsCount\":\"5\",\"customerCode\":\"937a6c26f8e04f4d941e9dc12d7b7536\",\"path\":\"/bills/1004/1474613050035/201602/V241000018\",\"date\":\"201602\"}";
	            //System.out.println(transJson1);
	            RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
	            method.setRequestEntity(se);
	            //使用系统提供的默认的恢复策略
	            method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
	            //设置超时的时间
	            method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);	            
	            hc.executeMethod(method);
	            byte[] responseBody = method.getResponseBody();
	            System.out.println(new String(responseBody));
	            System.out.println("getStatusLine:"+method.getStatusLine());
	            String response = new String(method.getResponseBodyAsString().getBytes("utf-8"));
	            System.out.println("response:"+response);
	    }
}
