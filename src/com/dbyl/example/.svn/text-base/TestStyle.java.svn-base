package com.dbyl.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestStyle {
  @Test
  public void findStyle() throws InterruptedException {
	  String URL="http://172.16.6.146:8888/a.html";
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
	  String txt = driver.findElement(By.xpath("//body[1]/div[1]/span[1]")).getText();
	  System.out.println(txt);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
