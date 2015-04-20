package com.cmcc.sunyiwei.springframework;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomAspect {
	/**
	 * define a custom pointcut
	 */
	@Pointcut("execution(* com.cmcc.sunyiwei.springframework.HelloWorld.*(..))") // expression 
	private void customPointcut(){}
	
	@After("customPointcut()")
	public void after(){
		System.out.println("After advises...");
	}
	
	@Before("customPointcut()")
	public void before(){
		System.out.println("Before advises...");
	}
	
	@AfterReturning(pointcut="customPointcut()", returning="retVal")
	public void afterReturning(Object retVal){
		System.out.println("After return " + retVal.toString());
	}
	
	public void afterThrowing(IllegalArgumentException ex){
		System.out.println("After throwing " + ex.toString());
	}
}
