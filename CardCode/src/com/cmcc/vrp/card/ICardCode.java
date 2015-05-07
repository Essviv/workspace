/**
 * @Title: 	CardCode.java 
 * @Package com.cmcc.vrp 
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午8:39:44 
 * @version	V1.0   
 */
package com.cmcc.vrp.card;

/** 
 * @ClassName:	CardCode 
 * @Description:  卡密码系统序列号生成接口
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午8:39:44 
 *  
 */
public interface ICardCode extends IVerifyCode{
	
	/**
	 * 
	 * @ClassName:	PROVINCE_CODE 
	 * @Description:  省份代码
	 * @author:	sunyiwei
	 * @date:	2015年5月4日 上午8:41:30 
	 *
	 */
	public enum PROVINCE_CODE{
		BEIJING("11"),
		TIANJIN("12"),
		HEBEI("13"),
	    SHANXI("14"),
		NEIMENGGU("15"),
		LIAONING("21"),
		JILIN("22"),
		HEILONGJIANG("23"),
		SHANGHAI("31"),
		JIANGSU("32"),
		ZHEJIANG("33"),
		ANHUI("34"),
		FUJIAN("35"),
		JIANGXI("36"),
		SHANDONG("37"),
		HENAN("41"),
		HUBEI("42"),
		HUNAN("43"),
		GUANGDONG("44"),
		GUANGXI("45"),
		HAINAN("46"),
		CHONGQING("50"),
		SICHUAN("51"),
		GUIZHOU("52"),
		YUNNAN("53"),
		XIZANG("54"),
		SHAANXI("61"), 
		GANSU("62"),
		QINGHAI("63"),
		NINGXIA("64"),
		XINJIANG("65"),
		TAIWAN("71"),
		XIANGGANG("81"),
		AOMEN("82");
		
		private String code;
		private PROVINCE_CODE(String code){
			this.code = code;
		}
	}
	
	/**
	 * 
	* @Title:getSerialNum 
	* @Description: 生成卡密码系统的序列号
	* @param code 省份代码
	* @param randSeed  用户输入的随机种子
	* @param verifyCode 用于生成校验位
	* @return
	* @throws
	* @author:	sunyiwei
	 */
	public String getSerialNum(PROVINCE_CODE code, int randSeed);
}
