package com.wjb.one.testb.reflection;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.Enumeration;
import java.util.Vector;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class Test {
	public static void main(String[] args) {
		try {
//			System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
			
			
			Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources("classpath:com/wjb/one/testb/*.class");
			while (urls.hasMoreElements()) {
				URL url = urls.nextElement();
				Resource resource = new UrlResource(url);
				System.out.println(resource.getDescription());
			}

//			Field f=ClassLoader.class.getDeclaredField("classes");
//			f.setAccessible(true);
//			Vector classes= (Vector) f.get(ClassLoader.getSystemClassLoader());
//			System.out.println(classes);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
