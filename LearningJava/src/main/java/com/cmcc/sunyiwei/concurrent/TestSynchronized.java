package com.cmcc.sunyiwei.concurrent;

public class TestSynchronized implements Runnable {

	TestClass testData = null;// new TestClass();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nCount = 1000;
		while (nCount-- > 0) {
			// TODO Auto-generated method stub
			TestClass testData = new TestClass();
			Thread thread1 = new Thread(new TestSynchronized(testData));
			Thread thread2 = new Thread(new TestDecreaseClass(testData));

			thread1.start();
			thread2.start();
			// try {
			// thread1.start();
			// thread2.start();
			// thread1.join();
			// thread2.join();
			//
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

			// if (testData.getValue() != 100)
			System.out.println("Final: " + testData);
		}
	}

	public TestSynchronized(TestClass testClass) {
		this.testData = testClass;
	}

	public void run() {
		// TODO Auto-generated method stub
		int nCount = 100;

		for (int i = 0; i < nCount; i++) {
			testData.increase();
			// System.out.println(Thread.currentThread().getName() + ":" +
			// testData);
		}
	}
}

class TestDecreaseClass extends TestSynchronized {
	public TestDecreaseClass(TestClass testData) {
		super(testData);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int nCount = 100;

		for (int i = 0; i < nCount; i++) {
			testData.decrease();
			// System.out.println(Thread.currentThread().getName() + ":"
			// + testData);
		}
	}
}

class TestClass {
	private int nCount = 0;

	public int getValue() {
		return nCount;
	}

	public synchronized void increase() {
		nCount++;
	}

	public synchronized void decrease() {
		nCount--;
	}

	@Override
	public String toString() {
		return String.valueOf(nCount);
	}
}
