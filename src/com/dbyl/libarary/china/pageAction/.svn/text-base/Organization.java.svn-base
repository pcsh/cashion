package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class Organization {

	public String OrgSelect(WebDriver driver) throws InterruptedException{
		PageExist pe = new PageExist();  
		pe.PageExist("item-bdm","item-bdm10","toolbarPluginbdm10Frame",driver);
		String strOrg = driver.findElement(By.id("orgTree_1_span")).getText();	
		return strOrg;
		//System.out.println(strOrg);
	}
	
	public void OrgAdd(WebDriver driver,String orgName,String orgCode,String phone) throws InterruptedException{
		PageExist pe = new PageExist();  
		pe.PageExist("item-bdm","item-bdm10","toolbarPluginbdm10Frame",driver);
		String strOrg = driver.findElement(By.id("orgTree_1_span")).getText();
		driver.findElement(By.linkText("新增")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("orgName")).click();
		driver.findElement(By.name("orgName")).sendKeys(orgName);
		driver.findElement(By.name("orgCode")).click();
		driver.findElement(By.name("orgCode")).sendKeys(orgCode);
		driver.findElement(By.name("phone")).click();
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("address")).click();
		driver.findElement(By.name("address")).sendKeys("长安街");
		driver.findElement(By.xpath("//*[@name='provinceName']")).click();
		driver.findElement(By.xpath("//*[@name='provinceName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='cityName']")).click();
		driver.findElement(By.xpath("//*[@name='cityName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='districtName']")).click();
		driver.findElement(By.xpath("//*[@name='districtName']")).sendKeys("东城区"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.linkText("保存")).click();
		//System.out.println(strOrg);
	}
}