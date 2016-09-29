package com.dbyl.libarary.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class logout {

	public void logout(String exit,WebDriver driver) throws InterruptedException{
        
        driver.switchTo().defaultContent();
        Thread.sleep(3000);            
        Actions act = new Actions(driver);
        WebElement nav2 = driver.findElement(By.xpath("//a[@class = 'user-name']"));
        act.moveToElement(nav2).build().perform();
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        WebElement q = driver.findElement(By.id(exit));
        js2.executeScript("arguments[0].click();",q);
        Thread.sleep(3000);
} 
}
