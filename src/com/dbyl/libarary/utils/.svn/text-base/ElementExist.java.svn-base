package com.dbyl.libarary.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ElementExist {
	
	public class ElementExistOrNot implements Function<WebDriver,Boolean> {//第一个参数为apply方法的参数类型，第二个参数为apply方法的返回类型
		   private By by;
		    private String sign;
		    
		    public ElementExistOrNot(By by, String sign) {
		        this.by = by;
		        this.sign = sign;
		    }
		    @Override
		    public Boolean apply(WebDriver driver) {
		        try{
		            WebElement e=driver.findElement(by);
		            if(sign.equals("yes")){
		                return true;
		            }else{
		                return false;
		            }
		        }catch (Exception e){
		            if(sign.equals("yes")){
		                return false;
		            }else{
		                return true;
		            }
		        }
		    }
	}
	//完成对元素的 ”查找+等待+验证存在性“ 的封装
	public void waitUntilElementExist(By by){
	    ElementExistOrNot isTrue=new ElementExistOrNot(by,"yes");
	    WebDriver driver = null;	    
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    try{
	        wait.until(isTrue);
	    }catch (Exception e){
//	        fail("Element [" + by + "] should presents!");
	    }
	}
}
