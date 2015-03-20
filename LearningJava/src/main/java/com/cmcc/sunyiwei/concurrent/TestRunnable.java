package com.cmcc.sunyiwei.concurrent;

public class TestRunnable implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new TestRunnable())).start();
	}

	public void run() {
		// TODO Auto-generated method stub
		int nCount=4;
		for(int i=0;i<nCount;i++)
		{
			System.out.println("I implement runnable interface.");
			try {
				Thread.sleep(4000);
//				if(i==nCount-1)
//					Thread.in
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.err.println("Someone wakes me up!");
			}
			System.out.println("Aha, I sleep 4 seconds");
		}
	}

}
