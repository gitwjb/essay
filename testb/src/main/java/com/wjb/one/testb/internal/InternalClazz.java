package com.wjb.one.testb.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InternalClazz {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	public static void main(String[] args) {
		System.out.println("It is initial... ");
		System.out.println(System.getProperty("project_loc"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.home"));
	}
}
