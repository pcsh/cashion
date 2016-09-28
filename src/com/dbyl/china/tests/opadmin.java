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


public class opadmin {

  @Test
  public void operationadmin() throws IOException, InterruptedException{
        
        SetInitEnv initenv = new SetInitEnv();
        String strtime = initenv.envParameters().get("strtimeP");
        String strphone = initenv.envParameters().get("strphoneP");
        String qdstrphone = initenv.envParameters().get("qdstrphoneP");
        String strqdname = initenv.envParameters().get("strqdnameP");
        String strcontact = initenv.envParameters().get("strcontactP");
        String strLogin = initenv.envParameters().get("strLoginP");
        int env =initenv.SIT();
        
        Thread.sleep(2000);
        
        WebDriver driver = initenv.FirefoxDriver();
        
        Thread.sleep(3000);
        
        driver = initenv.envchoiceManage(env,driver);
        
        LoginPage testa = new LoginPage();
        testa.LoginManage("sunyan", "123456", driver);
        Thread.sleep(3000);
        
        //创建渠道
        CreatPartner testb = new CreatPartner();
        testb.CreatPartner(driver, strLogin, strqdname, qdstrphone, strcontact);
        System.out.println("渠道管理员账号："+strLogin);
        Thread.sleep(15000);
        //分配任务
        AssignTask at = new AssignTask();
        at.Assignsalesman(driver, strqdname);
        //启动试用
        StartTask start = new StartTask();
        start.startrying(driver, strqdname);
        //接受任务
        ImplementationTask imt=new ImplementationTask();        
        imt.accept(driver, strqdname);
        //试用记录
        TryingRecord trecord=new TryingRecord();
        trecord.create(driver, strqdname);
        //启动切换
        start.startchange(driver, strqdname); 
        //接受任务
        imt.accept(driver, strqdname);
        //切换记录
        ChangeRecord crecord= new ChangeRecord();
        crecord.create(driver, strqdname);
        //日常记录
        DailyRecord drecord =new DailyRecord();
        drecord.create(driver, strqdname);
        
        driver.quit();
  } 


  @BeforeMethod
  public void beforeMethod(){

  }

  @AfterMethod
  public void afterMethod(){

  }

}
