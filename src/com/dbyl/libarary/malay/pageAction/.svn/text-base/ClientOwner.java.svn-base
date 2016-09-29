package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class ClientOwner {

	public String owner(WebDriver driver,String strtime,String strphone) throws InterruptedException{
		
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000206000","toolbarPluginbiz60Frame",driver);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Add")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='name' and @class='input-text' and @type='text']")).click();
			
			driver.findElement(By.xpath("//*[@name='name' and @class='input-text inp-active']")).sendKeys("owner"+strtime);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='mobilePhoneNo']")).click();
			driver.findElement(By.xpath("//*[@name='mobilePhoneNo']")).sendKeys(strphone);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='email']")).click();
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys(strphone+"@qq.com");
			Thread.sleep(1000);
			driver.findElement(By.id("savebtn")).click();
			Thread.sleep(1000);
			String strowner = "owner"+strtime;
			return strowner;
	}
public void delete(WebDriver driver,String strowner) throws InterruptedException{
		
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000206000","toolbarPluginbiz60Frame",driver);
		  Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Please Client Name、Owner Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Please Client Name、Owner Name']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("name")).sendKeys(strowner);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@clickaction='queryGirdData']")).click();
			Thread.sleep(1000);		
			driver.findElement(By.id("cb_tableGrid")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("aDele")).click();
			Thread.sleep(1000);		
			driver.findElement(By.xpath("//*[@i-id='ok']")).sendKeys(strowner);
			Thread.sleep(1000);


	}
public void passwordreset(WebDriver driver,String strowner) throws InterruptedException{
		
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000206000","toolbarPluginbiz60Frame",driver);
		  Thread.sleep(2000);
//		  driver.findElement(By.linkText("Add")).click();
//			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Please Client Name、Owner Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@placeholder='Please Client Name、Owner Name']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("name")).sendKeys(strowner);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@clickaction='queryGirdData']")).click();
			Thread.sleep(1000);			
			driver.findElement(By.linkText("Password Reset")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@i-id='ok']")).sendKeys(strowner);
			Thread.sleep(1000);


	}

}
