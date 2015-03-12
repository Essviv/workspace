package com.cmcc.sunyiwei.exception;

import java.util.ArrayList;
import java.util.List;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listData=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			listData.add(new Integer(i));
		
		TestException.printList(listData);
	}
	
	public static void printList(List<Integer> listData)
	{
		int nLength=listData.size();
		for(int i=0;i<nLength;i++)
			System.out.println(listData.get(i));
		
		//this would throw an IndexOutOfBoundException
//		throw new IndexOutOfBoundsException();
//		try {
//			System.out.println(listData.get(nLength));
//		} catch (Exception e) {
//			// TODO: handle exception
////			System.err.println("Out of index bound!");
//			
//		}
		
//		for(Integer data: listData)
//			System.out.println(data.intValue());
	}
	
	public <T extends Number> double test(T a, T b)
	{		
		try {
			if (b.doubleValue() == 0)
				throw new Exception();
			return a.doubleValue()/b.doubleValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Double.NaN;
	}
	
	public <T extends Integer> int remainder(T a, T b) throws Exception
	{
		if(Math.abs(b.intValue())==0)
			throw new Exception();
		
		return a.intValue()%b.intValue();
	}

}
