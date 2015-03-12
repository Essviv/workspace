package com.cmcc.sunyiwei.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static final int SIZE = 10;
	private List<Integer> m_data = new ArrayList<Integer>(SIZE);

	public ListOfNumbers() {
		for (int i = 0; i < SIZE; i++)
			m_data.add(new Integer(i));
	}

	public Boolean writeList(String szFilename) {
		PrintWriter pWriter = null;

		try {
			pWriter = new PrintWriter(new FileWriter(szFilename));
			// for(Integer data: m_data)
			// pWriter.println(data.intValue());
			for (int i = 0; i < SIZE; i++)
				pWriter.println(m_data.get(i));
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}finally
		{
			if(pWriter!=null)
				pWriter.close();
		}

		return true;
	}
}
