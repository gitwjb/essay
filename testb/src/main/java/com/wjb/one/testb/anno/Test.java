package com.wjb.one.testb.anno;

public class Test {
	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.wjb.one.testb.anno.Test");
			
			boolean bb = clazz.isAnnotationPresent(DiyAnno.class);
			System.out.println(bb);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
