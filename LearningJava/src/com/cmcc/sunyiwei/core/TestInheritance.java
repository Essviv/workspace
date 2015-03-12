package com.cmcc.sunyiwei.core;

public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInheritance.InnerClassSubClass subClass=
				new TestInheritance().new InnerClassSubClass();
//		subClass
	}
	
	public TestInheritance()
	{
		
	}
	
	int nCount=10;
	class InnerClass
	{
		public InnerClass()
		{
			
		}
	}
	
	class InnerClassSubClass extends InnerClass
	{
		public InnerClassSubClass()
		{
			System.out.println(nCount);
		}
	}

}
