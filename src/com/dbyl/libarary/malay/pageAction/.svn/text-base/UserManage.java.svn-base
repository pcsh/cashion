package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;

public class UserManage {

	public void UserEdit(WebDriver driver,String strLogin) throws InterruptedException{
		 driver.switchTo().defaultContent();
         Thread.sleep(3000);            
         Actions builder = new Actions(driver);
         WebElement nav1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000600000"));
         if(nav1.isDisplayed()){
             //System.out.println(nav1.getText());
             builder.moveToElement(nav1).build().perform();
             WebElement nav2 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601000")); 
             if(nav2.isDisplayed())
             {
            	 builder.moveToElement(nav2).build().perform();
            	 
             
             JavascriptExecutor js1 = (JavascriptExecutor) driver;
         WebElement webelement1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601010"));
         js1.executeScript("arguments[0].click();",webelement1);
         Thread.sleep(3000);    
         driver.switchTo().frame("toolbarPluginssm1010Frame"); 
         driver.findElement(By.xpath("//*[@value='Search']")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).click();
		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).clear();
		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).sendKeys(strLogin);
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@value='Search']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("email")).click();
		  driver.findElement(By.name("email")).clear();
		  driver.findElement(By.name("email")).sendKeys(strLogin+"@qq.com");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id='form']/ul/li[7]/div/div/label[1]/em")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Save")).click();
		  Thread.sleep(2000);}}
	}
	
	public void UserAdd(WebDriver driver,String strLogin) throws InterruptedException{
		//PageExist pe = new PageExist();
		//  pe.PageExist("item-ssm","item-ssm1010","toolbarPluginssm1010Frame",driver);
		 driver.switchTo().defaultContent();
         Thread.sleep(3000);            
         Actions builder = new Actions(driver);
         WebElement nav1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000600000"));
         if(nav1.isDisplayed()){
             //System.out.println(nav1.getText());
             builder.moveToElement(nav1).build().perform();
             WebElement nav2 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601000")); 
             if(nav2.isDisplayed())
             {
            	 builder.moveToElement(nav2).build().perform();
            	 
             
             JavascriptExecutor js1 = (JavascriptExecutor) driver;
         WebElement webelement1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601010"));
         js1.executeScript("arguments[0].click();",webelement1);
         Thread.sleep(3000);    
         driver.switchTo().frame("toolbarPluginssm1010Frame"); 
         
		//driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='btn btn-danger']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("name")).click();
		  driver.findElement(By.id("name")).sendKeys(strLogin);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='form']/ul/li[7]/div/div/label[2]/em")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@class='btn btn-search btn-lg mr20 mb10']")).click();
		  Thread.sleep(2000);}}
	}

	public void UserDelete(WebDriver driver,String strLogin) throws InterruptedException{
		 driver.switchTo().defaultContent();
         Thread.sleep(3000);            
         Actions builder = new Actions(driver);
         WebElement nav1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000600000"));
         if(nav1.isDisplayed()){
             //System.out.println(nav1.getText());
             builder.moveToElement(nav1).build().perform();
             WebElement nav2 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601000")); 
             if(nav2.isDisplayed())
             {
            	 builder.moveToElement(nav2).build().perform();
            	 
             
             JavascriptExecutor js1 = (JavascriptExecutor) driver;
         WebElement webelement1 = driver.findElement(By.id("menu-panel-item-SSMMENU0000000000000000000601010"));
         js1.executeScript("arguments[0].click();",webelement1);
         Thread.sleep(3000);    
         driver.switchTo().frame("toolbarPluginssm1010Frame"); 
         
		  driver.findElement(By.xpath("//*[@value='Search']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).click();
		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).clear();
		  driver.findElement(By.xpath("//*[@placeholder='Please Key Location']")).sendKeys(strLogin);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@value='Search']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Delete")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		  Thread.sleep(5000);}}
	}
	
}
