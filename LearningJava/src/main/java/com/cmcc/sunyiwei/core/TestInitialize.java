package com.cmcc.sunyiwei.core;

public class TestInitialize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInitialize initialize=new TestInitialize();
		System.out.println(initialize.getCount());
		System.out.println(initialize.getWidth());
		System.out.println(initialize.getHeight());
	}

	public int getCount()
	{
		return nCount;
	}
	
	public int getWidth()
	{
		return nWidth;
	}
	
	public int getHeight()
	{
		return nHeight;
	}
	private int nCount;
	private int nWidth, nHeight;
	
	/*
	 * ³õÊ¼»¯´úÂë
	 */
	{
		nCount=0;
		for(int i=0;i<10;i++)
			nCount+=i;
		
		nWidth=nCount/5;
		nHeight=nCount%5;
	}
}
