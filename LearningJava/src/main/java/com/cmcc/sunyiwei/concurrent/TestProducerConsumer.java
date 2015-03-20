package com.cmcc.sunyiwei.concurrent;

public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drop drop = new Drop();
		(new Thread(new Producer(drop))).start();
		(new Thread(new Consumer(drop))).start();
	}

}

class Drop {
	private String m_szMessageString;
	private boolean m_bIsEmpty;

	public synchronized String take() {
		while (m_bIsEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

		// change status
		m_bIsEmpty = true;

		// notify all threads that status has been changed
		notifyAll();

		return m_szMessageString;
	}

	public void put(String szMessage) {
		synchronized (this) {
			while (!m_bIsEmpty) {
				try {
					wait();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			// change status
			m_bIsEmpty = false;

			// change message
			m_szMessageString = szMessage;

			// nofity all threads
			notifyAll();

			// Properties
		}
	}
}

class Producer implements Runnable {
	private Drop m_drop = null;

	public Producer(Drop drop) {
		m_drop = drop;
	}

	private final String[] szContentStrings = { "Mares eat oats",
			"Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too" };

	public void run() {
		for (String szMessage : szContentStrings) {
			int nInterval = (int) Math.ceil(Math.random() * 000);
			m_drop.put(szMessage);

			try {
				Thread.sleep(nInterval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

		m_drop.put("DONE");
	}

}

class Consumer implements Runnable {
	private Drop m_drop = null;

	public Consumer(Drop drop) {
		m_drop = drop;
	}

	public void run() {
		// TODO Auto-generated method stub
		String szMessage;
		while ((szMessage = m_drop.take()) != "DONE") {
			System.out.println(szMessage);
		}

		System.out.println("DONE");
	}
}
