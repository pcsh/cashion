package com.dbyl.china.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dbyl.china.envpars.SetInitEnv;
import com.dbyl.libarary.china.pageAction.LoginPage;
import com.dbyl.libarary.utils.PageExist;
import com.dbyl.libarary.utils.QueryData;
import com.dbyl.malay.envpars.DBEnv;


public class accountFlow {
	
  
  @Test
  public void Flow() throws IOException, InterruptedException, SQLException{
      SetInitEnv initenv = new SetInitEnv();
      String strtime = initenv.envParameters().get("strtimeP");
      String strphone = initenv.envParameters().get("strphoneP");
      String qdstrphone = initenv.envParameters().get("qdstrphoneP");
      
      
      String strqdname = initenv.envParameters().get("strqdnameP");
      String strcontact = initenv.envParameters().get("strcontactP");
      String strLogin = initenv.envParameters().get("strLoginP");
      String strPasswd = initenv.envParameters().get("strPasswdP");
      //String strLoginq = initenv.envParameters().get("str99");
      
     
 //     int env =initenv.UAT();
 //     strLogin = "demo";//UAT渠道管理员帐号
     
      //System.out.println(strLoginq);
      int env =initenv.SIT();
      strLogin = "pancs_owner";
      
      DBEnv dbinitenv = new DBEnv();
      String strUrl = dbinitenv.envDB(env,0).get("strUrlP");
      String strUser = dbinitenv.envDB(env,0).get("strUserP");
      String strPwd = dbinitenv.envDB(env,0).get("strPwdP");
      Thread.sleep(2000);
      
     WebDriver driver = initenv.FirefoxDriver();
      
      
      LoginPage testa = new LoginPage();
      
      driver = initenv.envchoicePartner(env,driver);      
      Thread.sleep(3000);
      testa.LoginPartner(strLogin,strPasswd,driver);
      Thread.sleep(3000);
      //Assert.assertEquals(driver.findElement(By.xpath("//a[@class = 'user-name']")).getText(),strLogin);
      Thread.sleep(3000);
  
	  PageExist pe = new PageExist();
	  
		  //业务管理>渠道基本信息（BEGIN）
		  pe.PageExist("item-bdm","item-bdm10","toolbarPluginbdm10Frame",driver);
		  Thread.sleep(3000);
		  String strOrg = driver.findElement(By.xpath("//span[@id='orgTree_1_span']")).getText();		  
		  System.out.println(strOrg);
			//业务管理>渠道基本信息（END）
		  
		  
		  //业务管理>企业主（BEGIN）
		  pe.PageExist("item-biz","item-biz1010","toolbarPluginbiz1010Frame",driver);
		  //driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入唯一登录账号']")).click();
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入唯一登录账号']")).sendKeys("pancs"+strtime);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='mobilePhoneNo']")).click();
			driver.findElement(By.xpath("//*[@name='mobilePhoneNo']")).sendKeys(strphone);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='email']")).click();
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys(strphone+"@sina.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='qq']")).click();
			driver.findElement(By.xpath("//*[@name='qq']")).sendKeys("888888");
			Thread.sleep(1000);
			driver.findElement(By.id("savebtn")).click();
			Thread.sleep(1000);
			//业务管理>企业主（END）
		  //业务管理>企业（BEGIN）
			pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
		   //driver.findElement(By.linkText("查询"));
		   driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='ownerName']")).click();
			driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys("pancs"+strtime);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).click();
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).sendKeys("商业国际物流"+strtime);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='contact']")).click();
			driver.findElement(By.xpath("//*[@name='contact']")).sendKeys("pancs");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='contactPhone']")).click();
			driver.findElement(By.xpath("//*[@name='contactPhone']")).sendKeys("15880276011");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).click();
			driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京"+Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
			driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
			driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
			driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='orgName']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'"+strOrg+"')]")).click();//"+strOrg+"
			Thread.sleep(2000);
			driver.findElement(By.id("savebtn")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("name")).sendKeys("商业国际物流"+strtime);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-b']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-c']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("分配人员")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@data-type='query' and @placeholder='输入关键字']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@data-type='query' and @placeholder='输入关键字']")).sendKeys(strLogin);;
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@data-type='query-btn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("cb_userSingleItem_leftGrid")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userSingleItem_selected_0']/div[1]/div[1]/i")).click();
			Thread.sleep(2000);
			QueryData qd = new QueryData();
		    String UID = qd.UserID(strUrl, strUser, strPwd, strLogin);
		    Thread.sleep(2000);
		    Actions builder1 = new Actions(driver);
	        WebElement nav1 = driver.findElement(By.id("jqg_userSingleItem_selected_0_grid_"+UID));
	        if(nav1.isDisplayed()){
	            //System.out.println(nav1.getText());
	            builder1.moveToElement(nav1).build().perform();
	        }
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement webelement1 = driver.findElement(By.xpath("//*[@id='"+UID+"']/td[6]/span"));
	        js1.executeScript("arguments[0].click();",webelement1);
	        Thread.sleep(3000);    
			//driver.findElement(By.id("jqg_userSingleItem_selected_0_grid_"+UID)).click();
			//driver.findElement(By.linkText("设置主管")).click();
			Thread.sleep(2000);

		    driver.findElement(By.xpath("//*[@i-id='ok']")).click();
			Thread.sleep(5000);
			//业务管理>企业（END）
			
			//业务管理>企业--企业信息维护(BEGIN)
			pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
		   	driver.findElement(By.id("name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("name")).sendKeys("商业国际物流"+strtime);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-b']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-c']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("企业信息")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame("toolbarPlugincor301Frame");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='corpForm']/div[1]/ul/li[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name = 'registerMoney']")).click();
			driver.findElement(By.xpath("//input[@name = 'registerMoney']")).sendKeys("100");
			Thread.sleep(2000);			
			driver.findElement(By.linkText("保存")).click();		
			Thread.sleep(2000);	
			driver.findElement(By.linkText("交接完成")).click();	
			Thread.sleep(2000);	
			//业务管理>企业--企业信息维护(END)

			//业务管理>合同（BEGIN）
			pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
			   driver.findElement(By.linkText("查询")).click();
			   driver.findElement(By.linkText("新增")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='corpName']")).click();
				driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys("商业国际物流"+strtime);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@name='empName']")).click();
