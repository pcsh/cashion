package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageExist {
	     public static void PageExist(String str1,String str2,String str3,WebDriver driver) throws InterruptedException{
	             
	              driver.switchTo().defaultContent();
	                Thread.sleep(3000);            
	                Actions builder1 = new Actions(driver);
	                WebElement nav1 = driver.findElement(By.id(str1));
	                Thread.sleep(3000); 
	                if(nav1.isDisplayed()){
	                	Thread.sleep(3000); 
	                    builder1.moveToElement(nav1).build().perform();
	                }
	                Thread.sleep(3000); 
	                JavascriptExecutor js1 = (JavascriptExecutor) driver;
	                Thread.sleep(3000); 
	                WebElement webelement1 = driver.findElement(By.id(str2));
	                js1.executeScript("arguments[0].click();",webelement1);
	                Thread.sleep(3000);    
	                driver.switchTo().frame(str3);
	      } 
}
