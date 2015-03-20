package com.cmcc.sunyiwei.concurrent;

public class TestThread extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new TestThread()).start();
	}

	@Override
	public void run()
	{
		System.out.println("i'm a subClass of thread.");
	}
}
