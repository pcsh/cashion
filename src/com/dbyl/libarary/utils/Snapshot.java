package com.dbyl.libarary.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Snapshot {
	
	/*
	 * 说明：截屏方法
	 * 用法：snapshot((TakesScreenshot)driver,"E:\\input_keyWord.png");
	 * 没指定路径，默认放在项目文件夹中
	 */
	public static void snapshot(TakesScreenshot drivername, String filename)
	  {
	      // this method will take screen shot ,require two parameters ,one is driver name, another is file name
	      
	      
	    File scrFile = drivername.getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        try {
	            System.out.println("save snapshot path is:"+filename);
	            FileUtils.copyFile(scrFile, new File(filename));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            System.out.println("Can't save screenshot");
	            e.printStackTrace();
	        } 
	        finally
	        {
	            System.out.println("screen shot finished");
	        }
	  }
}
