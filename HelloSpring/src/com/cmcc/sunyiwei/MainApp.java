package com.cmcc.sunyiwei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmcc.sunyiwei.customlistener.CustomEventPublisher;

public class MainApp {
	public static void main(String[] args)
	{
//		@SuppressWarnings("resource")
//		AbstractApplicationContext context=
//				new ClassPathXmlApplicationContext("Beans.xml");
//		
//		HelloWorld hWorld=(HelloWorld)context.getBean("helloWorld");
//		hWorld.setMessage("I'm from China.");
//		
////		HelloWorld newWorld=(HelloWorld)context.getBean("helloWorld");
////		System.out.println(newWorld + "_" + newWorld.getMessage());
//		System.out.println(hWorld.getMessage());
//		context.registerShutdownHook();
////		context.close();
//		AbstractApplicationContext context=
//				new ClassPathXmlApplicationContext("Beans.xml");
//		
//		ParentBean parentBean=(ParentBean)context.getBean("parentBean");
//		System.out.println(parentBean.getClass());
//		System.out.println(parentBean.getMessage1());
//		System.out.println(parentBean.getMessage2());
//		System.out.println("=============================");
//		
//		ChildBean childBean=(ChildBean)context.getBean("childBean");
//		System.out.println(childBean.getMessage1());
//		System.out.println(childBean.getMessage2());
//		System.out.println(childBean.getMessage3());
//		
//		TextEditor editor=(TextEditor)context.getBean("textEditor");
//		editor.spellCheck();
//		
//		JavaCollection collection=(JavaCollection)context.getBean("javaCollection");
//		collection.getListData();
//		System.out.println("============");
//		collection.getMapData();
//		System.out.println("============");
//		collection.getPropsData();
//		System.out.println("============");
//		collection.getSetData();
//		
//		Profile profile=(Profile)context.getBean("profile");
//		profile.printName();
//		profile.printAge();
		
		System.out.println("==========================");
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AnnotationConfigTest.class);
		
		//invoke start event
		ctx.start();
//		HelloWorld helloWorld=(HelloWorld)ctx.getBean("helloWorld");
//		helloWorld.setMessage("hsadfhak");
//		System.out.println(helloWorld.getMessage());
		TextEditor textEditor=(TextEditor)ctx.getBean("textEditor");
		textEditor.spellCheck();
	
		CustomEventPublisher publisher=(CustomEventPublisher)ctx.getBean("customEventPublisher");
		publisher.publish();
			
		//invoke stop event
		ctx.stop();
	}
}
