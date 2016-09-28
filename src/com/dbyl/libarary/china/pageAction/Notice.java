package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Notice {

	public void NoticeSure(WebDriver driver) throws InterruptedException{
		  //公告确认：
		try
		{
		  driver.findElement(By.xpath("//a[@class = 'btn-c']")).click();
		  Thread.sleep(5000);
		}
		catch(org.openqa.selenium.ElementNotVisibleException ex)
		{
		
		}
	}
}