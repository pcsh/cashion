package com.dbyl.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.dbyl.libarary.utils.Snapshot;

public class ScreemTakeExample {
  
	/*
	 * 截屏举例：百度搜索
	 */
	@Test
  public void ScreemTake() throws InterruptedException {
	  Snapshot sp = new Snapshot();
      String URL="http://www.baidu.com";
      //System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); 
      //WebDriver driver = new ChromeDriver();
      WebDriver driver = new FirefoxDriver();
      driver.get(URL);
      //max size the browser
      driver.manage().window().maximize(); 
/*
      Navigation navigation = driver.navigate();
       navigation.to(URL);*/
       Thread.sleep(2000);
       sp.snapshot((TakesScreenshot)driver,"./test-output/open_baidu.png");
       //WebElement reg=driver.findElement(By.name("tj_reg"));
       //reg.click();
       //    WebElement keyWord = driver.findElement(By.id("kw1"));
       
       //find the element
       WebElement keyWord = driver.findElement(By.xpath("//input[@id='kw']"));
      keyWord.clear();
      //send key words 
       keyWord.sendKeys("Selenium");
       Thread.sleep(3000);
        sp.snapshot((TakesScreenshot)driver,"./test-output/input_keyWord.png");
       

       
        WebElement submit = driver.findElement(By.id("su"));
        
        System.out.println(submit.getLocation());
        submit.click();
        //System.out.println(driver.getWindowHandle());
       Thread.sleep(5000);
        
      // System.out.println(driver.getPageSource());
      
      String pageSource=driver.getPageSource();
     //  System.out.println(pageSource);
      //WebElement link =driver.findElement(By.xpath(SELENIUM_LINK));
      WebElement link =driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));     //*[@id="1"]/h3/a
      link.click();
      Thread.sleep(5000); 
      driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
   
      //get page title
      System.out.println(driver.getTitle());
       Thread.sleep(5000);
  //     navigation.back();
//        sp.snapshot((TakesScreenshot)driver,"./test-output/open_bake.png");
       System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
        driver.quit();

  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
