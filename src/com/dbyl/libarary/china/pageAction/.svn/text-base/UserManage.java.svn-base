package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class UserManage {

	public void UserEdit(WebDriver driver,String strLogin) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1010","toolbarPluginssm1010Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).click();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).clear();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).sendKeys(strLogin);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("qq")).click();
		  driver.findElement(By.name("qq")).clear();
		  driver.findElement(By.name("qq")).sendKeys(strLogin);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id='form']/ul/li[9]/div/div/label[1]/em")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("保存")).click();
		  Thread.sleep(2000);
	}
	
	public void UserAdd(WebDriver driver,String strLogin) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1010","toolbarPluginssm1010Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("新增")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("name")).click();
		  driver.findElement(By.id("name")).sendKeys(strLogin);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='form']/ul/li[9]/div/div/label[2]/em")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("保存")).click();
		  Thread.sleep(2000);
	}

	public void UserDelete(WebDriver driver,String strLogin) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1010","toolbarPluginssm1010Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).click();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).clear();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入登录账号或姓名']")).sendKeys(strLogin);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("删除")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		  Thread.sleep(5000);
	}
	
}
