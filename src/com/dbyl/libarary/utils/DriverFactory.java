package com.dbyl.libarary.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	public WebDriver driverchoice(int drivernum,String strPath)
	{
		WebDriver driver = null;
		if(drivernum == 0)
		{
			//chromeDriver(begin)
	          System.setProperty("webdriver.chrome.driver", 
	        		  strPath);
	          driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          return driver;
		}
		else if(drivernum == 1)
		{
			        
	        //IEdriver(begin)
	        System.setProperty("webdriver.ie.driver", 
	        		strPath);//IEDriverServer.exe PATH
	          DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
	          ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	          driver = new InternetExplorerDriver(ieCapabilities);
	          driver.manage().window().maximize();
	          return driver;
	        //IEdriver(end)
	       
		}
		else if(drivernum == 2)
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		else if(drivernum == 3)
		{
			driver = new HtmlUnitDriver(); 
			driver.manage().window().maximize();
			return driver;
					
		}
		else
		{
			return driver;
		}
	}

}
