package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class ClientOwner {

	public String ownerAdd(WebDriver driver,String strtime,String strphone) throws InterruptedException{
		
		PageExist pe = new PageExist(); 
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
			String strowner = "pancs"+strtime;
			return strowner;
	}
	
	public void ownerEdit(WebDriver driver,String strowner) throws InterruptedException{
		
		PageExist pe = new PageExist(); 
		  pe.PageExist("item-biz","item-biz1010","toolbarPluginbiz1010Frame",driver);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(1000);			
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业主账号/名称/企业名称']")).click();
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业主账号/名称/企业名称']")).sendKeys(strowner);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("企业")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.switchTo().frame("toolbarPlugincor30Frame");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[1]/div[1]/ul/li[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='email']")).click();
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys("pcshvop@sina.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='qq']")).click();
			driver.findElement(By.xpath("//*[@name='qq']")).sendKeys("888888");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@class='btn-a']")).click();
			Thread.sleep(1000);
			pe.PageExist("item-biz","item-biz1010","toolbarPluginbiz1010Frame",driver);
			  driver.findElement(By.linkText("新增")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("取消")).click();
				Thread.sleep(1000);
	}
	
	public void ownerDelete(WebDriver driver,String strowner) throws InterruptedException{
		
		PageExist pe = new PageExist(); 
		  pe.PageExist("item-biz","item-biz1010","toolbarPluginbiz1010Frame",driver);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(1000);			
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业主账号/名称/企业名称']")).click();
			driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业主账号/名称/企业名称']")).sendKeys(strowner);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("cb_tableGrid")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("删除")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@i-id='ok']")).click();
			Thread.sleep(2000);
	}
	
}
