package com.cmcc.sunyiwei.core;

public class TestLamdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLamdaExpression test=new TestLamdaExpression();
//		HelloWorld hw=()->System.out.println("Hello world");
	}
	
	interface HelloWorld{
		void sayHello();
	}
	
	public void doSth(HelloWorld hw)
	{
		hw.sayHello();
	}
}
