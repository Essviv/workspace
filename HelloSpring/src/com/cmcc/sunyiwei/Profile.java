package com.cmcc.sunyiwei;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("sunyiwei")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void printName()
	{
		System.out.println(student.getName());
	}
	
	public void printAge()
	{
		System.out.println(student.getAge());
	}
	
	@PostConstruct
	public void testInit()
	{
		System.out.println("Im initializing...");
	}
	
	@PreDestroy
	public void testDestroy()
	{
		System.out.println("Im desconstructing...");
	}
}
