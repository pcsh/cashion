package com.dbyl.libarary.malay.pageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;

public class Client {

	public String ClientCreate(WebDriver driver,String strowner,String strtime,String strOrg,String strLogin) throws InterruptedException{
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000201000","toolbarPluginbiz10Frame",driver);
		driver.findElement(By.linkText("Batch Allocate")).click();
		Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Actions builder1 = new Actions(driver);
		 WebElement nav1 = driver.findElement(By.xpath("//*[@class='tabpanel_actionOther']"));

             builder1.moveToElement(nav1).build().perform();

         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         WebElement webelement1 = driver.findElement(By.linkText("Refresh current"));
         js1.executeScript("arguments[0].click();",webelement1);
         Thread.sleep(3000);    
         driver.switchTo().frame("toolbarPluginbiz10Frame");
         
		driver.findElement(By.linkText("Add")).click();
	   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='ownerName']")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(strowner);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='name' and @class='input-text']")).click();
		driver.findElement(By.xpath("//*[@name='name' and @class='input-text inp-active']")).sendKeys("client"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contact']")).click();
		driver.findElement(By.xpath("//*[@name='contact']")).sendKeys("pancs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactPhone']")).click();
		driver.findElement(By.xpath("//*[@name='contactPhone']")).sendKeys("18959260000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactEmail']")).click();
		driver.findElement(By.xpath("//*[@name='contactEmail']")).sendKeys("18959260000@qq.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='mailingAddress']")).click();
		driver.findElement(By.xpath("//*[@name='mailingAddress']")).sendKeys("address");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='mailingAddrCity']")).click();
		driver.findElement(By.xpath("//*[@name='mailingAddrCity']")).sendKeys("xin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='mailingAddrState']")).click();
		driver.findElement(By.xpath("//*[@name='mailingAddrState']")).sendKeys("state");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='mailingAddrPostCode']")).click();
		driver.findElement(By.xpath("//*[@name='mailingAddrPostCode']")).sendKeys("0001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='mailingAddrCountry']")).click();
		driver.findElement(By.xpath("//*[@name='mailingAddrCountry']")).sendKeys("malay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='orgName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'"+strOrg+"')]")).click();//"+strOrg+"
		Thread.sleep(2000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("client"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[@class='btn-b']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class='btn-c']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.linkText("Allocate Personnel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='displayName']")).click();
		driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(strLogin);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/span/label[1]/em")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/span/label[2]/em")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/span/label[3]/em")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/span/label[4]/em")).click();		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Confrim")).click();
		Thread.sleep(5000);
		//业务管理>企业（END）
		String strclient = "client"+strtime;
		return strclient;
	}
	
	public void ClientEdit(WebDriver driver,String strtime) throws InterruptedException{
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000201000","toolbarPluginbiz10Frame",driver);
		   
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("client"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Client Info")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("toolbarPlugincor301Frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='corpForm']/div[1]/ul/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'registeredCapital']")).click();
		driver.findElement(By.xpath("//input[@name = 'registeredCapital']")).sendKeys("100");
		Thread.sleep(2000);			
		driver.findElement(By.linkText("Save")).click();		
	
	}
	public void Clientdel(WebDriver driver,String strtime) throws InterruptedException{
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000201000","toolbarPluginbiz10Frame",driver);
		   
		driver.findElement(By.name("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("client"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cb_tableGrid")).click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		WebElement nav1 = driver.findElement(By.linkText("More"));
		builder.moveToElement(nav1).build().perform();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = driver.findElement(By.id("a_cancel']"));
        js1.executeScript("arguments[0].click();",webelement1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@i-id='ok']")).click();		
        Thread.sleep(2000);
	}
	

}
