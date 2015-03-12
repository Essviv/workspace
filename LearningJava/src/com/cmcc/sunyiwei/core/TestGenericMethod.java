package com.cmcc.sunyiwei.core;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

public class TestGenericMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGenericMethod.say("Hello", "World");
		TestGenericMethod.say(2.3, 1.7);
		TestGenericMethod method=new TestGenericMethod();
		method.<String, String>sayHello("Hello", "World");
		
		Serializable test=pick("Hello", new ArrayList<String>());
	}

	public static <T> T pick(T a, T b){return b;}
	
	public static <T, V> void say(T first, V second) {
		System.out.println(first.toString() + " " + second.toString());
	}
	
	public <T, V> void sayHello(T first, V second)
	{
		System.out.println(first.toString() + " " + second.toString());
	}
}
