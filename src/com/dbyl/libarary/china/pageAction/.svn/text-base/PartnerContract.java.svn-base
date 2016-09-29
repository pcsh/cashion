
package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.dbyl.libarary.utils.PageExist;
//渠道合同
public class PartnerContract {
	public void create(WebDriver driver,String strqdname) throws InterruptedException, FindFailed{


		PageExist.PageExist("item-pnm","item-pnm80","toolbarPluginpnm80Frame",driver);
		driver.findElement(By.linkText("新增")).click();		
		Thread.sleep(4000);	
		driver.switchTo().defaultContent();
	    driver.switchTo().frame("toolbarPluginaddContractFrame");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='formStep1']/div[1]/div[1]/ul[1]/li[1]/label[2]/input[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//form[@id='formStep1']/div[1]/div[1]/ul[1]/li[1]/label[2]/input[1]")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//form[@id='formStep1']/div[1]/div[1]/ul[1]/li[1]/label[2]/input[1]")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
		driver.findElement(By.id("signDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signDate")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	    driver.findElement(By.name("contractDateStart")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractDateStart")).sendKeys("2016-06-01");
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractDateEnd")).click();
	    Thread.sleep(1000);
	    
	    
	    driver.findElement(By.name("contractDateEnd")).sendKeys("2017-06-01");
	    Thread.sleep(1000);
	    Screen s = new Screen();
	    s.find("1.png"); 
	    s.click("1.png");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("contractOperationStart")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractOperationStart")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractOperationEnd")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractOperationEnd")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("contractDeposit")).click();
	    driver.findElement(By.name("contractDeposit")).sendKeys("20000");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@id='chargeItesCheckBoxLabel']/em[1]")).click();
	    Thread.sleep(1000);
	    
	    s.find("上传附件.png"); 
	    s.click("上传附件.png"); //click p
	    
	    s.find("文件名.png"); //identify play button
	    s.type(Key.SHIFT);
	    s.type("文件名.png","D:\\work\\test\\vop\\54756db99392d.jpg"); //click play button
	    s.find("打开.png");
	    s.click("打开.png");
	   // driver.findElement(By.id("SWFUpload_0")).click();打开
	   // driver.findElement(By.xpath("//div[@id='uploadOper']/div[1]/div[1]/div[1]/object[1]")).click();
	    //sendKeys("C:\\Users\\岩\\Desktop\\184270249.jpg");
	   // Thread.sleep(1000);
	   // driver.findElement(By.id("SWFUpload_0")).sendKeys("C:\\Users\\岩\\Desktop\\184270249.jpg");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@componentconfigext='pageObj.payToConfigExt']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@componentconfigext='pageObj.payToConfigExt']")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("accountsDate")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("accountsDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("payDate")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("payDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("保存")).click();
	    Thread.sleep(1000);
	    
	}


}
