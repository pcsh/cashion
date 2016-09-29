package com.dbyl.libarary.china.pageAction;


import com.dbyl.libarary.utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Key;

public class AssignTask {
//分配销售
	public void Assignsalesman(WebDriver driver,String strqdname) throws InterruptedException{
		PageExist.PageExist("item-pnm","item-pnm71","toolbarPluginpnm71Frame",driver);
	    	    	    	    
	    driver.findElement(By.name("query")).click();
	    driver.findElement(By.name("query")).sendKeys(strqdname);
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("查询")).click();  
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("分配销售")).click(); 
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).sendKeys("sunyan");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).sendKeys(Key.ENTER);
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/span")).click();
	    //Thread.sleep(1000);
	    driver.findElement(By.linkText("确定")).click();
	    Thread.sleep(1000);
	    
	}
	
}
