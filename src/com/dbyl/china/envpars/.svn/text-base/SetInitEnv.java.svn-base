package com.dbyl.china.envpars;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.DriverFactory;

public class SetInitEnv {
	
	private String SITURL()
	{
		String url_sit = "http://test.zyd.onlyou.com/";
		return url_sit;
	}
	
	private String UATURL()
	{
		String url_uat = "http://beta.zyd.onlyou.com/";
		return url_uat;
	}
	
	public WebDriver ChromeDriver()
	{
		DriverFactory df = new DriverFactory();
		String strPath = null;
		strPath = 	"D:\\work\\selenium\\chromedriver.exe"; //chromedriver path
		return df.driverchoice(0, strPath);
	}
	
	public WebDriver IEDriver()
	{
		DriverFactory df = new DriverFactory();
		String strPath = null;
		strPath = 	"E:\\seleniumS\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe";//IEDriver path
		return df.driverchoice(1, strPath);
	}
	
	public WebDriver FirefoxDriver()
	{
		DriverFactory df = new DriverFactory();
		String strPath = null;
		return df.driverchoice(2, strPath);
	}
	
	public WebDriver HtmlUnitDriver()
	{
		DriverFactory df = new DriverFactory();
		String strPath = null;
		df.driverchoice(3,null);
		return df.driverchoice(3, strPath);
	}
	
	
	public int SIT(){
		return 0;
	}
	
	public int UAT(){
		return 1;
	}
	public int MALY(){
		return 2;
	}
	public WebDriver envchoiceManage(int env,WebDriver driver)
	{
         if(env == 0){          //SIT
        	 driver.get(SITURL()+"admin.htm");
        	 return driver;
         }
         else if(env == 1){ //Beta
         //Beta:
        	 driver.get(UATURL()+"admin.htm");
        	 return driver;
         }
         else if(env == 2){ 
             //maly:
            	 driver.get("http://172.16.6.172:8081/");
            	 return driver;
             }
         else{
        	 return driver;
         }		
	}
	
	public Map<String, String> envLoginNameManage(int env)
	{
		 String strLoginM = "pancs_ownerm";
         String strPasswdM ="123456" ;     
         if(env == 0){          //SIT
         strLoginM = "pancs_ownerm";
         strPasswdM = "123456";
         }
         else if(env == 1){ //Beta
         //Beta:
         strLoginM = "demo_op";
         strPasswdM = "123456";
         }
         else if(env == 2){
        	 //maly
        	 strLoginM = "operadmin";
        	 strPasswdM = "1";
         }
         Map<String, String> result = new HashMap<String, String>();
         result.put("strLoginMP", strLoginM);
         result.put("strPasswdMP", strPasswdM);
		return result;
	}
	
	public WebDriver envchoicePartner(int env,WebDriver driver)
	{
		if(env == 0){          //SIT
            driver.get(SITURL()+"login.htm");
            return driver;
            }
        else if(env == 1){ //Beta
            //Beta:
            driver.get(UATURL()+"login.htm");
            return driver;
            }
        else if(env == 2){//maly
        	driver.get("http://172.16.6.172:8081/");
        	return driver;
        	
        }
        else{
        	return driver;
        }
	}
	
	public Map<String, String> envParameters()
	{
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        String strtime = df.format(new Date());
        SimpleDateFormat df2 = new SimpleDateFormat("MMddHHmm");
        String strphone = "158"+df2.format(new Date());
        String qdstrphone = "159"+df2.format(new Date());
        String strLogin = "qd"+strtime;
        String strPasswd = "123456";
        String strqdname = "加盟渠道"+strtime;
        String strcontact = "加盟渠道"+strtime;
        Map<String, String> result = new HashMap<String, String>();
         result.put("strtimeP", strtime);
         result.put("strphoneP", strphone);
         result.put("qdstrphoneP", qdstrphone);
         result.put("strqdnameP", strqdname);
         result.put("strcontactP", strcontact);
         result.put("strLoginP", strLogin);
         result.put("strPasswdP", strPasswd);
		return result;
	}
	
}
