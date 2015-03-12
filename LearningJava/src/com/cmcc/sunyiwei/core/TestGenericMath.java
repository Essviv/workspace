package com.cmcc.sunyiwei.core;

public class TestGenericMath implements TestGenericInterface<Double> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGenericMath testGenericMath=new TestGenericMath();
		System.out.println(testGenericMath.add(100d, 200d));
	}

	public Double add(Double a, Double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public Double minus(Double a, Double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public Double multiply(Double a, Double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public Double divide(Double a, Double b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return a / b;
	}

}
