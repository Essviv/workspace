package com.cmcc.sunyiwei.core;

import java.text.NumberFormat;

public class TestFormattedOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nValue=12345;
		double dbValue=12345.6789;
		float flValue=12345.6789f;
		
		System.out.format("%d%n", nValue);
		System.out.format("% d%n", nValue);
		System.out.format("%08d%n", nValue);
		System.out.format("%8x%n", nValue);
		System.out.format("%8.3f%n", flValue);
		System.out.format("%012.3f%n", flValue);
		System.out.format("%8.20f%n", flValue);
		System.out.format("%08.3f%n", flValue);
		System.out.format("%+10.3f%n", flValue);
		System.out.format("%010.6e%n", dbValue);
		
		System.out.println(Math.cbrt(8));
		System.out.println(Math.toRadians(90));
		System.out.println(Math.toDegrees(1.57));
		
//		NumberFormat nf=NumberFormat.getInstance();
//		nf.
		System.out.println(Integer.toString(65, 16));
		System.out.println(Integer.valueOf("230", 5));
		System.out.format("%B%n", Double.isNaN(5));
		
		float[] datas={
			1.8f,
			2.3f,
			3.2f,
			7.1f
		};
		System.out.format("%.2f%n",TestFormattedOutput.mySum(datas));
		
//		Character
//		string
//		String szContentString;
		String szContentString=String.format("%018.3f%n", 12345.678);
		System.out.print(szContentString);
		
//		Float.floatValue()
//		Number
//		StringBuffer
	}
	
	public static float mySum(float...datas)
	{
		if(datas==null || datas.length<=0)
			return 0f;
		
		float flSum=0f;
		for(float data: datas)
			flSum+=data;
		
		return flSum;
	}
}
