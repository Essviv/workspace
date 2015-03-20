package com.cmcc.sunyiwei.core;

public class TestConstructor {


	private int nWidth=0;
	private int nHeight=0;
	private int nArea=nWidth*nHeight;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor constructor=new TestConstructor();
	}

	public TestConstructor(int a, int b) {
//		System.out.println("Haha!");
		this(a, b, 3, 4);
		
	}

	public TestConstructor() {
		this(1, 2, 0, 0);
	}

	public TestConstructor(int a, int b, int c, int d) {
		System.out.println("Hello world!" + String.valueOf(a)
				+ String.valueOf(b) + String.valueOf(c) + String.valueOf(d));
		System.out.println(nArea);
	}
}

class TestDefaultAccess {
	public TestDefaultAccess() {

	}
	
	public static final int COUNT=100;
}