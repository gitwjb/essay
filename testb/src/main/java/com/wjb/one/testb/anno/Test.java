package com.wjb.one.testb.anno;

import java.lang.reflect.Method;

@TypeAnno("ss")
public class Test {
	
	public static void main(String[] args) {

		try {
//			Class<Test> clazz = (Class<Test>) Class.forName("com.wjb.one.testb.anno.Test");
			Class<Test> clazz = Test.class;
			
			boolean bb = clazz.isAnnotationPresent(TypeAnno.class);
			System.out.println(bb);
			TypeAnno anno = clazz.getAnnotation(TypeAnno.class);
			
			System.out.println(anno.value());
			
			
			Method testAnno = clazz.getDeclaredMethod("testAnno", new Class[0]);
			boolean cc = testAnno.isAnnotationPresent(MethodAnno.class);
			System.out.println(cc);
			System.out.println(testAnno.getAnnotation(MethodAnno.class).value());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@MethodAnno(value="method")
	public static void testAnno() {
		
		
	}
}
