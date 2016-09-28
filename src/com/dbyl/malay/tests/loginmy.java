package com.dbyl.malay.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.dbyl.libarary.malay.pageAction.*;
import com.dbyl.libarary.utils.*;
import com.dbyl.malay.envpars.SetInitEnv;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class loginmy {
  @Test
  public void Login() throws IOException, InterruptedException{
      
      SetInitEnv initenv = new SetInitEnv();
      String strtime = initenv.envParameters().get("strtimeP");
      String strphone = initenv.envParameters().get("strphoneP");
      String qdstrphone = initenv.envParameters().get("qdstrphoneP");
      String strqdname = initenv.envParameters().get("strqdnameP");
      String strcontact = initenv.envParameters().get("strcontactP");
      String strLogin = initenv.envParameters().get("strLoginP");
      String strPasswd = initenv.envParameters().get("strPasswdP");
      int env =initenv.MALY();
      
      Thread.sleep(2000);
      
      WebDriver driver = initenv.ChromeDriver();
      
      Thread.sleep(5000);
      
      driver = initenv.envchoiceManage(env,driver);
      String strLoginM = initenv.envLoginNameManage(env).get("strLoginMP");
      String strPasswdM = initenv.envLoginNameManage(env).get("strPasswdMP");
      System.out.println("登录账号："+strLoginM);
      
      loginmaly testa = new loginmaly();
      testa.LoginManage(strLoginM, strPasswdM, driver);
      Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginM);
      
      Thread.sleep(5000);

		  Notice nc = new Notice();
          nc.NoticeSure(driver);
	 
      Thread.sleep(5000);
      
      AcctFirmList testb = new AcctFirmList();
      testb.creataccfirm(driver, strLogin, strqdname, qdstrphone, strcontact);
      System.out.println("渠道账号："+strLogin);

      Thread.sleep(5000);
      
      //aLoginOut
      logout logout1 = new logout();
      logout1.logout("aLoginOut", driver);
 
      driver = initenv.envchoiceManage(env,driver);
      Thread.sleep(5000);
      testa.LoginPartner(strLogin,"123456",driver);
      Thread.sleep(5000);

		 
          nc.NoticeSure(driver);

      Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
	  Thread.sleep(5000);
      
      driver.quit();}

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
