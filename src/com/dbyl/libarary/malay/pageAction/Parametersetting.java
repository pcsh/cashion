package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.*;

public class Parametersetting {
	public void AccTaskCreate(WebDriver driver,String corpName) throws InterruptedException{
		malay3page pe = new malay3page();		
		pe.PageExist("menu-panel-item-SSMMENU0000000000000000000600000","menu-panel-item-SSMMENU0000000000000000000602000","menu-panel-item-SSMMENU0000000000000000000602010","toolbarPluginssm2010Frame",driver);
		
		
		driver.findElement(By.xpath("//input[@name='corpName']")).click();
		driver.findElement(By.xpath("//input[@name='corpName']")).sendKeys(corpName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='glTaskDate']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='glTaskDate']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='glTaskDate']")).sendKeys("01-2016");
		Thread.sleep(1000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@_row_id='id0')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@clickaction='createGlTask']")).click();
		Thread.sleep(2000);	
		//系统管理>参数设置（END）
	}

}
