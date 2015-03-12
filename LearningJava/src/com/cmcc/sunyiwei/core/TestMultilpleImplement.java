package com.cmcc.sunyiwei.core;

import javax.swing.DefaultBoundedRangeModel;

public class TestMultilpleImplement extends ParentClass //implements ISub
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultilpleImplement testMultilpleImplement=new TestMultilpleImplement();
		testMultilpleImplement.say();
//		testMultilpleImplement.su
		System.out.println(testMultilpleImplement instanceof ISub);
	}
	
	@Override
	public void say()
	{
//		IA.super.say();
	}	
	
//	@Override
//	public Object clone()
//	{
//		
//	}
//	@Override
//	public String toString()
//	{
//		
//	}
}

class ParentClass implements ISub
{
	public void say()
	{
		
	}
}

interface IA
{
	void say();
}

interface IB
{
	void say();
}

interface ISub extends IA, IB
{
	
}
