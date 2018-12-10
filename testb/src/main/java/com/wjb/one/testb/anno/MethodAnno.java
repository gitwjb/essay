package com.wjb.one.testb.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodAnno{
	
	String value() default "";
	
	String[] name() default {"1","2"};
	
	String test() default "";
	
}
