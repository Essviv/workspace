/**
 * @Title: 	SpringHelloWorld.java 
 * @Package com.cmcc.sunyiwei.springframework 
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午7:16:55 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @ClassName: SpringHelloWorld
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年4月15日 下午7:16:55
 * 
 */
public class SpringHelloWorld {
	public static void main(String[] args) {
		// testScope();
		// testInitAndDestructMethods();
		// testAnotherInitAndDestructMethods();
		// testBeanPostInitialization();
		// testInheritance();
		// testInnerBeanInjection();
		// testInjectCollection();
		// testAutowire();
//		testJavaBasedConfiguration();
//		testCustomEvent();
//		testAOP();
//		testAnnotationAop();
		testJdbc();
	}

	public static void testScope() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"scopeBeans.xml");
		HelloWorld helloWorld1 = (HelloWorld) applicationContext
				.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) applicationContext
				.getBean("helloWorld");
		HelloWorld helloWorld3 = (HelloWorld) applicationContext
				.getBean("helloWorld_");
		HelloWorld helloWorld4 = (HelloWorld) applicationContext
				.getBean("helloWorld_");

		System.out.println(helloWorld1);
		System.out.println(helloWorld2);
		System.out.println(helloWorld3);
		System.out.println(helloWorld4);
	}

	public static void testInitAndDestructMethods() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"initAndDestructBeans.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext
				.getBean("helloWorld");
		System.out.println(helloWorld.getName());
		applicationContext.registerShutdownHook();
	}

	public static void testAnotherInitAndDestructMethods() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"initAndDestructBeans.xml");
		HelloWorldWithInitAndDestroy helloWorld = (HelloWorldWithInitAndDestroy) applicationContext
				.getBean("helloWorldWithInitAndDestroy");
		System.out.println(helloWorld.getName());
		applicationContext.registerShutdownHook();
	}

	public static void testBeanPostInitialization() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beanPostProcessor.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext
				.getBean("helloWorld");
		HelloWorldWithInitAndDestroy helloWorld_ = (HelloWorldWithInitAndDestroy) applicationContext
				.getBean("helloWorld_");
		System.out.println(helloWorld.getName());
		System.out.println(helloWorld_.getName());
		applicationContext.registerShutdownHook();
	}

	public static void testInheritance() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"inheritance.xml");
		HelloEnglish helloEnglish = (HelloEnglish) applicationContext
				.getBean("helloEnglish");
		HelloIndia helloIndia = (HelloIndia) applicationContext
				.getBean("helloIndia");

		System.out.println("helloEnglish says:" + helloEnglish.getName());
		System.out.println("helloIndia says:" + helloIndia.getName());
		System.out.println("helloIndia says:" + helloIndia.getMessage());
		applicationContext.registerShutdownHook();
	}

	public static void testInnerBeanInjection() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"innerBeanInjection.xml");
		TextEditor textEditor = (TextEditor) applicationContext
				.getBean("textEditor");

		textEditor.spellCheck();
	}

	public static void testInjectCollection() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"collection.xml");
		TestJavaCollection javaCollection = (TestJavaCollection) applicationContext
				.getBean("javaCollection");

		javaCollection.getAddressList();
		javaCollection.getAddressMap();
		javaCollection.getAddressProperties();
		javaCollection.getAddressSet();
		System.out.println("Name: " + javaCollection.getName());

		applicationContext.registerShutdownHook();
	}

	public static void testAutowire() {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"autoWire.xml");
		TextEditor textEditor = (TextEditor) applicationContext
				.getBean("textEditor");

		textEditor.spellCheck();
		System.out.println("Name: " + textEditor.getName());
	}

	public static void testJavaBasedConfiguration() {
		/*
		 * ApplicationContext applicationContext = new
		 * AnnotationConfigApplicationContext( BeansConfig.class);
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeansConfig.class);
		applicationContext.refresh();
		applicationContext.start();

		TextEditor textEditor = (TextEditor) applicationContext
				.getBean("textEditor");
		textEditor.spellCheck();
		applicationContext.stop();
	}
	
	public static void testCustomEvent(){
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext();
		ctx.register(BeansConfig.class);
		ctx.refresh();
		
		CustomEventPublisher cep  =
				(CustomEventPublisher)ctx.getBean("customEventPublisher");
		cep.publish();
		ctx.stop();
	}	
	
	public static void testAOP(){
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("aop.xml");
		HelloWorld helloWorld =(HelloWorld)ctx.getBean("helloWorld");
		helloWorld.getName();
		ctx.registerShutdownHook();
	}
	
	public static void testAnnotationAop(){
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("aspectj.xml");
		HelloWorld helloWorld=(HelloWorld)ctx.getBean("helloWorld");
		helloWorld.getName();
		ctx.registerShutdownHook();
		ctx.close();
	}
	
	public static void testJdbc(){
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext("jdbc.xml");
		SpringDAO springDAO = (SpringDAO)ctx.getBean("spingDAOImpl");
		springDAO.create("sunyiwei", 19);
		springDAO.create("patrick", 19);
		springDAO.listStudents();
		springDAO.delete(4);
		springDAO.update(3, 25);
		springDAO.get(2);
	}
}
