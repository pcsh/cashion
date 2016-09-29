package com.dbyl.libarary.china.pageAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;

public class LoginPage extends BasePage {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
	
	  protected LoginPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
        driver.get("http://test.onlyou.com:8081/partner/login/login.htm");
	}
	  
	   Locator loginEmailInputBox = new Locator("username");

	    Locator loginPasswordInputBox = new Locator("password");
	    Locator loginButton = new Locator("登录");
	    Locator profile = new Locator("profile");

	    public void typeEmailInputBox(String username) throws Exception {
	    	System.out.println("用户名..........................");
	        type(loginEmailInputBox, username);
	    }

	    public void typePasswordInputBox(String password) throws Exception {
	        type(loginPasswordInputBox, password);
	    }

	    public void clickOnLoginButton() throws Exception {
	        click(loginButton);
	    }

	    public boolean isPrestentProfile() throws IOException {
	        return isElementPresent(profile, 20);

	    }

	    public void waitForPageLoad() {
	        super.getDriver().manage().timeouts()
	                .pageLoadTimeout(90, TimeUnit.SECONDS);
	    }

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
