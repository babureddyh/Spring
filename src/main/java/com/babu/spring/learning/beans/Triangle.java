package com.babu.spring.learning.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements ApplicationContextAware, BeanNameAware{
	Point pointA, pointB, pointC;

	public Point getPointA() {
		return pointA;
	}
	
	@Resource
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@Resource
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	@Resource
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw (){
		System.out.println("draw");
	}

//	@Resource
	public void setBeanName(String arg0) {
		System.out.println("Current Bean name ");
		System.out.println(arg0);
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Applicaiton context hashcode "+ arg0.hashCode());
	}
	
	@PostConstruct
	public void init() {
		System.out.println(" Triangle init method, After bean is initialized is called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Triangle before destroying object triangle");
	}
}
