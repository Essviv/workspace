package com.cmcc.sunyiwei;

public class TestBean {
	private String message;
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message=message;
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
