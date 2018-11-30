package com.wjb.one.testb.exception;

public class Test {
	public static void main(String[] args) {
		ExceptionInfo info = ExceptionUtil.processExcepiton(new MyException());
		System.out.println(info.getText());
		System.out.println(info.getDetailInfo());
	}
}
