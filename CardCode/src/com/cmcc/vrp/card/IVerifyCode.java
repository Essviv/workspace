/**
 * @Title: 	VerifyCode.java 
 * @Package com.cmcc.vrp.card 
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午8:56:11 
 * @version	V1.0   
 */
package com.cmcc.vrp.card;

import javax.sound.sampled.BooleanControl;

/** 
 * @ClassName:	VerifyCode 
 * @Description:  校验码生成接口
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午8:56:11 
 *  
 */
public interface IVerifyCode {
	/**
	 * 
	* @Title:appendVerifyCode 
	* @Description: 根据原始序列号和随机种子，得到相应的校验位，并生成带有校验位的序列号
	* @param originalSerialNum
	* @param randomSeed
	* @return
	* @throws
	* @author:	sunyiwei
	 */
	public String appendVerifyCode(String originalSerialNum, String randomSeed);
	
	/**
	 * 
	* @Title:checkVerifyCode 
	* @Description: 检查校验位是否符合预期
	* @param randomSeed
	* @return 校验通过返回true,否则false
	* @throws
	* @author:	sunyiwei
	 */
	public boolean checkVerifyCode(String encodedSerialNum, String randomSeed);
}
