package com.dbyl.china.tests;

import org.testng.annotations.Test;

import com.dbyl.libarary.china.pageAction.ClientOwner;
import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.malay.envpars.SetInitEnv;

import org.testng.annotations.BeforeMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class clientOwnerADUQ {
  @Test
  public void clientowner() throws InterruptedException {
	  
	  SetInitEnv se = new SetInitEnv();
	  int env = se.SIT();
	  String strLoginq = "pancs_owner";
	  WebDriver driver = se.FirefoxDriver();
	  driver = se.envchoicePartner(env, driver);
	  LoginPage lp = new LoginPage();
	  lp.LoginPartner(strLoginq, "123456", driver);
      Thread.sleep(2000);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginq);
      SimpleDateFormat df = new SimpleDateFormat("MMddHHmm");
      String strtime = df.format(new Date());
      String strphone = "158"+strtime;
      ClientOwner co = new ClientOwner();
	  String strowner = co.ownerAdd(driver, strtime, strphone);
	  co.ownerEdit(driver, strowner);
	  co.ownerDelete(driver, strowner);
	  driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
