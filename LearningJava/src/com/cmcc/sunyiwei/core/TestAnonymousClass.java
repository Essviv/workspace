package com.cmcc.sunyiwei.core;

import java.net.InterfaceAddress;

public class TestAnonymousClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnonymousClass.test();
	}
	
	interface HelloWorld
	{
		void sayHello();
	}
	
	
	int nValue=100;
	
	public static void test()
	{
		
		class English implements HelloWorld
		{
			public void sayHello()
			{
				//System.out.println(nValue);
				System.out.println("hello");
			}
		}
		
		HelloWorld english=new English();
		
		HelloWorld frencn=new HelloWorld(){
			public void sayHello()
			{
				System.out.println("bonju");
			}
		};
		
		HelloWorld chinese=new HelloWorld() {
			
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("ÄãºÃ");
			}
		};
		
		//say
		english.sayHello();
		frencn.sayHello();
		chinese.sayHello();
	}
}
