package com.cmcc.sunyiwei.concurrent;

import java.util.Map;
import java.util.Properties;

public class TestSystemEnv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> envMap=System.getenv();
		for(String key: envMap.keySet())
		{
			System.out.format("%-30s: %s%n", key, envMap.get(key));
		}
		
		System.out.println("============================");
		
		Properties properties=System.getProperties();
		properties.list(System.out);
	}

}
