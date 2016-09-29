package com.dbyl.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestBaseAssert {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://test.zyd.onlyou.com/login.htm");
	  driver.manage().window();
	  driver.findElement(By.name("username")).click();
	  driver.findElement(By.name("username")).sendKeys("pancs_qd");
	  driver.findElement(By.name("password")).click();
	  driver.findElement(By.name("password")).sendKeys("111111");
	  driver.findElement(By.className("btn-submit")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);//等待最长时间10s
	  wait.until(new ExpectedCondition<WebElement>(){
		  @Override
		  public WebElement apply(WebDriver d){
			  return d.findElement(By.id(""));
		  }
	  }).click();
	  driver.close();
	  
  }
}
