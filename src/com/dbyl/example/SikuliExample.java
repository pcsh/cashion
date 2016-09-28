package com.dbyl.example;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SikuliExample {
  @Test
  public void findStyle() throws InterruptedException, FindFailed {
	  String URL="http://beta.onlyou.com:8888/admin/";
      //System.setProperty("webdriver.chrome.driver", "E:\\seleniumS\\chromedriver_win32\\chromedriver.exe"); 
      //WebDriver driver = new ChromeDriver();
      WebDriver driver = new FirefoxDriver();
      driver.get(URL);
      //max size the browser
      driver.manage().window().maximize(); 
       Thread.sleep(2000);
       Screen s = new Screen();
       s.click("name.png");
       Thread.sleep(2000);
       s.type("omp");
       s.type(Key.SHIFT);
       s.click("passwd.png");
       Thread.sleep(2000);
       s.type("123456");
       s.click("login.png");
       Thread.sleep(5000);
       s.click("manage.png");
       s.click("hetong.png");
       Thread.sleep(2000);
       s.click("add.png");
       Thread.sleep(5000);
       s.click("fujian.png");
       s.click("upload.png");
       s.click("open.png");
       Thread.sleep(2000);
       s.click("qudaoname.png");
       Thread.sleep(1000);
       s.click("onlyou.png");
       s.click("time1.png");
       s.click("time11.png");
       s.click("time2.png");
       s.click("time22.png");       
       s.click("time3.png");
       s.click("time55.png");
       s.click("time4.png");
       s.click("time44.png");
       s.click("time5.png");
       s.click("time33.png");    
       s.click("money.png");
       s.type("5000");
       s.click("luru.png");
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);      
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       s.type(Key.DOWN);
       Thread.sleep(2000);
       s.click("shoukuan.png");
       s.click("shoukuanname.png");
       s.click("num1.png");
       s.click("num11.png");
       s.click("num2.png");
       s.click("num22.png");
       s.click("save.png");
       Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
