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

public class clientmanage {
  @Test
	  public void clientma() throws IOException, InterruptedException {
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
	      testa.LoginPartner("pancs_qd","123456",driver);
	      Thread.sleep(5000);
	      Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),"pancs_qd");
		  Thread.sleep(1000);
			  Notice nc = new Notice();
	          nc.NoticeSure(driver);


		  
		//  创建企业主
		  ClientOwner owner1= new ClientOwner();
		 String ownername = owner1.owner(driver, strtime, strphone);
		 System.out.println(ownername);
		 Thread.sleep(5000);
		 Client client = new Client();
		 client.ClientCreate(driver, ownername, strtime, "test_area", "pancs_qd");
		 Thread.sleep(5000);
/*		 String corpName = "client"+strtime;
		 client.ClientEdit(driver, strtime);
		 client.Clientdel(driver, strtime);*/
		 
//		 Contract con = new Contract();
//		 con.ContractCancel(driver, "client201603181549");
//		 con.ContractCreate(driver, "client201603181549");
//		 con.ContractEdit(driver,"client201603181549");
	//
//	      Service se = new Service();
//	      se.ServiceEdit(driver, "client201603181549");
//	      se.ServiceAdd(driver, "client201603181549");
		 
	      
		
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
