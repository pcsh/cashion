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


public class superadmin {
  @Test
  public void sueradminjob() throws IOException, InterruptedException {
	  SetInitEnv initenv = new SetInitEnv();
      String strtime = initenv.envParameters().get("strtimeP");
      String strphone = initenv.envParameters().get("strphoneP");
      String qdstrphone = initenv.envParameters().get("qdstrphoneP");
      String strqdname = initenv.envParameters().get("strqdnameP");
      String strcontact = initenv.envParameters().get("strcontactP");
      String strLogin = initenv.envParameters().get("strLoginP");
      int env =initenv.MALY();
      
      Thread.sleep(1000);
     
      WebDriver driver = initenv.ChromeDriver();
      
      Thread.sleep(1000);
      
      driver = initenv.envchoiceManage(env,driver);
      
      loginmaly testa = new loginmaly();
      Thread.sleep(1000);
      testa.LoginPartner("superadmin","1",driver);
      Thread.sleep(5000);
      Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),"Superadmin");
	  Thread.sleep(1000);

		  Notice nc = new Notice();
          nc.NoticeSure(driver);

	 
      
	 
	 Executionjob job = new Executionjob();
	 job.createGlTaskBatch(driver, "Generate task");
	closeall.close("tabpanel_action_down", "Close all", driver); 
	 // driver.navigate().refresh();
	 // driver.quit();
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
