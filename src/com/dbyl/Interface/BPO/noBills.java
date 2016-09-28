package com.dbyl.Interface.BPO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class noBills {
  @Test
  public void noBillsF() throws JSONException, IOException {
      HttpClient hc = new HttpClient();
      PostMethod method = null;
      JSONObject jsonObject = new JSONObject();
      //////////////////////////////////////////
      //设置url以及json参数：
      method = new PostMethod("http://test.vop.onlyou.com/interface/bpo/noBills.htm");	           
      jsonObject.put("customerCode", "ffd92cf3256f464f973deccca5435c3e");
      jsonObject.put("date","201508");
      //////////////////////////////////////////
      String transJson = jsonObject.toString();
      System.out.println(transJson);
      RequestEntity se = new StringRequestEntity(transJson,"application/json","UTF-8");
      method.setRequestEntity(se);
      //使用系统提供的默认的恢复策略
      method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
      //设置超时的时间
      method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 3000);	            
      hc.executeMethod(method);
      InputStream strStream = method.getResponseBodyAsStream();
      ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream(); 
      int   i=-1; 
      while((i=strStream.read())!=-1){ 
      baos.write(i); 
      } 
     String strBody =   baos.toString(); 
      System.out.println(new String(strBody));
      System.out.println("getStatusLine:"+method.getStatusLine());
  }
}
