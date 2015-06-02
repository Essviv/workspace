package com.cmcc.sunywei.util;

import java.util.regex.Pattern;

public class Tools {
	/**
	 * 判断字符串是否全数字
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){ 
		if(str==null || "".equals(str))
			return false;
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    return pattern.matcher(str).matches();    
	 } 
}
