package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;
//实施任务
public class ImplementationTask {
	//接受任务	
	public void accept(WebDriver driver,String strqdname) throws InterruptedException{

		PageExist.PageExist("item-pnm","item-pnm72","toolbarPluginpnm72Frame",driver);

	    driver.findElement(By.name("query")).click();
	    driver.findElement(By.name("query")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("查询")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("cb_grid")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//table[@id='grid']//a[text()='接受任务']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@i-id='ok']")).click();
	    Thread.sleep(1000);
	          
	}

}
