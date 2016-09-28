package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class RoleManage {

	public void RoleEdit(WebDriver driver,String strRole,String strNewRole) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1030","toolbarPluginssm1030Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).click();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).clear();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).sendKeys(strRole);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='name']")).click();
		  driver.findElement(By.xpath("//input[@name='name']")).clear();
		  driver.findElement(By.xpath("//input[@name='name']")).sendKeys(strNewRole);
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("保存")).click();
		  Thread.sleep(2000);
	}
	
	public void RoleAdd(WebDriver driver,String strRole,String strCode) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1030","toolbarPluginssm1030Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("新增")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='name']")).click();
		  driver.findElement(By.xpath("//input[@name='name']")).sendKeys(strRole);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='code']")).click();
		  driver.findElement(By.xpath("//input[@name='code']")).sendKeys(strCode);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("保存")).click();
		  Thread.sleep(2000);
	}

	public void RoleDelete(WebDriver driver,String strRole) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1030","toolbarPluginssm1030Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).click();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).clear();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编码']")).sendKeys(strRole);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("删除")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		  Thread.sleep(5000);
	}
	
}
