package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;

public class DailyTasks {
	//addtasks(driver,任务类型，任务细类，任务描述，新增数量)
	public void AddTasks(WebDriver driver,String MasteTypeName,String SlaveTypeName,String Name,int n) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("item-tsk","item-tsk30","toolbarPlugintsk30Frame",driver);
		   driver.findElement(By.linkText("查询")).click();
		   for (int i=0;i<n;i++)
		   {
		   driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("dailyWorkMasteTypeName")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("dailyWorkMasteTypeName")).sendKeys(MasteTypeName);
			Thread.sleep(1000);
			driver.findElement(By.name("dailyWorkMasteTypeName")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.name("dailyWorkSlaveTypeName")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("dailyWorkSlaveTypeName")).sendKeys(SlaveTypeName);
			Thread.sleep(1000);
			driver.findElement(By.name("dailyWorkSlaveTypeName")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//form[@id='addDailyWorkForm']/ul[1]/li[3]/div[1]/input[1]")).click();
			
			//driver.findElement(By.xpath("//input[@clickaction = 'title']")).click();
			Thread.sleep(1000);//@id = 'newDailyWorkDiv'
			driver.findElement(By.xpath("//form[@id='addDailyWorkForm']/ul[1]/li[3]/div[1]/input[1]")).sendKeys(Name+i);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@clickaction = 'saveDailyWork']")).click();
			Thread.sleep(3000) ;  
		   }}}


