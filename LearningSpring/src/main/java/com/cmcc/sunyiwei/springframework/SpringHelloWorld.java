/**
 * @Title: 	SpringHelloWorld.java 
 * @Package com.cmcc.sunyiwei.springframework 
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午7:16:55 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		testAnotherInitAndDestructMethods();
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
}
