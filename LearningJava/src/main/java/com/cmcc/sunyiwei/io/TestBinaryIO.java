package com.cmcc.sunyiwei.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinaryIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szFilename="C:\\Users\\Patrick\\Desktop\\test";
		testBinaryWrite(szFilename);
		testBinaryRead(szFilename);
	}
	
	public static void testBinaryWrite(String szFilename)
	{
		if(szFilename.isEmpty())
			return;
		
		final int COUNT=20;
		final String NAME = "sunyiwei";
		final double VALUE=3.1415926;
		
		DataOutputStream outputStream=null;
		try {
			outputStream=
					new DataOutputStream(
							new BufferedOutputStream(
									new FileOutputStream(szFilename)));
			
			outputStream.writeInt(COUNT);
			outputStream.writeUTF(NAME);
			outputStream.writeDouble(VALUE);	
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
		
		DataInputStream inputStream=null;
		try {
			inputStream=new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(szFilename)));
			
			System.out.println(inputStream.readInt());
			System.out.println(inputStream.readUTF());
			System.out.println(inputStream.readDouble());
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
