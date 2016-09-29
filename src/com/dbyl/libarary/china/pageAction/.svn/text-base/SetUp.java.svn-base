package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class SetUp {

	public void AccTaskCreate(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//系统管理>参数设置（BEGIN）
		 pe.PageExist("item-ssm","item-ssm2010","toolbarPluginssm2010Frame",driver);
		driver.findElement(By.xpath("//input[@name='glTaskDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='corpName']")).click();
		driver.findElement(By.xpath("//input[@name='corpName']")).sendKeys(corpName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='glTaskDate']")).click();
		//driver.findElement(By.xpath("//input[@name='glTaskDate']")).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElement(By.linkText("生成任务")).click();
		Thread.sleep(2000);	
		//系统管理>参数设置（END）
	}
}
