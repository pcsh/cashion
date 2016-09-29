package com.dbyl.libarary.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class isexist { 
	public boolean doesWebElementExist(WebDriver driver, String selector)
	 { 
		boolean status = false;
	        try { 
	                driver.findElement(By.xpath("//a[@class = '"+selector+"']")); 
	               status = true; 
	        } catch (org.openqa.selenium.NoSuchElementException e) { 
	            status = false;
	        } 
	        return status;
	    } 

}