//				driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓11");
//				driver.findElement(By.xpath("//*[@name='empName']")).clear();				
//				driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓");
//				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='empName']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);			
				driver.findElement(By.linkText("下一步")).click();
				//Thread.sleep(1000);
    			//driver.findElement(By.xpath("//*[@id='btnjqg1']/div")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[5]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys("代理记账");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[6]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[6]")).clear();
				driver.findElement(By.xpath("//*[@id='1_buyNumber']")).clear();
				driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys("12");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[9]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[6]")).clear();
				driver.findElement(By.xpath("//*[@id='1_referencePrice']")).clear();
				driver.findElement(By.xpath("//*[@id='1_referencePrice']")).sendKeys("500");
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[15]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[14]")).clear();
				driver.findElement(By.xpath("//*[@id='1_planStartTime']")).sendKeys("2015-01-01");
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[14]")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[16]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[15]")).clear();
				driver.findElement(By.xpath("//*[@id='1_firstPayDate']")).sendKeys("2015-01-01");
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[15]")).sendKeys(Keys.ENTER);
				//Thread.sleep(2000);
				driver.findElement(By.linkText("下一步")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("下一步")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("下一步")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("知道了")).click();
				Thread.sleep(2000);
				//业务管理>合同（END）
				//业务管理>服务（BEGIN）
				pe.PageExist("item-biz","item-biz2020","toolbarPluginbiz2020Frame",driver);
				driver.findElement(By.linkText("新增")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("取消")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='query']")).click();
				driver.findElement(By.xpath("//*[@name='query']")).sendKeys("商业国际物流"+strtime);
				Thread.sleep(1000);
				driver.findElement(By.linkText("查询")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("  编辑")).click();
				//Thread.sleep(6000);
				//driver.findElement(By.xpath("//*[@name='startTime']")).sendKeys("2015-01-01");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='buyNumber']")).click();
				driver.findElement(By.xpath("//*[@name='buyNumber']")).clear();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='buyNumber']")).sendKeys("10");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='freeNumber']")).click();
				driver.findElement(By.xpath("//*[@name='freeNumber']")).clear();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='freeNumber']")).sendKeys("2");	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='buyNumber']")).click(); //触发终止日期调整
				//使用JS定位隐藏或没显示在可视界面上的元素
				WebElement target = driver.findElement(By.xpath("//button[@clickaction='doSave']"));
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", target);
				Thread.sleep(3000);
				//业务管理>服务（END）
				//企业初始化（BEGIN）
				pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
				   	driver.findElement(By.id("name")).clear();
					Thread.sleep(2000);
					driver.findElement(By.linkText("新增")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("取消")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("查询")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("name")).click();
					driver.findElement(By.id("name")).sendKeys("商业国际物流"+strtime);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@class='btn-b']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@class='btn-c']")).click();
					Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@componenttype='drop-down-more']")).click();
				Thread.sleep(2000);
				String currentWindow1 = driver.getWindowHandle();  
				 driver.findElement(By.xpath("//*[@id='moreSthDivId']/div[1]/ul/li[contains(text(),'财务初始化')]")).click();
				 Thread.sleep(2000);
			        // 得到所有窗口的句柄  
			        Set<String> handles1 = driver.getWindowHandles();  
			        Iterator<String> it1 = handles1.iterator();        //创建一个对象实现存放主页面句柄 
			        String preWindowString1 = currentWindow1;         
			        while (it1.hasNext())         {  
			            String cruWindowString1 = it1.next(); 
			            System.out.println("next = " + cruWindowString1);            
			            if (currentWindow1 == cruWindowString1) {                  
			                continue;  
			            }  
			            driver.switchTo().window(cruWindowString1); 
			        } 
			        System.out.println("url1 = " + driver.getCurrentUrl());  	
				 
				 driver.close();
				 WebDriver window1 = driver.switchTo().window(preWindowString1); 
				//企业初始（End）
				
				//系统管理>参数设置（BEGIN）
				 pe.PageExist("item-ssm","item-ssm2010","toolbarPluginssm2010Frame",driver);
				driver.findElement(By.xpath("//input[@name='glTaskDate']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@name='corpName']")).click();
				driver.findElement(By.xpath("//input[@name='corpName']")).sendKeys("商业国际物流"+strtime);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@name='glTaskDate']")).click();
				//driver.findElement(By.xpath("//input[@name='glTaskDate']")).sendKeys(Keys.ENTER);
				//Thread.sleep(2000);
				driver.findElement(By.linkText("生成任务")).click();
				Thread.sleep(2000);	
				//系统管理>参数设置（END）
				  //会计任务监控（BEGIN）
				pe.PageExist("item-mnt","item-mnt10","toolbarPluginmnt10Frame",driver);
				  driver.findElement(By.id("accountingKeyCode")).sendKeys("商业国际物流"+strtime);
				  Thread.sleep(2000);
				  driver.findElement(By.id("accountingKeyCode")).sendKeys(Keys.ENTER);
				  Thread.sleep(2000);
				/*	driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
					Thread.sleep(2000);
				  driver.findElement(By.xpath("//*[@name='startGlDate']")).click();
				 Thread.sleep(3000);
				driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
				Thread.sleep(2000);*/
				/*driver.findElement(By.xpath("//*[@type='text' and @placeholder='任务状态']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'记账')]")).click();//("//tbody/tr[@_row_id='id2']")).click();
				  Thread.sleep(2000);*/
				 driver.findElement(By.linkText("查询")).click();
				Thread.sleep(2000);
			    /*driver.findElement(By.xpath("//*[@type='text' and @placeholder='任务状态']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'就绪')]")).click();//("//tbody/tr[@_row_id='id2']")).click();
				 driver.findElement(By.linkText("查询")).click();
				Thread.sleep(2000);*/
				 /* driver.findElement(By.linkText("分配人员")).click();
				  Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@name='displayName']")).click();
					driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(strLogin);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(Keys.ENTER);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//form/span/label[1]/em")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("确定")).click();
					Thread.sleep(5000);		*/	
					 driver.switchTo().defaultContent();
					 Thread.sleep(2000);
					 //会计任务监控（END）
				//会计任务（BEGIN）
					 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
				  driver.findElement(By.id("name")).sendKeys("商业国际物流"+strtime);
				  Thread.sleep(2000);
				  driver.findElement(By.id("name")).sendKeys(Keys.ENTER);
				  Thread.sleep(3000);
					//driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
					//Thread.sleep(5000);
					//driver.findElement(By.xpath("//*[@name='endGlDate']")).sendKeys("2015年第1账期");
					//Thread.sleep(5000);
					//driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
					//Thread.sleep(2000);
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
			        
				 driver.findElement(By.linkText("去记账")).click();
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
			        System.out.println("url1 = " + driver.getCurrentUrl());  				 
				 driver.close();
				 WebDriver window = driver.switchTo().window(preWindowString); 
				 //driver.navigate().to(url0);
				 System.out.println(driver.getCurrentUrl());	
				 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
				 Thread.sleep(2000);
				 driver.findElement(By.linkText("更多")).click();
				 Thread.sleep(2000);
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
  public void beforeMethod(){

  }

  @AfterMethod
  public void afterMethod(){
	  
  }

}
