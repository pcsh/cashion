package com.dbyl.example;

import org.testng.annotations.Test;

import com.dbyl.china.envpars.SetInitEnv;
import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.utils.PageExist;
import com.dbyl.malay.envpars.DBEnv;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class SWFUpload {
  @Test
  public void f() throws InterruptedException {
	    SetInitEnv initenv = new SetInitEnv();
	      String strtime = initenv.envParameters().get("strtimeP");
	      String strphone = initenv.envParameters().get("strphoneP");
	      String qdstrphone = initenv.envParameters().get("qdstrphoneP");
	      String strqdname = initenv.envParameters().get("strqdnameP");
	      String strcontact = initenv.envParameters().get("strcontactP");
	      String strLogin = initenv.envParameters().get("strLoginP");
	      String strPasswd = initenv.envParameters().get("strPasswdP");
	      //String strLoginq = initenv.envParameters().get("str99");
	      
	/*      
	      int env =initenv.UAT();
	      strLogin = "demo";//UAT渠道管理员帐号
	   */   
	      //System.out.println(strLoginq);
	      int env =initenv.UAT();
	      strLogin = "地销A";
	      
	      DBEnv dbinitenv = new DBEnv();
	      String strUrl = dbinitenv.envDB(env,0).get("strUrlP");
	      String strUser = dbinitenv.envDB(env,0).get("strUserP");
	      String strPwd = dbinitenv.envDB(env,0).get("strPwdP");
	      Thread.sleep(2000);
	      
	      WebDriver driver = initenv.FirefoxDriver();
	      
	      
	      LoginPage testa = new LoginPage();
	      
	      driver = initenv.envchoicePartner(env,driver);      
	      Thread.sleep(3000);
	      driver.get("http://beta.onlyou.com:8888/admin/");
	      testa.LoginManage(strLogin, strPasswd, driver);
	      Thread.sleep(3000);
	      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
	      Thread.sleep(3000);
		  PageExist pe = new PageExist();
	//渠道合同（BEGIN）
		 pe.PageExist("item-pnm","item-pnm80","toolbarPluginpnm80Frame",driver);
	  driver.findElement(By.linkText("新增")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("uploadOper")).click();
	  //String js1 = "var new_uploadOper=document.getElementById(\'"uploadOper\'");new_uploadOper.setAttribute(\"style\",\"display:block\");";
	  
	  Thread.sleep(5000);
	//渠道合同（END）
	 
	 
	 driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
