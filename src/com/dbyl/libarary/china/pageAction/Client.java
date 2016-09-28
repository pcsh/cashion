package com.dbyl.libarary.china.pageAction;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;
import com.dbyl.libarary.utils.QueryData;

public class Client {

	public String ClientCreate(
			WebDriver driver,
			String strowner,
			String strtime,
			String strOrg,
			String strLogin,
			String strUrl,
			String strUser,
			String strPwd) throws InterruptedException, SQLException{
		PageExist pe = new PageExist(); 
		//业务管理>企业（BEGIN）
		pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
	   //driver.findElement(By.linkText("查询"));
	   driver.findElement(By.linkText("新增")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='ownerName']")).click();
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(strowner);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='ownerName']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).click();
		driver.findElement(By.xpath("//*[@name='name' and @placeholder='请输入企业名称']")).sendKeys("商业国际物流"+strtime);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contact']")).click();
		driver.findElement(By.xpath("//*[@name='contact']")).sendKeys("pancs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='contactPhone']")).click();
		driver.findElement(By.xpath("//*[@name='contactPhone']")).sendKeys("15880276011");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrProvinceName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrCityName']")).sendKeys("北京"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).click();
		driver.findElement(By.xpath("//*[@name='serAddrAreaName']")).sendKeys("东城区"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).click();
		driver.findElement(By.xpath("//*[@name='serviceAddress']")).sendKeys("长安街");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='orgName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'"+strOrg+"')]")).click();//"+strOrg+"
		Thread.sleep(2000);
		driver.findElement(By.id("savebtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("查询")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("商业国际物流"+strtime);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("分配人员")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='输入关键字']")).click();
		driver.findElement(By.xpath("//input[@placeholder='输入关键字']")).sendKeys(strLogin);
		Thread.sleep(1000);
		driver.findElement(By.linkText("查询")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cb_userSingleItem_leftGrid")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userSingleItem_selected_0']/div[1]/div[1]/i")).click();
		Thread.sleep(2000);
		QueryData qd = new QueryData();
	    String UID = qd.UserID(strUrl, strUser, strPwd, strLogin);
	    Thread.sleep(2000);
	    Actions builder1 = new Actions(driver);
        WebElement nav1 = driver.findElement(By.id("jqg_userSingleItem_selected_0_grid_"+UID));
        if(nav1.isDisplayed()){
            //System.out.println(nav1.getText());
            builder1.moveToElement(nav1).build().perform();
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = driver.findElement(By.xpath("//*[@id='"+UID+"']/td[6]/span"));
        js1.executeScript("arguments[0].click();",webelement1);
        Thread.sleep(3000);    
		//driver.findElement(By.id("jqg_userSingleItem_selected_0_grid_"+UID)).click();
		//driver.findElement(By.linkText("设置主管")).click();
		Thread.sleep(2000);

	    driver.findElement(By.xpath("//*[@i-id='ok']")).click();
		Thread.sleep(5000);
		//业务管理>企业（END）
		String strclient = "商业国际物流"+strtime;
		return strclient;
	}
	
	public void ClientEdit(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>企业--企业信息维护(BEGIN)
		pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
	   	driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("新增")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("取消")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("查询")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(corpName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("企业信息")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("toolbarPlugincor301Frame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='corpForm']/div[1]/ul/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'registerMoney']")).click();
		driver.findElement(By.xpath("//input[@name = 'registerMoney']")).sendKeys("100");
		Thread.sleep(2000);			
		driver.findElement(By.linkText("保存")).click();		
		Thread.sleep(2000);	
		driver.findElement(By.linkText("交接完成")).click();	
		Thread.sleep(2000);	
		//业务管理>企业--企业信息维护(END)
	}
	
	public void ClientDelete(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>企业--企业信息维护(BEGIN)
		pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
	   	driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("新增")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("取消")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("查询")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(corpName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@componenttype='drop-down-more']")).click();
		Thread.sleep(2000);
		String currentWindow1 = driver.getWindowHandle();  
		 driver.findElement(By.xpath("//*[@id='moreSthDivId']/div[1]/ul/li[contains(text(),'删除')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@i-id='ok']")).click();
		Thread.sleep(2000);
	}
	
	public void ClientInit(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		   
		//企业初始化（BEGIN）
		pe.PageExist("item-biz","item-biz1020","toolbarPluginbiz1020Frame",driver);
		   	driver.findElement(By.id("name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.linkText("新增")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("取消")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("查询")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name")).click();
			driver.findElement(By.id("name")).sendKeys(corpName);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-b']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='btn-c']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@componenttype='drop-down-more']")).click();
		Thread.sleep(2000);
		String currentWindow1 = driver.getWindowHandle();  
		 driver.findElement(By.xpath("//*[@id='moreSthDivId']/div[1]/ul/li[contains(text(),'初始化企业')]")).click();
		 Thread.sleep(2000);
	        // 得到所有窗口的句柄  
	        Set<String> handles1 = driver.getWindowHandles();  
	        Iterator<String> it1 = handles1.iterator();        //创建一个对象实现存放主页面句柄 
	        String preWindowString1 = currentWindow1;         
	        while (it1.hasNext())         {  
	            String cruWindowString1 = it1.next(); 
	            System.out.println("next = " + cruWindowString1);            
	            if (currentWindow1 == cruWindowString1) {                  
	                continue;  
	            }  
	            driver.switchTo().window(cruWindowString1); 
	        } 
	        System.out.println("url1 = " + driver.getCurrentUrl());  	
	        pe.PageExist("item-6","item-612","toolbarPlugin612Frame",driver);
		 driver.findElement(By.id("setAcctBtn")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@value='确定']")).click();
		 Thread.sleep(8000);
		 pe.PageExist("item-6","item-613","toolbarPlugin613Frame",driver);
		 driver.findElement(By.xpath("//button[@onclick='initialize()']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@value='确定']")).click();
		 Thread.sleep(8000);
		 
		 driver.close();
		 WebDriver window1 = driver.switchTo().window(preWindowString1); 
		//企业初始（End）
	}
}
