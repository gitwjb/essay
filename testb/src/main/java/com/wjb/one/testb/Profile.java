package com.wjb.one.testb;

public class Profile {
	/**
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println(System.getenv("tt"));
		//user.home user.dir java.home   三种路径
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.home"));
//		Properties pros = System.getProperties();
//		for (String str : pros.stringPropertyNames()) {
//			System.out.println(str + "=>" +pros.getProperty(str));
//		}

		System.out.println("============================");
		String[] ps = System.getenv("path").split(";");
		for (int i = 0; i < ps.length; i++) {
			System.out.println("=>"+ps[i]);
		}
	}
}
