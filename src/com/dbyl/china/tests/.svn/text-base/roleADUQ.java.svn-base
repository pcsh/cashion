package com.dbyl.china.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.china.pageAction.Notice;
import com.dbyl.libarary.china.pageAction.RoleManage;
import com.dbyl.libarary.china.pageAction.UserManage;
import com.dbyl.malay.envpars.SetInitEnv;

import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class roleADUQ {
  @Test
  public void Role() throws InterruptedException {
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
      String strRole = "role"+strtime;
      String strCode = strtime;
      System.out.println("新创建的角色："+strRole);
      RoleManage rm = new RoleManage();
      rm.RoleAdd(driver, strRole, strCode);
      Thread.sleep(2000);
      String strNewRole = "new"+strRole;
      rm.RoleEdit(driver, strRole,strNewRole);
      rm.RoleDelete(driver, strNewRole);
      driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
