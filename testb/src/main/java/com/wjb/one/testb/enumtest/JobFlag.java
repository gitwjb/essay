package com.wjb.one.testb.enumtest;

/**
 * @description  父子作业标识
 * @author wjb
 */
public enum JobFlag {
	MASTER("M"),SECONDBY("S");
	
	private String info;

	private JobFlag(String info) {
		this.info = info;
	}

	public String getInfo() {
		
		return this.info;
	}
}
