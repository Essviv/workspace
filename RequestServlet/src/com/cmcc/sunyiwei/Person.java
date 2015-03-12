package com.cmcc.sunyiwei;

public class Person {
	private String name;
	private int m_nAge;
	private String sex;
	private boolean secret;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int nAge)
	{
		this.m_nAge=nAge;
	}
	
	public int getAge()
	{
		return m_nAge;
	}
	
	public void setSex(String szSex)
	{
		sex=szSex;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	public void setSecret(boolean bFlag)
	{
		secret=bFlag;
	}
	
	public boolean isSecret()
	{
		return secret;
	}
}
