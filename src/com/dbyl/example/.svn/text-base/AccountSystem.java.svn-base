package com.dbyl.example;

import org.testng.annotations.Test;

import com.dbyl.china.envpars.SetInitEnv;
import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.utils.PageExist;
import com.dbyl.malay.envpars.DBEnv;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class AccountSystem {
  @Test
  public void f() throws InterruptedException {
	    SetInitEnv initenv = new SetInitEnv();
	      String strtime = initenv.envParameters().get("strtimeP");
	      String strphone = initenv.envParameters().get("strphoneP");
	      String qdstrphone = initenv.envParameters().get("qdstrphoneP");
	      String strqdname = initenv.envParameters().get("strqdnameP");
	      String strcontact = initenv.envParameters().get("strcontactP");
	      String strLogin = initenv.envParameters().get("strLoginP");
	      String strPasswd = initenv.envParameters().get("strPasswdP");
	      //String strLoginq = initenv.envParameters().get("str99");
	      
	/*      
	      int env =initenv.UAT();
	      strLogin = "demo";//UAT渠道管理员帐号
	   */   
	      //System.out.println(strLoginq);
	      int env =initenv.UAT();
	      strLogin = "demo";
	      
	      DBEnv dbinitenv = new DBEnv();
	      String strUrl = dbinitenv.envDB(env,0).get("strUrlP");
	      String strUser = dbinitenv.envDB(env,0).get("strUserP");
	      String strPwd = dbinitenv.envDB(env,0).get("strPwdP");
	      Thread.sleep(2000);
	      
	      WebDriver driver = initenv.ChromeDriver();
	      
	      
	      LoginPage testa = new LoginPage();
	      
	      driver = initenv.envchoicePartner(env,driver);      
	      Thread.sleep(3000);
	      testa.LoginPartner(strLogin,strPasswd,driver);
	      Thread.sleep(3000);
	      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
	      Thread.sleep(3000);
		  PageExist pe = new PageExist();
	//会计任务（BEGIN）
		 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
	  driver.findElement(By.id("name")).sendKeys("autoqy");
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	/*	driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
		Thread.sleep(2000);*/
	  //driver.findElement(By.xpath("//*[@name='startGlDate']")).click();
	 //Thread.sleep(5000);
	//driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
	//Thread.sleep(2000);
	 driver.findElement(By.linkText("查询")).click();
	 Thread.sleep(2000);
	 String url0 = driver.getCurrentUrl();
	 System.out.println(url0);		
	 
		// 得到当前窗口的句柄
     String currentWindow = driver.getWindowHandle();  
     
	 driver.findElement(By.linkText("继续记账")).click();
	 Thread.sleep(2000);
	 

     // 得到所有窗口的句柄  
     Set<String> handles = driver.getWindowHandles();  
     Iterator<String> it = handles.iterator();        //创建一个对象实现存放主页面句柄 
     String preWindowString = currentWindow;         
     while (it.hasNext())         {  
         String cruWindowString = it.next(); 
         System.out.println("next = " + cruWindowString);            
         if (currentWindow == cruWindowString) {                  
             continue;  
         }  
         WebDriver window = driver.switchTo().window(cruWindowString); 
     } 
     driver.manage().window().maximize();
     System.out.println("url1 = " + driver.getCurrentUrl());  
     Thread.sleep(3000);
     
     driver.switchTo().defaultContent();
     Thread.sleep(3000);            
     Actions builder1 = new Actions(driver);
     WebElement nav1 = driver.findElement(By.id("item-1"));
     nav1.click();
/*     if(nav1.isDisplayed()){
         //System.out.println(nav1.getText());
         builder1.moveToElement(nav1).build().perform();
     }
     JavascriptExecutor js1 = (JavascriptExecutor) driver;
     WebElement webelement1 = driver.findElement(By.id(str2));
     js1.executeScript("arguments[0].click();",webelement1);
     Thread.sleep(3000); */   
     driver.switchTo().frame("toolbarPlugin1Frame");
     driver.findElement(By.linkText("凭证编辑")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@onclick='voucherProcessor.voucher.saveRightVoucher();']")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("列表")).click();
     Thread.sleep(2000);
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     driver.switchTo().frame("toolbarPlugin_1Frame").findElement(By.xpath("//*[@id='voucherMainBox']/div[1]/div[2]/button[2]")).click();
     //分录1
     driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[2]/td[6]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='1_summary']")).sendKeys("分录测试1");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[2]/td[9]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='subjectSelectDiv']/span/img[1]")).click();
	 Thread.sleep(1000);
     driver.switchTo().frame("subjectTreeDialog").findElement(By.xpath(" //*[@id='subjectli3']/a")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//*[@id='acctSubjectTree']/li[1]/div/span[3]")).click();
     Thread.sleep(1000);
     driver.switchTo().defaultContent();
     Thread.sleep(1000);
     driver.switchTo().frame("toolbarPlugin_1Frame").findElement(By.xpath("//div/table/tbody/tr[3]/td/div/input[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[2]/td[12]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='1_debitAmt']")).sendKeys("0");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[2]/td[13]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='1_creditAmt']")).sendKeys("100");
	  Thread.sleep(2000);
	//分录2
	  driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[3]/td[6]")).click();
	  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='2_summary']")).sendKeys("分录测试2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[3]/td[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='subjectSelectDiv']/span/img[1]")).click();
		Thread.sleep(1000);
	     driver.switchTo().frame("subjectTreeDialog").findElement(By.xpath(" //*[@id='subjectli2']/a")).click();
	     Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='acctSubjectTree']/li[1]/div/span[3]")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.switchTo().frame("toolbarPlugin_1Frame").findElement(By.xpath("//div/table/tbody/tr[3]/td/div/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='voucherGrid']/tbody/tr[3]/td[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='2_debitAmt']")).sendKeys("100");
		Thread.sleep(2000);
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='voucherMainBox']/div[1]/div[2]/button[2]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@value='确定']")).click();
		  Thread.sleep(3000);
	 driver.close();
	 WebDriver window = driver.switchTo().window(preWindowString); 
	 //driver.navigate().to(url0);
	 System.out.println(driver.getCurrentUrl());	
	// driver.findElement(By.xpath("//div/div[1]/ul/li[4]/span[contains(text(),'无需传票')]")).click();
	// Thread.sleep(2000);
	 //driver.findElement(By.linkText("提交任务")).click();
	 //Thread.sleep(2000);
	 
	/* currentWindow = driver.getWindowHandle(); 
	 driver.findElement(By.linkText("去审账")).click();
	 Thread.sleep(2000);
	 
	// 得到所有窗口的句柄  
     handles = driver.getWindowHandles();  
      it = handles.iterator();        //创建一个对象实现存放主页面句柄 
   preWindowString = currentWindow;         
     while (it.hasNext())         {  
         String cruWindowString = it.next(); 
         System.out.println("next = " + cruWindowString);            
         if (currentWindow == cruWindowString) {                  
             continue;  
         }  
      window = driver.switchTo().window(cruWindowString); 
     } 
     System.out.println("url1 = " + driver.getCurrentUrl());  	
	 driver.close();
	 driver.switchTo().window(preWindowString); 
	 
	 Thread.sleep(2000);
	 System.out.println(driver.getCurrentUrl());	
	 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
	 currentWindow = driver.getWindowHandle(); 
	 //driver.findElement(By.linkText("结账")).click();
	 Thread.sleep(2000);
	 
		// 得到所有窗口的句柄  
	        handles = driver.getWindowHandles();  
	         it = handles.iterator();        //创建一个对象实现存放主页面句柄 
	      preWindowString = currentWindow;         
	        while (it.hasNext())         {  
	            String cruWindowString = it.next(); 
	            System.out.println("next = " + cruWindowString);            
	            if (currentWindow == cruWindowString) {                  
	                continue;  
	            }  
	        driver.switchTo().window(cruWindowString); 
	        } 
	        System.out.println("url1 = " + driver.getCurrentUrl());  	

	 Thread.sleep(2000);
	 PageExist("item-4","item-42","toolbarPlugin42Frame",driver);
	 driver.findElement(By.xpath("//input[@value='检查准备']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='损益结转']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='试算平衡']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='结账']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='完成']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='确定']")).click();
	 Thread.sleep(5000);
     
	 driver.close();
	 driver.switchTo().window(preWindowString); */
	 Thread.sleep(5000);
	//会计任务（END）
	 
	 
	 driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
