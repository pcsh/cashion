package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	  public WebDriver LoginManage(String strLoginM,String strPasswdM,WebDriver driver) throws InterruptedException
	  {
		     Thread.sleep(5000);
		        WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		        username.click();
		        username.clear();
		        username.sendKeys(strLoginM);
		        Thread.sleep(2000);
		          WebElement password = driver.findElement(By.name("password"));
		          password.click();
		          password.clear();
		          String pwds = strPasswdM;
		          password.sendKeys(pwds);
		          Thread.sleep(2000);
		          WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='btn-submit']"));
		          LoginBtn.click();
		      Notice nc = new Notice();
		      nc.NoticeSure(driver);
	          return driver;
	  }
	  
	  public WebDriver LoginPartner(String strUsername,String strPasswd,WebDriver driver) throws InterruptedException
	  {
	        WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
	        username.click();
	        username.clear();
	        username.sendKeys(strUsername);
	        Thread.sleep(2000);
	          WebElement password = driver.findElement(By.name("password"));
	          password.click();
	          password.clear();
	          String pwds = strPasswd;
	          password.sendKeys(pwds);
	          Thread.sleep(2000);
	          WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='btn-submit']"));
	          LoginBtn.click();
	          //Notice nc = new Notice();
	          //nc.NoticeSure(driver);
	          return driver;
	  }
}
