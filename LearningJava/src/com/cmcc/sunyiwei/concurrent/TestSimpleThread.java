package com.cmcc.sunyiwei.concurrent;

public class TestSimpleThread implements Runnable{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final int PATIENCE=2000;
		
		printMessage("Staring messageLoop thread");
		Thread subThread=new Thread(new TestSimpleThread());
		subThread.start();
		long startTime=System.currentTimeMillis();
		
		printMessage("Waiting for messageLoop thread to finish");
		while(subThread.isAlive())
		{
			printMessage("Still waiting...");
			subThread.join(1000);
			if((System.currentTimeMillis()-startTime)>PATIENCE
					&& (subThread.isAlive()))
			{
				printMessage("I'm tired of waiting!");
				subThread.interrupt();
				subThread.join();
			}
		}
		
		printMessage("Finally...");
	}
	
	static void printMessage(String szMessage)
	{
		Thread currentThread=Thread.currentThread();
		System.out.format("%s: %s.%n", 
				currentThread.getName(), szMessage);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true)
			{
				Thread.sleep(100);
				printMessage("I say Yes!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
