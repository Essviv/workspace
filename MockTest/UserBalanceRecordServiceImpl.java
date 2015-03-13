package com.cmcc.vrp.anhui.web.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cmcc.vrp.anhui.dao.UserBalanceRecordMapper;
import com.cmcc.vrp.anhui.model.UserBalance;
import com.cmcc.vrp.anhui.model.UserBalanceRecord;
import com.cmcc.vrp.anhui.model.UserBalanceSource;
import com.cmcc.vrp.anhui.web.service.UserBalanceRecordService;
import com.cmcc.vrp.anhui.web.service.UserBalanceService;
import com.cmcc.vrp.anhui.web.service.UserBalanceSourceService;

/**
 * @ClassName: UserBalanceRecordServiceImpl
 * @Description: 移动用户流量账户变更记录实现类
 * @author: qihang
 * @date: 2015年3月11日 下午19:21:00
 * 
 */
@Service("userBalanceRecordService")
public class UserBalanceRecordServiceImpl implements UserBalanceRecordService {
	@Autowired
	private UserBalanceRecordMapper userBalanceRecordMapper;
	
	@Autowired
	private UserBalanceService userBalanceService; 
	
	@Autowired
	private UserBalanceSourceService userBalanceSourceService; 

	/**
	 * @Title: insertNewUserBalanceRecord
	 * @Description: 插入新的用户流量账户变更和记录
	 * @param record
	 * @return int 失败返回0，成功返回非0
	 */
	@Override
	public int insertNewUserBalanceRecord(UserBalanceRecord record) {
		if(record==null || record.getSourceId()==null || record.getUserId()==null || 
				record.getAmount()==null){
			return 0;
		}
		
		if(record.getOperationType()!=0L && record.getOperationType()!=1L){//operrationType只能为0或1
			return 0;	
		}
		
		record.setCreateTime(new Date());
		record.setDeleteFlag(0);
		return userBalanceRecordMapper.insertSelective(record);
	}

	
	
	/**
	 * @Title: queryUserBalanceRecordByUserId
	 * @Description: 通过userid找到所有记录
	 * @param source
	 * @return List<UserBalanceRecord>
	 */
	@Override
	public List<UserBalanceRecord> queryUserBalanceRecordByUserId(long userid) {
		return userBalanceRecordMapper.selectAllRecordByUserid(userid);
		
	}


	/**
	 * @Title: balanceChange
	 * @Description: 更新用户流量账户变更和记录,事务处理1.插入变更记录表,2.修改账户表
	 * @param userid 用户id
	 * @param operationType 操作类型 0：收入 1支出
	 * @param amount 金额变化
	 * @param sourceId 来源类型，在user_balance_source表中
	 * @param source
	 * @return int 0 失败 1成功
	 */
	@Transactional (propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public int balanceChange(long userid, int operationType, long amount,long sourceId) {
		UserBalance userBalance=userBalanceService.queryUserBalanceByUserId(userid);//得到用户账户
		UserBalanceSource source=userBalanceSourceService.querySourceBySourceId(sourceId);//得到账户变化类型
		
		if(userBalance==null || source==null || amount<=0){
			return 0;
		}
		
		if(operationType!=0 && operationType!=1){
			return 0;
		}
		
		//1.建立账户变更信息，添加到变更记录表
		UserBalanceRecord newRecord=new UserBalanceRecord();
		newRecord.setUserId(userid);
		newRecord.setOperationType(operationType);
		newRecord.setSourceId(sourceId);
		newRecord.setAmount(amount);
		if(insertNewUserBalanceRecord(newRecord)<=0){//插入操作失败
			return 0;
		}
		
		//2.账户的存量变更，更改UserBalance
		if(userBalanceService.updateUserBalanceAmount(userid, operationType, amount)<=0){
			throw new RuntimeException();
		}
		
		//都操作成功返回1
		return 1;
	}

	

	

}
