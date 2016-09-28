package com.dbyl.china.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.china.pageAction.Notice;
import com.dbyl.libarary.china.pageAction.Organization;
import com.dbyl.libarary.china.pageAction.UserManage;
import com.dbyl.malay.envpars.SetInitEnv;

import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class OrgADUQ {
  @Test
  public void User() throws InterruptedException {
	  SetInitEnv se = new SetInitEnv();
	  int env = se.UAT();
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
      Organization oz = new Organization();
      String orgName = "新组织"+strtime;
      String orgCode = "CODE"+strtime;
      String phone = strtime;
      oz.OrgAdd(driver, orgName, orgCode, phone);
      Thread.sleep(3000);
      driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
