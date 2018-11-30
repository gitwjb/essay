package com.wjb.one.testb.enumtest;

public class Test {
	public static void main(String[] args) {
		//System.out.println(TestEnum.);
		TestEnum desc = TestEnum.valueOf("DESC");
		System.out.println(TestEnum.valueOf(TestEnum.class, "Asc"));	
	}
}
