package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.*;

public class Notice {

	public void NoticeSure(WebDriver driver) throws InterruptedException{
		  //公告确认：
		try{  
		driver.findElement(By.xpath("//a[@title = 'I get it']")).click();
		  Thread.sleep(5000);
		  }catch(org.openqa.selenium.ElementNotVisibleException ex)
		  {
			  //org.openqa.selenium.ElementNotVisibleException  
			  //org.openqa.selenium.NoSuchElementException
		  }
		  }
	public void add(WebDriver driver,String strtime) throws InterruptedException{
		malay3page.PageExist("menu-panel-item-SSMMENU0000000000000000000600000","menu-panel-item-SSMMENU0000000000000000000602000","menu-panel-item-SSMMENU0000000000000000000602020","toolbarPluginssm2020Frame",driver);
		driver.findElement(By.id("aAdd")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("title")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("title")).sendKeys("notic"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.name("publishTs")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-handler='today'")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("publishTs")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("duration")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("duration")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(1000);
	
	}
	}
