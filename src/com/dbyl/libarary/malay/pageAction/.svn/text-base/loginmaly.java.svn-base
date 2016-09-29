package com.dbyl.libarary.malay.pageAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginmaly {

	public WebDriver LoginManage(String strLoginM,String strPasswdM,WebDriver driver) throws InterruptedException
	  {
		     Thread.sleep(3000);
		      driver.findElement(By.id("textuname")).click();
		      driver.findElement(By.id("textuname")).sendKeys(strLoginM);
		      Thread.sleep(1000);
		      driver.findElement(By.id("testpassword")).click();
		      driver.findElement(By.id("testpassword")).sendKeys(strPasswdM);
		      Thread.sleep(1000);
		      driver.findElement(By.id("formSubmit")).click();
		      Thread.sleep(5000);  
	          return driver;
	  }
	  
	  public WebDriver LoginPartner(String strUsername,String strPasswd,WebDriver driver) throws InterruptedException
	  {
	        WebElement username = driver.findElement(By.id("textuname"));
	        username.click();
	        username.clear();
	        username.sendKeys(strUsername);
	        Thread.sleep(1000);
	          WebElement password = driver.findElement(By.id("testpassword"));
	          password.click();
	          password.clear();
	    //      String pwds = strPasswd;
	          password.sendKeys(strPasswd);
	          Thread.sleep(1000);
	          WebElement LoginBtn = driver.findElement(By.id("formSubmit"));
	          LoginBtn.click();
	          return driver;
	  }
	  public void forgotpwd(WebDriver driver,String strLoginM)throws InterruptedException
	  {
		  Thread.sleep(3000);
	      driver.findElement(By.id("forgotpwd")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.name("username")).sendKeys(strLoginM);
	      Thread.sleep(10000);
	      
	      driver.findElement(By.id("step1Btn")).click();
	      
	      Thread.sleep(1000);
	      driver.findElement(By.id("formSubmit")).click();
	      Thread.sleep(5000); 
	  }
}
