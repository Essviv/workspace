package com.cmcc.sunyiwei.core;

public class TestVarArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nValues={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TestVarArgs.test(nValues);
		
		System.out.println("============");
		TestVarArgs.test(0, 1, 2, 3, 4);
	}
	
	public static void test(int... nValues)
	{
		for(int item: nValues)
			System.out.println(item);
	}

}
