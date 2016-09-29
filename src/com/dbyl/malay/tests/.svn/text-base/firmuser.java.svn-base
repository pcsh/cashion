package com.dbyl.malay.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.dbyl.libarary.malay.pageAction.Notice;
import com.dbyl.libarary.malay.pageAction.UserManage;
import com.dbyl.libarary.malay.pageAction.loginmaly;
import com.dbyl.malay.envpars.SetInitEnv;

public class firmuser {
  @Test
  public void user() throws IOException, InterruptedException {
	  SetInitEnv initenv = new SetInitEnv();

      String strLogin = initenv.envParameters().get("strLoginP");
//      String strPasswd = initenv.envParameters().get("strPasswdP");
      int env =initenv.MALY();
      
      Thread.sleep(1000);
      
      WebDriver driver = initenv.ChromeDriver();
      
      Thread.sleep(1000);
      
      driver = initenv.envchoiceManage(env,driver);

      
      loginmaly testa = new loginmaly();
      Thread.sleep(1000);
      testa.LoginPartner("pancs_qd","123456",driver);
      Thread.sleep(5000);
      Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),"pancs_qd");
	  Thread.sleep(1000);

		  Notice nc = new Notice();
          nc.NoticeSure(driver);

          UserManage user = new UserManage();
   //添加用户  
          user.UserAdd(driver, strLogin);
          System.out.println("新建渠道管理员："+strLogin);
      //  修改邮箱和身份
          user.UserEdit(driver, strLogin);
          //删除用户
	  user.UserDelete(driver, strLogin);
	  
	  //企业主企业
	  
	  driver.navigate().refresh();
	 // driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
