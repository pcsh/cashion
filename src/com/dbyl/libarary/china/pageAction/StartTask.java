package com.dbyl.libarary.china.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.PageExist;
//销售启动页面
public class StartTask {
	//启动试用
	public void startrying(WebDriver driver,String strqdname) throws InterruptedException{

		PageExist.PageExist("item-pnm","item-pnm70","toolbarPluginpnm70Frame",driver);

	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.id("queryDataId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("启动试用")).click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("toolbarPluginprobation_startFrame");
	    Thread.sleep(1000);
	    driver.findElement(By.id("probationUserId")).click();
	    driver.findElement(By.id("probationUserId")).sendKeys("联系人");
	    Thread.sleep(1000);
	    driver.findElement(By.id("probationPost")).click();
	    driver.findElement(By.id("probationPost")).sendKeys("职务");
	    Thread.sleep(1000);
	    driver.findElement(By.id("probationPhone")).click();
	    driver.findElement(By.id("probationPhone")).sendKeys("18959262996");
	    Thread.sleep(1000);
	    driver.findElement(By.id("bizProvName")).click();
	    driver.findElement(By.id("bizProvName")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("bizCityName")).click();
	    driver.findElement(By.id("bizCityName")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("bizCountyName")).click();
	    driver.findElement(By.id("bizCountyName")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("saleAddr")).click();
	    driver.findElement(By.id("saleAddr")).sendKeys("详细地址");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//form[@id='probationForm']/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/span[1]/label[1]/em[1]")).click();
	 //   driver.findElement(By.linkText("商集公司")).click(); 
	    Thread.sleep(1000);
	    driver.findElement(By.id("probationAddr_onlyou")).click();
	    driver.findElement(By.id("probationAddr_onlyou")).sendKeys(strqdname);
	    Thread.sleep(1000);
	    driver.findElement(By.id("billUploadTs")).click();
	    driver.findElement(By.id("billUploadTs")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("billNum")).click();
	    driver.findElement(By.id("billNum")).sendKeys("100");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//form[@id='probationForm']/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/span[1]/label[1]/em[1]")).click();
		
	   // driver.findElement(By.linkText("唯你凤巢")).click(); 
	    Thread.sleep(1000);
	    driver.findElement(By.id("acctTotal")).click();
	    driver.findElement(By.id("acctTotal")).sendKeys("1");
	    Thread.sleep(1000);
	    driver.findElement(By.id("startDate")).click();
	    driver.findElement(By.id("startDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("endDate")).click();
	    driver.findElement(By.id("endDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[1]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[1]/input[1]")).sendKeys("试用会计");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[2]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[2]/input[1]")).sendKeys("试用会计职务");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[3]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[3]/input[1]")).sendKeys("5");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[4]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@id='ul_accountantList']/div[1]/div[4]/input[1]")).sendKeys("5");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@onclick='pageObj.locateAction.locateServers(this)']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).sendKeys("sunyan");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/div[2]/a[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@clickaction='saveProbation']")).click();
	    Thread.sleep(1000);
	          
	}
	//启动切换
	public void startchange(WebDriver driver,String strqdname) throws InterruptedException{

		PageExist.PageExist("item-pnm","item-pnm70","toolbarPluginpnm70Frame",driver);

	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys(strqdname);
	    Thread.sleep(2000);
	    driver.findElement(By.id("queryDataId")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("启动切换")).click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("toolbarPluginprobationToOfficialFrame");
	    Thread.sleep(1000);
	    driver.findElement(By.id("acctCorpNum")).click();
	    driver.findElement(By.id("acctCorpNum")).sendKeys("1");
	    Thread.sleep(1000);
	    driver.findElement(By.id("vopCorpNum")).click();
	    driver.findElement(By.id("vopCorpNum")).sendKeys("2");
	    Thread.sleep(1000);
	    driver.findElement(By.id("officiaStartDate")).click();
	    driver.findElement(By.id("officiaStartDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("officiaEndDate")).click();
	    driver.findElement(By.id("officiaEndDate")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);	    	  
	    driver.findElement(By.xpath("//div[@onclick='pageObj.locateAction.locateServers(this)']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).click();
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/input[1]")).sendKeys("sunyan");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='table-popovers']/form[1]/div[2]/a[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@clickaction='goOfficial']")).click();
	    Thread.sleep(1000);
	          
	}

}
