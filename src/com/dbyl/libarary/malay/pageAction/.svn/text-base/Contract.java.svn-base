package com.dbyl.libarary.malay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dbyl.libarary.utils.PageExist;

public class Contract {

	public void ContractCreate(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000202000","toolbarPluginbiz20Frame",driver);
		   driver.findElement(By.linkText("Add")).click();
			Thread.sleep(2000);
			//选择企业
			driver.findElement(By.xpath("//*[@name='corpName']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='corpName']")).sendKeys(corpName);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@_row_id='id0']")).click();
			Thread.sleep(3000);
			//选择服务类型
			driver.findElement(By.xpath("//*[@aria-describedby='tableStep2Grid_productName']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("1_productNameDropDown")).click();
			Thread.sleep(1000);
			//修改数量
			driver.findElement(By.xpath("//*[@id='jqg1']/td[6]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_buyNumber']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys("12");
			Thread.sleep(1000);
			//赠送
			driver.findElement(By.xpath("//*[@id='jqg1']/td[7]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_freeNumber']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_freeNumber']")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='jqg1']/td[9]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_referencePrice']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_referencePrice']")).sendKeys("500");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='jqg1']/td[10]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_favorableVal']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_favorableVal']")).sendKeys("5");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='jqg1']/td[15]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_planStartTime']")).sendKeys("01/03/2015");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='jqg1']/td[16]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='1_firstPayDate']")).sendKeys("01/03/2015");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='corpName']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Next")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Confirm")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("OK")).click();
			Thread.sleep(1000);
			//业务管理>合同（END）
	}
	public void ContractCancel(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000202000","toolbarPluginbiz20Frame",driver);
		driver.findElement(By.name("searchText")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).sendKeys(corpName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='cb_tableAccountTask']")).click();
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		WebElement nav1 = driver.findElement(By.linkText("More"));
		builder.moveToElement(nav1).build().perform();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement webelement1 = driver.findElement(By.xpath("//*[@clickaction='cancelOrder']"));
        js1.executeScript("arguments[0].click();",webelement1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@i-id='ok']")).click();
		
	}
	public void ContractEdit(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000202000","toolbarPluginbiz20Frame",driver);
		driver.findElement(By.name("searchText")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).sendKeys(corpName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("toolbarPlugin5d5b3a88851549028790ebc1e4b9e9f6Frame");
		Thread.sleep(3000);
		WebElement frame=driver.findElement(By.xpath( "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/iframe" ));
		driver.switchTo().frame(frame); 
		Thread.sleep(1000);
		//修改数量  "//*[@id='jqg1']/td[15]"
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_buyNumber']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_buyNumber']")).sendKeys("9");
		Thread.sleep(1000);
		//赠送
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_freeNumber']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_freeNumber']")).sendKeys("3");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_referencePrice']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_referencePrice']")).sendKeys("600");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_favorableVal']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_favorableVal']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[14]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_startTime']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_startTime']")).sendKeys("01/05/2015");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[15]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_firstPayDate']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='1_firstPayDate']")).sendKeys("01/05/2015");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='tableStep1Grid']/tbody/tr[2]/td[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("OK")).click();
		Thread.sleep(1000);
		
		
	}
	public void Contractpay(WebDriver driver,String corpName) throws InterruptedException{
		PageExist pe = new PageExist(); 
		//业务管理>合同（BEGIN）
		pe.PageExist("menu-panel-item-SSMMENU0000000000000000000200000","menu-panel-item-SSMMENU0000000000000000000202000","toolbarPluginbiz20Frame",driver);
		driver.findElement(By.name("searchText")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("searchText")).sendKeys(corpName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Payments")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("payDate")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[@data-handler='today']")).click();
		driver.findElement(By.name("payDate")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//*[@class='icon-inp']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("cashAmt")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("cashAmt")).sendKeys("500");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Confirm']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@i-id='ok']")).click();
		Thread.sleep(1000);
		}
}
