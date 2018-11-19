package com.wjb.one.testb.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class First {
	
	public static Logger logger = LoggerFactory.getLogger(First.class);
	public static void main(String[] args) {
		System.out.println("It is initial... ");
		System.out.println(System.getProperty("project_loc"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.home"));
		logger.info("testb");
	}
}
