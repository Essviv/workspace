/**
 * @Title: 	SequenceGenerator.java 
 * @Package com.cmcc.sunywiei.pojo 
 * @author:	sunyiwei
 * @date:	2015年6月2日 上午8:09:38 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.pojo;

import java.util.List;

/** 
 * @ClassName:	SequenceGenerator 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年6月2日 上午8:09:38 
 *  
 */
public class SequenceGenerator {
	private String prefix;
	private List<String> suffix;
	private int initial;
	private int counter;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public List<String> getSuffix() {
		return suffix;
	}
	public void setSuffix(List<String> suffix) {
		this.suffix = suffix;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public String getSequence(){
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(prefix);
		sBuilder.append(getCounter());
		
		for (String s : suffix) {
			sBuilder.append("-" + s);
		}
		
		
		return sBuilder.toString();
	}
	
	public synchronized int getCounter() {
		return initial + counter++;
	}
}
