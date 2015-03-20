package com.cmcc.sunyiwei.core;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Date;

public class TestAnnotation extends SuperClass{

	@CustomAnnotation(
			author="sunyiwei", 
			Date="2014/11/03")
	private int nCount=0;
	
	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnnotation annotation=new TestAnnotation();
		annotation.saySomething();
		
		Date nowDate = new Date();
	    String strDate = nowDate.toLocaleString();
	    System.out.println(strDate);// 2009-12-27 16:44:09
	}
	
	
//	@CustomAnnotation(
//		author="",
//		Date="")
	public void test()
	{
		
	}

	@Target(ElementType.FIELD)
	@Documented
//	@Target
//	@Repeatable()
	public @interface CustomAnnotation{	
		String author();
		String Date();
		int currentRevision() default 1;
		String lastModified() default "N/A";
		String[] reviewers() default "";
	}
	
	public @interface Author{
		String value() default "";
	}
	
	@Override
	@Deprecated
	@Author("Sunyiwei")
	public void saySomething()
	{
		System.out.println("Hello world");
	}
}

class SuperClass
{
	public void saySomething()
	{
		
	}
}
