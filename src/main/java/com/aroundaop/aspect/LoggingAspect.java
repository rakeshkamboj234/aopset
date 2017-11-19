package com.aroundaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect{
	
	
	@Around("allGetters()")
	public Object joinPointAdvice(ProceedingJoinPoint pdj){
		Object returnVal = null;
		
		try	{
			System.out.println("Before Advice");
			returnVal = pdj.proceed();
			System.out.println("After advice");
		} catch(Exception ex) {	} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After finally");
		return returnVal;
	}
	@Pointcut("execution(* get*())")
	public void allGetters(){	}
}