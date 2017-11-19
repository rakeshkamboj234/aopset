package com.firstaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect{
	
	//@Before("execution(public String com.firstaop.model.Circle.getName())")
	//@Before("execution(public * getName())")
	//@Before("execution( public String getName())")//.. any match, * for one or more arguments
	@Before("allCircleMethods() && allGetters()")	
	//@Before("allCircleMethods()")	
	public void LoggingAdvice(JoinPoint joinPoint){
		//System.out.println("Advice run. get method called");
		System.out.println("joinPoint : " + joinPoint.getTarget());
	}
	
	@Before("allGetters())")
	public void SecondAdvice(){
		System.out.println("Second advice executed.");
	}
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Pointcut("within(com.firstaop.model.Circle)")
	public void allCircleMethods(){
		System.out.println("Only Circle, Third advice executed by within"); 
	}
	@Before("args(String)")
	public void getArgumentsMethods(){
		System.out.println("Argument method is called.");
	}
}