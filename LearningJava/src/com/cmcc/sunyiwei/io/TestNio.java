package com.cmcc.sunyiwei.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("c:\\home\\sunyiwei\\log.txt");
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(0));
		System.out.println(path.subpath(0, 2));
	}

}
