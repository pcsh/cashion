package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class closeall {
	public static void close(String str1,String str2,WebDriver driver) throws InterruptedException{
        
        driver.switchTo().defaultContent();
          Thread.sleep(3000);            
          Actions builder1 = new Actions(driver);
          WebElement nav1 = driver.findElement(By.xpath("//*[@class='"+str1+"']"));
          if(nav1.isDisplayed()){
              //System.out.println(nav1.getText());
              builder1.moveToElement(nav1).build().perform();
          }
          JavascriptExecutor js1 = (JavascriptExecutor) driver;
          WebElement webelement1 = driver.findElement(By.linkText(str2));
          js1.executeScript("arguments[0].click();",webelement1);
          Thread.sleep(3000);    

}

}
