package com.cmcc.sunyiwei.core;

public class TestGeneric<T> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dbValue=5d;
		TestGeneric<Double> d=new TestGeneric<Double>(dbValue);
		d.test();
	}

	public TestGeneric(T element)
	{
		m_element=element;
	}
	
	private T m_element=null;
	
	public void test()
	{
		System.out.println(m_element.toString());
	}
}
