package com.cmcc.sunyiwei.exception;

import java.io.Console;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console=null;
		if((console=System.console())==null)
		{
			System.err.println("没有合适的终端!");
			return;
		}
		
//		DataOutputStream
		String szNameString=console.readLine("Input your userName:");
		char[] szPwd=console.readPassword();
		
		if(true)
		{
			boolean isMatch=false;
			while (!isMatch) {
				char[] szNewPwdFirst=
						console.readPassword("Input your new passwd:");
				char[] szNewPwdSecond=
						console.readPassword("Input your new passwd again:");
				isMatch=Arrays.equals(szNewPwdFirst, szNewPwdSecond);
				
				if(!isMatch)
				{
					console.format("Pwd is not matched! Try again！%n");
				}
				else {
					//do something
					//info user
					console.format("Pwd for %s is changed.%n", szNameString);
				}
			}
		}
	}

}
