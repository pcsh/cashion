package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.PageExist;

public class Service {

	public void ServiceEdit(WebDriver driver,String corpName) throws InterruptedException{
		 PageExist pe = new PageExist();   
			//业务管理>服务（BEGIN）
			pe.PageExist("item-biz","item-biz2020","toolbarPluginbiz2020Frame",driver);
			driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='query']")).click();
			driver.findElement(By.xpath("//*[@name='query']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("  编辑")).click();
			//Thread.sleep(6000);
			//driver.findElement(By.xpath("//*[@name='startTime']")).sendKeys("2015-01-01");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='buyNumber']")).click();
			driver.findElement(By.xpath("//*[@name='buyNumber']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='buyNumber']")).sendKeys("10");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='freeNumber']")).click();
			driver.findElement(By.xpath("//*[@name='freeNumber']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='freeNumber']")).sendKeys("2");	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='buyNumber']")).click(); //触发终止日期调整
			//使用JS定位隐藏或没显示在可视界面上的元素
			WebElement target = driver.findElement(By.xpath("//button[@clickaction='doSave']"));
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", target);
			Thread.sleep(3000);
			//业务管理>服务（END）
	}
}
