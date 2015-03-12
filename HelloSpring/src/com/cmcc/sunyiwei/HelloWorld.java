package com.cmcc.sunyiwei;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorld{
	private String message;
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
//		System.out.println(message);
		return message;
	}
	
	public void init()
	{
		System.out.println("Initialization");
	}
	
	public void destroy()
	{
		System.out.println("Destroy");
	}

	
}
