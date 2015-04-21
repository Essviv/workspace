package com.cmcc.sunyiwei.springframework;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet arg0, int arg1) throws SQLException {
		Student student = new Student();
		student.setId(arg0.getInt("id"));
		student.setAge(arg0.getInt("age"));
		student.setName(arg0.getString("name"));
		
		return student;
	}

}
