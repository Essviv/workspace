package com.cmcc.sunyiwei.core;

//import javax.swing.DefaultBoundedRangeModel;

public class TestInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface.TestClass testClass=new TestInterface().new TestClass();
		testClass.sayByebye();
	}
	
	class TestClass implements CustomInterface
	{
//		@Override
		double PI=2.71828;
		
		public void sayHello() {
			// TODO Auto-generated method stub
			
		}

		public void sayByebye() {
			// TODO Auto-generated method stub
			System.out.println(PI);
		}

		public void sayGoodNight() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	interface CustomInterface{
		double PI=3.1415926;
//		double PI;
		void sayHello();
		void sayByebye();
		
		void sayGoodNight();
//		double Epsilon;
//		default boolean saySomething()
//		{
//			
//		}
		
//		public void sayGoodNight();
	}

}
