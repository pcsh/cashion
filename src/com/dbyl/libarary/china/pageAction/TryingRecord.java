package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;



public class TryingRecord {
	public void create(WebDriver driver,String strqdname) throws InterruptedException{

		PageExist.PageExist("item-pnm","item-pnm73","toolbarPluginpnm73Frame",driver);

	    driver.findElement(By.name("partnerName")).click();
	    driver.findElement(By.name("partnerName")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.name("partnerName")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("startDate")).click();
	    driver.findElement(By.name("startDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("endDate")).click();
	    driver.findElement(By.name("endDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("addree")).click();
	    driver.findElement(By.name("addree")).sendKeys("试用地点");
	    Thread.sleep(1000);

	    driver.findElement(By.xpath("//form[@id='issueForm']/div[1]/ul[1]/li[4]/div[1]/span[1]/label[1]/em[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("otherUser.name")).click();
	    driver.findElement(By.name("otherUser.name")).sendKeys("sunyan");
	    Thread.sleep(1000);
	    driver.findElement(By.name("otherUser.jobPost")).click();
	    driver.findElement(By.name("otherUser.jobPost")).sendKeys("职务");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='otherRow_1']/div[3]/label[1]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='otherRow_1']/div[3]/label[1]/input[1]")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.name("otherUser.age")).click();
	    driver.findElement(By.name("otherUser.age")).sendKeys("30");
	    Thread.sleep(1000);
	    driver.findElement(By.name("otherUser.phone")).click();
	    driver.findElement(By.name("otherUser.phone")).sendKeys("18959262996");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("我方人员")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("myUser.name")).click();
	    driver.findElement(By.name("myUser.name")).sendKeys("孙岩");
	    Thread.sleep(1000);
	    driver.findElement(By.name("myUser.jobPost")).click();
	    driver.findElement(By.name("myUser.jobPost")).sendKeys("职务");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("保存")).click();
	  //  driver.findElement(By.xpath("//form[@id='issueForm']/div[1]/div[3]/a[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("查看历史记录")).click();
	    Thread.sleep(1000);      
	}

}
