/**
 * @Title: 	RollDice.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年3月23日 上午9:35:11 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

/**
 * @ClassName: RollDice
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年3月23日 上午9:35:11
 * 
 */
public class RollDice {
	public static int roll() {
		return (int) (Math.random() * 6 + 1);
	}
}
