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

/*
 * 新增注册任务合同，并查询任务是否生成。
 */
public class RegisterTask {
	
  
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
      
/*      
      int env =initenv.UAT();
      strLogin = "demo";//UAT渠道管理员帐号
   */   
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
		  String strOrg = driver.findElement(By.id("orgTree_1_span")).getText();		  
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
			Thread.sleep(1000);
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
				driver.findElement(By.xpath("//*[@name='empName']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);			
				driver.findElement(By.linkText("下一步")).click();
				//Thread.sleep(1000);
    			//driver.findElement(By.xpath("//*[@id='btnjqg1']/div")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[5]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys("abc123");
				driver.findElement(By.xpath("//*[@id='1_productName']")).clear();
				driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys("代理注册");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='jqg1']/td[6]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//*[@id='jqg3']/td[6]")).clear();
				driver.findElement(By.xpath("//*[@id='1_buyNumber']")).clear();
				driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys("1");
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
			
				  //注册任务监控（BEGIN）
				pe.PageExist("item-mnt","item-mnt20","toolbarPluginmnt20Frame",driver);
				  driver.findElement(By.name("searchKey")).sendKeys("商业国际物流"+strtime);
				  Thread.sleep(2000);
				  driver.findElement(By.name("searchKey")).sendKeys(Keys.ENTER);
				  Thread.sleep(2000);
				 driver.findElement(By.linkText("查询")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("分配人员")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='text' and @name='displayName']")).click();
				driver.findElement(By.xpath("//input[@type='text' and @name='displayName']")).sendKeys(strLogin);;
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='text' and @name='displayName']")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.linkText("确定")).click();
				Thread.sleep(5000);		
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				//注册任务监控（END）
				 
				driver.quit();
  } 
  
  
  @BeforeMethod
  public void beforeMethod(){

  }

  @AfterMethod
  public void afterMethod(){
	  
  }

}
