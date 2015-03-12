package com.cmcc.sunyiwei.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestTryWithResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static final int SIZE = 10;
	private List<Integer> m_data = null;

	public TestTryWithResources() {
		m_data = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++)
			m_data.add(new Integer(i));
	}

	public boolean writeList(String szFilename)
	{
		return true;
	}
}
