package com.afteraop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect{

	@After("args(String)")
	public void getArgumentsMethods(){
		System.out.println("@After(args(String)) method is called.");
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void getArgsAfterReturning(String  name, String returnString){
		System.out.println("@AfterReturning(args(String)) method is called input value: " + name + " , output : " + returnString);
	}
	
	
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, RuntimeException ex){
		System.out.println("@AfterThrowing(args(String)) method is called : " + name + " , ex : " + ex);
	}
	
}