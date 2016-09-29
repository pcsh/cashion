package com.dbyl.example;

import java.util.logging.Logger;

public class log4jDemo {

	public static void main(String[] args){
		Logger log = null;
		try{
			log = Logger.getLogger(log4jDemo.class.getName());
			int i = 1/0;
		}catch(Exception e){
			log.info(e.getMessage());
		}
	}
	
}
