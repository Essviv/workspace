package com.cmcc.sunyiwei.regularMatch;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;
import java.io.Reader;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularMatch {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String szFilename="C:\\Users\\Patrick\\Desktop\\test.txt";
		
		//Console console=System.console();
		BufferedReader reader=new BufferedReader(new InputStreamReader(
				new FileInputStream(szFilename)));
		
		while(true)
		{
			try {
				//Scanner scanner=new Scanner(System.in);
				
				//System.out.print("Input the regular match: ");
				Pattern pattern=
						Pattern.compile(reader.readLine());
				
				//System.out.print("Input the string to search: ");
				Matcher matcher=
						pattern.matcher(reader.readLine());
				
				boolean bFind=false;
				while (matcher.find()) {
					System.out.format("We find the text \"%s\" starting" +
							"at %d and ending at %d.%n", 
							matcher.group(), matcher.start(), matcher.end());
					bFind=true;
				}
				
				if(!bFind)
					System.err.println("We find nothing!");
			} catch (Exception e) {
				// TODO: handle exception
				return;
			}
			
			
//			System.exit(0);
		}
	}

}
