package com.dbyl.libarary.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;

/*
 * 自已构造一个断言类，把Assert.assertEquals给try catch住
 */
public class Assertion {

	public static Logger log = Logger.getLogger(Assertion.class);
	public static boolean flag=true;
	public static List<Error> errors = new ArrayList<Error>();
	public static void begin()
	{
		flag = true;
	}
	public static void end(){
		Assert.assertTrue(flag);
	}
	public static void verifyEquals(Object actual,Object expected){
		try{
			Assert.assertEquals(actual, expected);
		}catch(Error e){
			errors.add(e);
			flag = false;
		}
	}
	public static void verifyEquals(Object actual,Object expected,String message){
		try{
			Assert.assertEquals(actual, expected,message);
			log.info(" 方法验证成功！");
		}catch(Error e){
			errors.add(e);
			flag=false;
			log.info(" 方法验证失败！");
		}
	}	
}
