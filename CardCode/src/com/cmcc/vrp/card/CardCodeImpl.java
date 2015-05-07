/**
 * @Title: 	CardCodeImpl.java 
 * @Package com.cmcc.vrp.card 
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午9:30:27 
 * @version	V1.0   
 */
package com.cmcc.vrp.card;

/** 
 * @ClassName:	CardCodeImpl 
 * @Description:  卡密系统实现类
 * @author:	sunyiwei
 * @date:	2015年5月4日 上午9:30:27 
 *  
 */
public class CardCodeImpl implements ICardCode{

	@Override
	public String appendVerifyCode(String originalSerialNum, String randomSeed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkVerifyCode(String encodedSerialNum, String randomSeed) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @Title: getSerialNum 
	 * @Description: 生成流量卡的序列号
	 * @param code
	 * @param randSeed
	 * @return 
	 * @see com.cmcc.vrp.card.ICardCode#getSerialNum(com.cmcc.vrp.card.ICardCode.PROVINCE_CODE, int)
	 */
	@Override
	public String getSerialNum(PROVINCE_CODE code, int randSeed) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
