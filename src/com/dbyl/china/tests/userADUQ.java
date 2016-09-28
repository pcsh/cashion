package com.dbyl.china.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.china.pageAction.Notice;
import com.dbyl.libarary.china.pageAction.UserManage;
import com.dbyl.malay.envpars.SetInitEnv;

import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class userADUQ {
  @Test
  public void User() throws InterruptedException {
	  SetInitEnv se = new SetInitEnv();
	  int env = se.SIT();
	  String strLoginq = "pancs_owner";
	  WebDriver driver = se.FirefoxDriver();
	  driver = se.envchoicePartner(env, driver);
	  LoginPage lp = new LoginPage();
	  lp.LoginPartner(strLoginq, "123456", driver);
      Thread.sleep(2000);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginq);
      SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
      String strtime = df.format(new Date());
      String strLogin = "test"+strtime;
      System.out.println("新创建的账号："+strLogin);
      UserManage um = new UserManage();
	  um.UserAdd(driver, strLogin);
	  driver = se.envchoicePartner(env, driver);
	  lp.LoginPartner(strLogin, "123456", driver);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
	  driver = se.envchoicePartner(env, driver);
	  lp.LoginPartner(strLoginq, "123456", driver);
      Thread.sleep(2000);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginq);
      um.UserEdit(driver, strLogin);
      um.UserDelete(driver, strLogin);
      driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
