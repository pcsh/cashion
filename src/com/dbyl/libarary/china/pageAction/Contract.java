package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;

public class Contract {

	public void ContractCreate(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
		   driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='corpName']")).click();
			driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@name='empName']")).click();
//			driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓11");
//			driver.findElement(By.xpath("//*[@name='empName']")).clear();				
//			driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓");
//			Thread.sleep(2000);
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
	}
	
	public void ContractCreateZHUCHE(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
		   driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='corpName']")).click();
			driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@name='empName']")).click();
//			driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓11");
//			driver.findElement(By.xpath("//*[@name='empName']")).clear();				
//			driver.findElement(By.xpath("//*[@name='empName']")).sendKeys("李晓");
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='empName']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);			
			driver.findElement(By.linkText("下一步")).click();
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("//*[@id='btnjqg1']/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='jqg6']/td[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys("代理注册aa");
			driver.findElement(By.xpath("//*[@id='1_productName']")).clear();
			driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys("代理注册");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_productName']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			/*
		    driver.findElement(By.xpath("//*[@id='jqg1']/td[7]")).click();
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
			 */
			driver.findElement(By.linkText("下一步")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("下一步")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("下一步")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("知道了")).click();
			Thread.sleep(2000);
			//业务管理>合同（END）
	}
	
	public void ContractEdit(WebDriver driver,String corpName,String ContractID) throws InterruptedException{
		PageExist pe = new PageExist(); 
		pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='searchText']")).click();
			driver.findElement(By.xpath("//*[@name='searchText']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("编辑")).click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame("toolbarPlugin"+ContractID+"Frame");
			driver.findElement(By.xpath("//textarea[@name='remark']")).click();
			driver.findElement(By.xpath("//textarea[@name='remark']")).clear();
			driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys(ContractID);
			Thread.sleep(2000);
			driver.findElement(By.linkText("保存")).click();
			Thread.sleep(3000);
	}
	
	public void ContractPay(WebDriver driver,String corpName,String ContractCode,String ContractID) throws InterruptedException{
		PageExist pe = new PageExist(); 
		pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='searchText']")).click();
			driver.findElement(By.xpath("//*[@name='searchText']")).sendKeys(ContractCode);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("收款")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("payDate")).sendKeys("2016-01-01");
			Thread.sleep(1000);
			driver.findElement(By.name("payDate")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/form/ul/li[2]/div/span/label/em")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("cashAmt")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("cashAmt")).sendKeys("10");
			Thread.sleep(2000);
			//WebElement target0 = driver.findElement(By.name("remark"));
		/*	String patha = "//@id='tableAccountTask_'"+ContractID+"/div/form/div/button[1]";
			WebElement target = driver.findElement(By.xpath(patha));*/
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",target0);
			//Thread.sleep(2000);
/*			((JavascriptExecutor)driver).executeScript("arguments[0].click();",target0);
			Thread.sleep(1000);*/
			//target0.sendKeys("部分付款备注，已经支付10元！");
			Thread.sleep(2000);
			//WebElement target = driver.findElement(By.linkText("立即收款"));
		/*	String patha = "//@id='tableAccountTask_'"+ContractID+"/div/form/div/button[1]";
			WebElement target = driver.findElement(By.xpath(patha));*/
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",target);
			//Thread.sleep(2000);
			//((JavascriptExecutor)driver).executeScript("arguments[0].click();",target);
			/*String setscroll = "scroll(0,10000)";
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript(setscroll);			
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("tableAccountTask_"+ContractID)).sendKeys(Keys.DOWN);
			Thread.sleep(3000);*/
			driver.findElement(By.xpath("//button[@class='btn-a']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@i-id='ok']")).click();
			Thread.sleep(3000);
	}
	
	public void ContractCancel(WebDriver driver,String corpName,String ContractID) throws InterruptedException{
		PageExist pe = new PageExist(); 
		pe.PageExist("item-biz","item-biz2010","toolbarPluginbiz2010Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='searchText']")).click();
			driver.findElement(By.xpath("//*[@name='searchText']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("cb_tableAccountTask")).click();
			Thread.sleep(2000);				
			driver.findElement(By.linkText("更多")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@i-id='ok']")).click();
			Thread.sleep(3000);
	}
}
