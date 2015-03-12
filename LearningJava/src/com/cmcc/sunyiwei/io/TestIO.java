package com.cmcc.sunyiwei.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class TestIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szInputString="C:\\Users\\Patrick\\Desktop\\helloWorld.txt";
		String szOutputString="C:\\Users\\Patrick\\Desktop\\helloWorld_copy.txt";
		
		try {
			TestIO.copyFile(szInputString, szOutputString);
			System.out.println("OK!");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static boolean copyFile(String szFileSrc, String szFileDst)
			throws IOException
	{
		if(szFileDst.isEmpty() || szFileSrc.isEmpty())
			return false;
		
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
//		OutputStream
		try {
			inputStream=new FileInputStream(szFileSrc);
			outputStream=new FileOutputStream(szFileDst);
			
			int nChar=-1;
			while((nChar=inputStream.read())!=-1)
				outputStream.write(nChar);
			
			return true;
		} finally
		{
			if(inputStream!=null)
				inputStream.close();
			
			if(outputStream!=null)
				outputStream.close();
		}
		
//		return false;
	}

}
