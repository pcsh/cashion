package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;
//日常记录
public class DailyRecord {
	public void create(WebDriver driver,String strqdname) throws InterruptedException{

		PageExist.PageExist("item-pnm","item-pnm75","toolbarPluginpnm75Frame",driver);

	    driver.findElement(By.name("partnerName")).click();
	    driver.findElement(By.name("partnerName")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.name("partnerName")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//label[@class='pop-date small']/input[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@class='pop-date small inp-active']/input[1]")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);

	    driver.findElement(By.name("applyUserName")).click();
	    driver.findElement(By.name("applyUserName")).sendKeys("提出人");
	    Thread.sleep(1000);
	    driver.findElement(By.name("descript")).click();
	    driver.findElement(By.name("descript")).sendKeys("问题描述");
	    Thread.sleep(1000);

	    driver.findElement(By.linkText("保存")).click();
	  //  driver.findElement(By.xpath("//form[@id='issueForm']/div[1]/div[3]/a[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("查看历史记录")).click();
	    Thread.sleep(1000);      
	}

}
