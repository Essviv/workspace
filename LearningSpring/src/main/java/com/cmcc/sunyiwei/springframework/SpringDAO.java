package com.cmcc.sunyiwei.springframework;

import java.util.List;

import javax.sql.DataSource;


/**
 * 
 * @author Patrick
 *
 * 学习Spring的JDBC支持
 */
public interface SpringDAO {
	/**
	 * 设置数据源
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * 插入记录
	 * @param name
	 * @param age
	 */
	public void create(String name, Integer age);
	
	/**
	 * 更新记录
	 * @param name
	 * @param age
	 */
	public void update(Integer id, Integer age);
	
	/**
	 * 根据ID获取记录
	 * @param id
	 */
	public Student get(Integer id);
	
	/**
	 * 得到数据库中的所有对象 
	 * @return
	 */
	public List<Student> listStudents();
	
	/**
	 * 删除指定ID的对象
	 * @param id
	 */
	public void delete(Integer id);
}
