package com.babu.spring.learning.aop.service;

import com.babu.spring.learning.aop.model.Circle;
import com.babu.spring.learning.aop.model.Triangle;

public class ShapeService {
	private Triangle triangle;
	private Circle circle;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
