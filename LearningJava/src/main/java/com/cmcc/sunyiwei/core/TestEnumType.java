package com.cmcc.sunyiwei.core;


public class TestEnumType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(Weekday day: Weekday.values())
//		{
//			System.out.println(day.toString());
//		}
		System.out.println("Deleted value:" + DELETE_FLAG.DELETED.ordinal());
		System.out.println("UnDeleted value:" + DELETE_FLAG.UNDELETED.ordinal());
	}
	
	public enum DELETE_FLAG{
		DELETED,
		UNDELETED
		
	}
	
	public enum Weekday{
		Monday("sunyiwei"),
		Tuesday("Lisa"),
		Wednesday("Patrick"),
		Thursday("Feng"),
		Friday("Mao"),
		Saturday("GoodChild"),
		Sunday("Google");
		
		private String szName="";
		
		Weekday(String szName)
		{
			this.szName=szName;
		}
		
		@Override
		public String toString()
		{
			return super.toString();
//			Runnable r = () -> System.out.println("hello world");
//			return szName+":"+ super.toString();
		}
	}

}
