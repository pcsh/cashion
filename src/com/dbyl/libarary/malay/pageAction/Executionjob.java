package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.*;

public class Executionjob {
	public void createGlTaskBatch(WebDriver driver,String jobname) throws InterruptedException{
		malay3page.PageExist("menu-panel-item-SSMMENU0000000000000000000600000","menu-panel-item-SSMMENU0000000000000000000602000","menu-panel-item-SSMMENU0000000000000000000602030","toolbarPluginssm2030Frame",driver);
		driver.findElement(By.name("query")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("query")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("query")).sendKeys(jobname);//Generate task
		Thread.sleep(1000);
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Execution")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@i-id='ok']")).click();
		Thread.sleep(2000);	
	}

}
