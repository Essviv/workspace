package com.cmcc.sunyiwei.core;

public class TestNestedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNestedClass.TestStaticNestedClass test=
				new TestNestedClass.TestStaticNestedClass();
		test.test();
		
		TestNestedClass.TestInnerClass innerClass=
				new TestNestedClass().new TestInnerClass();
		innerClass.test();
	}
	
	static int nCount=100;
	public int nWidth=200;
	static class TestStaticNestedClass
	{
		public void test()
		{
			System.out.println(nCount);
//			System.out.println(nWidth);
		}
	}
	
	private class TestInnerClass
	{
		private final static int nCount=540;
//		private static int nCount=540;
		public void test()
		{
			
			System.out.println(nWidth);
			System.out.println(nCount);
		}
	}
}
