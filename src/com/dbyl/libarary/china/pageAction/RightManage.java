package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;

public class RightManage {

	public void RightEdit(WebDriver driver,String strRole) throws InterruptedException{
		PageExist pe = new PageExist();
		  pe.PageExist("item-ssm","item-ssm1040","toolbarPluginssm1040Frame",driver);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编号']")).click();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编号']")).clear();
		  driver.findElement(By.xpath("//*[@name='query' and @placeholder='请输入角色名称或编号']")).sendKeys(strRole);
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("查询")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[contains(text(),'统计分析')]")).click();//统计分析
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//ul[@id='vopTree']/li/ul/li[4]/span[1]")).click();//进度监控
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//ul[@id='vopTree']/li/ul/li[4]/ul/li[3]/span[1]")).click();//进度监控
		  Thread.sleep(1000);
		  //driver.findElement(By.id("vopTree_99_switch")).click();//日常任务监控
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[contains(text(),'分配人员')]")).click();//分配人员

		  Thread.sleep(1000);
		  driver.findElement(By.linkText("保存")).click();
		  Thread.sleep(2000);
	}
	
	
}
