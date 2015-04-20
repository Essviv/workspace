package com.cmcc.sunyiwei.springframework;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDAOImpl implements SpringDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into student(name, age) values(?, ?)";
		jdbcTemplate.update(sql, name, age);
		System.out.println("Create record name= " + name + ", age = " + age);
	}

	@Override
	public void update(Integer id, Integer age) {
		String sql = "update student set age = ? where id = ?";
		jdbcTemplate.update(sql, age, id);
		System.out.println("Update record id= " + id + ", age = " + age);
	}

	@Override
	public Student get(Integer id) {
		String sql = "select * from student where id = ?";
		Student student = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new StudentMapper());
		System.out.println("Select record id= " + id);
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from student";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());

		for (Student student : students) {
			System.out.println("Id = " + student.getId() + " name: "
					+ student.getName() + " age: " + student.getAge());
		}
		return students;
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from student where id = ?";
		jdbcTemplate.update(sql, id);
		System.out.println("Delete record id= " + id);
	}

}
