package com.dbyl.libarary.malay.pageAction;
import com.dbyl.libarary.utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AcctFirmList {
	public void creataccfirm(WebDriver driver,String strLogin,String strqdname,String qdstrphone,String strcontact) throws InterruptedException{
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000300000"
	    		,"menu-panel-item-SSMMENU0000000000000000000306000",
	    		"toolbarPluginbdm60Frame",driver);
	    driver.findElement(By.id("aAdd")).click();
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
	      driver.findElement(By.id("savebtn")).click();        
	      Thread.sleep(5000);        
	}
	public void batchset(WebDriver driver,String strLogin,String strqdname,String qdstrphone,String isreal) throws InterruptedException{
		PageExist.PageExist("menu-panel-item-SSMMENU0000000000000000000300000"
	    		,"menu-panel-item-SSMMENU0000000000000000000306000",
	    		"toolbarPluginbdm60Frame",driver);
	    driver.findElement(By.name("searchKeyCode")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("searchKeyCode")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.name("searchKeyCode")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@clickaction='queryGirdData']")).click();
	    Thread.sleep(2000);
	    String real=driver.findElement(By.xpath("//*[@aria-describedby='tableGrid_flag']")).getText();
	    if(real!=isreal)
	    {
	    	 driver.findElement(By.id("cb_tableGrid")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.id("aaa")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.id("flag")).click();
	         Thread.sleep(1000);
	         driver.findElement(By.linkText("Save")).click();
	    }
	    
       
	}

}
