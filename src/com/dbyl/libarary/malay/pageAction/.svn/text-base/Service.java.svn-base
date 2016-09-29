package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dbyl.libarary.utils.PageExist;

public class Service {

	public void ServiceEdit(WebDriver driver,String corpName) throws InterruptedException{
		 PageExist pe = new PageExist();   
			//业务管理>服务（BEGIN）
			pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000203000","toolbarPluginbiz30Frame",driver);
			driver.findElement(By.linkText("Add")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@clickaction='cancelForAdd']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='query']")).click();
			driver.findElement(By.xpath("//*[@name='query']")).sendKeys(corpName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@value='Search']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("  Edit")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@name='startTime']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='startTime']")).sendKeys("01/04/2015");
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
			WebElement target = driver.findElement(By.xpath("//*[@clickaction='doSave']"));
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", target);
			Thread.sleep(3000);
			//业务管理>服务（END）
	}
	public void ServiceAdd(WebDriver driver,String corpName) throws InterruptedException{
		 PageExist pe = new PageExist();   
			//业务管理>服务（BEGIN）
			pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000203000","toolbarPluginbiz30Frame",driver);
			driver.findElement(By.linkText("Add")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("corpName")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("corpName")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.name("productCombo")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("productCombo")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.name("startTime")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("startTime")).sendKeys("01/02/2015");
			Thread.sleep(2000);
			driver.findElement(By.name("productCombo")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("freeNumber")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("freeNumber")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("freeNumber")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@clickaction='saveAddForm']")).click();
			Thread.sleep(2000);
	
	}
}
