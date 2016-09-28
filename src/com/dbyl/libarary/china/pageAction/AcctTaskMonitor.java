package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class AcctTaskMonitor {

	public void AcctMonitor(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		  //会计任务监控（BEGIN）
			pe.PageExist("item-mnt","item-mnt10","toolbarPluginmnt10Frame",driver);
			  driver.findElement(By.id("accountingKeyCode")).sendKeys(corpName);
			  Thread.sleep(2000);
			  driver.findElement(By.id("accountingKeyCode")).sendKeys(Keys.ENTER);
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
			  driver.findElement(By.xpath("//*[@name='endGlDate']")).sendKeys("2015");	
			  driver.findElement(By.xpath("//*[@name='endGlDate']")).clear();
			  Thread.sleep(2000);
			  //driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
				Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@name='startGlDate']")).click();
			  driver.findElement(By.xpath("//*[@name='startGlDate']")).sendKeys("2015");
			  driver.findElement(By.xpath("//*[@name='startGlDate']")).clear();
			  Thread.sleep(2000);
			  //driver.findElement(By.xpath("//*[@name='startGlDate']")).click();					  
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
			Thread.sleep(2000);
			/*driver.findElement(By.xpath("//*[@type='text' and @placeholder='任务状态']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'记账')]")).click();//("//tbody/tr[@_row_id='id2']")).click();
			  Thread.sleep(2000);*/
			 driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
		    /*driver.findElement(By.xpath("//*[@type='text' and @placeholder='任务状态']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'就绪')]")).click();//("//tbody/tr[@_row_id='id2']")).click();
			 driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);*/
			 /* driver.findElement(By.linkText("分配人员")).click();
			  Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='displayName']")).click();
				driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(strLogin);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name='displayName']")).sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//form/span/label[1]/em")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("确定")).click();*/
				Thread.sleep(5000);			
				 driver.switchTo().defaultContent();
				 Thread.sleep(2000);
				 //会计任务监控（END）
	}
}
