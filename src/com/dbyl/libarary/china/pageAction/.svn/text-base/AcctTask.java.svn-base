package com.dbyl.libarary.china.pageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class AcctTask {
	
	public void AcctTask(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//会计任务（BEGIN）
		 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
	  driver.findElement(By.id("name")).sendKeys(corpName);
	  Thread.sleep(2000);
	  driver.findElement(By.id("name")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
		driver.findElement(By.xpath("//*[@name='endGlDate']")).sendKeys("2015");
		driver.findElement(By.xpath("//*[@name='endGlDate']")).clear();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@name='endGlDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
		Thread.sleep(2000);
	  //driver.findElement(By.xpath("//*[@name='startGlDate']")).click();
	 //Thread.sleep(5000);
	//driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'2015年第1账期')]")).click();
	//Thread.sleep(2000);
	 driver.findElement(By.linkText("查询")).click();
	 Thread.sleep(2000);
	 String url0 = driver.getCurrentUrl();
	 System.out.println(url0);		
	 
		// 得到当前窗口的句柄
       String currentWindow = driver.getWindowHandle();  
       
	 driver.findElement(By.linkText("去记账")).click();
	 Thread.sleep(2000);
	 

       // 得到所有窗口的句柄  
       Set<String> handles = driver.getWindowHandles();  
       Iterator<String> it = handles.iterator();        //创建一个对象实现存放主页面句柄 
       String preWindowString = currentWindow;         
       while (it.hasNext())         {  
           String cruWindowString = it.next(); 
           System.out.println("next = " + cruWindowString);            
           if (currentWindow == cruWindowString) {                  
               continue;  
           }  
           WebDriver window = driver.switchTo().window(cruWindowString); 
       } 
       System.out.println("url1 = " + driver.getCurrentUrl());  				 
	 driver.close();
	 WebDriver window = driver.switchTo().window(preWindowString); 
	 //driver.navigate().to(url0);
	 System.out.println(driver.getCurrentUrl());	
	 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("更多")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div/div[1]/ul/li[4]/span[contains(text(),'无需传票')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("提交任务")).click();
	 Thread.sleep(2000);
	 
	 currentWindow = driver.getWindowHandle(); 
	 driver.findElement(By.linkText("去审账")).click();
	 Thread.sleep(2000);
	 
	// 得到所有窗口的句柄  
       handles = driver.getWindowHandles();  
        it = handles.iterator();        //创建一个对象实现存放主页面句柄 
     preWindowString = currentWindow;         
       while (it.hasNext())         {  
           String cruWindowString = it.next(); 
           System.out.println("next = " + cruWindowString);            
           if (currentWindow == cruWindowString) {                  
               continue;  
           }  
        window = driver.switchTo().window(cruWindowString); 
       } 
       System.out.println("url1 = " + driver.getCurrentUrl());  	
	 driver.close();
	 driver.switchTo().window(preWindowString); 
	 
	 Thread.sleep(2000);
	 System.out.println(driver.getCurrentUrl());	
	 pe.PageExist("item-tsk","item-tsk10","toolbarPlugintsk10Frame",driver);
	 currentWindow = driver.getWindowHandle(); 
	 driver.findElement(By.linkText("结账")).click();
	 Thread.sleep(2000);
	 
		// 得到所有窗口的句柄  
	        handles = driver.getWindowHandles();  
	         it = handles.iterator();        //创建一个对象实现存放主页面句柄 
	      preWindowString = currentWindow;         
	        while (it.hasNext())         {  
	            String cruWindowString = it.next(); 
	            System.out.println("next = " + cruWindowString);            
	            if (currentWindow == cruWindowString) {                  
	                continue;  
	            }  
	        driver.switchTo().window(cruWindowString); 
	        } 
	        System.out.println("url1 = " + driver.getCurrentUrl());  	

	 /*Thread.sleep(2000);
	 PageExist("item-4","item-42","toolbarPlugin42Frame",driver);
	 driver.findElement(By.xpath("//input[@value='检查准备']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='损益结转']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='试算平衡']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='结账']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='完成']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@value='确定']")).click();
	 Thread.sleep(5000);*/
       
	 driver.close();
	 driver.switchTo().window(preWindowString); 
	 Thread.sleep(5000);
	//会计任务（END）
	}
}
