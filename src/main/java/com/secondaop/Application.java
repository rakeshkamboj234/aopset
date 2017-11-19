package com.secondaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.secondaop.service.ShapeService;

class Application{
	
	public static void main(String args[]) throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_second.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setNamedReturn("Rakesh");
		//shapeService.getCircle().setName("Rakesh");
		//System.out.println(shapeService.getCircle().getName());
	}
}