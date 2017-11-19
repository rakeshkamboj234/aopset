package com.aroundaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aroundaop.service.ShapeService;

class Application{
	
	public static void main(String args[]){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_aroundaop.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//shapeService.getCircle().setName("circle");
		System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getTraingle().getName());
	}
}