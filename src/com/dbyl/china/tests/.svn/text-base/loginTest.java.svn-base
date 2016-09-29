package com.dbyl.china.tests;

import com.dbyl.libarary.china.pageAction.*;
import com.dbyl.libarary.utils.*;
import com.dbyl.china.envpars.SetInitEnv;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class loginTest {

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
        int env =initenv.SIT();
        
        Thread.sleep(2000);
        
        WebDriver driver = initenv.FirefoxDriver();
        
        Thread.sleep(3000);
        
        driver = initenv.envchoiceManage(env,driver);
        String strLoginM = initenv.envLoginNameManage(env).get("strLoginMP");
        String strPasswdM = initenv.envLoginNameManage(env).get("strPasswdMP");
        System.out.println("运维账号："+strLoginM);
        
        LoginPage testa = new LoginPage();
        testa.LoginManage(strLoginM, strPasswdM, driver);
        //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLoginM);
        Snapshot sp = new Snapshot();
        sp.snapshot((TakesScreenshot)driver, "./test-output/manager.png");
        Thread.sleep(3000);
        
        
        CreatPartner testb = new CreatPartner();
        testb.CreatPartner(driver, strLogin, strqdname, qdstrphone, strcontact);
        System.out.println("渠道管理员账号："+strLogin);
        sp.snapshot((TakesScreenshot)driver, "./test-output/createpartner.png");
 
        Thread.sleep(10000);
        
        driver = initenv.envchoicePartner(env,driver);
        
        Thread.sleep(2000);
        testa.LoginPartner(strLogin,strPasswd,driver);
        Thread.sleep(2000);
        //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
        sp.snapshot((TakesScreenshot)driver, "./test-output/partner.png");
        Thread.sleep(3000);
        
        driver.quit();
  } 


  @BeforeMethod
  public void beforeMethod(){

  }

  @AfterMethod
  public void afterMethod(){

  }

}
