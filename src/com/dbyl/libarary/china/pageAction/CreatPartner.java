package com.dbyl.libarary.china.pageAction;

import com.dbyl.libarary.utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatPartner {

	public void CreatPartner(WebDriver driver,String strLogin,String strqdname,String qdstrphone,String strcontact) throws InterruptedException{
		PageExist peA = new PageExist();
	    peA.PageExist("item-pnm","item-pnm30","toolbarPluginpnm30Frame",driver);
	    driver.findElement(By.linkText("新增")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("logUserId")).click();
	    driver.findElement(By.id("logUserId")).sendKeys(strLogin);
	    Thread.sleep(2000);
	    driver.findElement(By.id("partnerName")).click();
	    driver.findElement(By.id("partnerName")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.id("linkMan")).click();
	    driver.findElement(By.id("linkMan")).sendKeys(strcontact);
	    Thread.sleep(2000);
	    driver.findElement(By.id("contactNum")).click();
	    driver.findElement(By.id("contactNum")).sendKeys(qdstrphone);
	    Thread.sleep(2000);
	      driver.findElement(By.linkText("保存")).click();        
	      Thread.sleep(5000);        
	}
	
}
