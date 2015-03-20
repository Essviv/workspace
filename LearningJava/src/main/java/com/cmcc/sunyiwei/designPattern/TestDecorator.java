package com.cmcc.sunyiwei.designPattern;

public class TestDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass superClass=new FirstDecorator(
				new SecondDecorator("YES"));
		superClass.say();
	}
}

abstract class SuperClass
{
	abstract void say();
}

class FirstDecorator extends SuperClass
{
	private SuperClass m_parent=null;
	
	public FirstDecorator(SuperClass parent)
	{
		m_parent=parent;
	}
	
	@Override
	public void say()
	{
		if(m_parent!=null)
			m_parent.say();
		System.out.println("I'm first decorator, i say GOOD!");
	}
}

class SecondDecorator extends SuperClass
{
	private SuperClass m_parent=null;
	private String m_szContentString;
	
	public SecondDecorator(SuperClass parent)
	{
		m_parent=parent;
	}
	
	public SecondDecorator(String szContent)
	{
		m_szContentString=szContent;
	}
	
	@Override
	void say() {
		// TODO Auto-generated method stub
		if(m_parent!=null)
			m_parent.say();
		
		if(!m_szContentString.isEmpty())
			System.out.format("I'm second decorator, I say %s.%n", 
					m_szContentString);
	}	
}


