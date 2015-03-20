package com.cmcc.sunyiwei.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestObjectIO implements Serializable {

	public String[] szConentStrings=
		{
			"sunyiwei","patrick", "Lisa", "FengLiSha"
		};
	
	@Override
	public String toString()
	{
		StringBuilder szContentBuilder=new StringBuilder();
		for(String szContent: szConentStrings)
		{
			szContentBuilder.append(szContent);
			szContentBuilder.append("\n");
		}
		
		return szContentBuilder.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szFilename="C:\\Users\\Patrick\\Desktop\\test";
		testBinaryWrite(szFilename);
		testBinaryRead(szFilename);
		
//		Serializable
	}

	public static void testBinaryWrite(String szFilename)
	{
		if(szFilename.isEmpty())
			return;
		
//		final Calendar date=new GregorianCalendar();
		TestObjectIO objectIO=new TestObjectIO();
		ObjectOutputStream outputStream=null;
		try {
			outputStream=
					new ObjectOutputStream(
							new BufferedOutputStream(
									new FileOutputStream(szFilename)));
			
			outputStream.writeObject(objectIO);
			System.out.println("Write completed!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
				try {
					if(outputStream!=null)
						outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public static void testBinaryRead(String szFilename)
	{
		if(szFilename.isEmpty())
			return;
		
		ObjectInputStream inputStream=null;
		try {
			inputStream=new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(szFilename)));
			
			System.out.println(inputStream.readObject());
//			System.out.println(inputStream.readUTF());
//			System.out.println(inputStream.readDouble());
			System.out.println("Read completed!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(inputStream!=null)
					inputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
