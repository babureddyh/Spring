package com.babu.spring.learning.beans;

public class Point {
	private int x, y;
	
	public void setX (int x) {
		this.x=x;
	}
	
	public void setY (int y) {
		this.y =y;
	}
	
	public void print() {
		System.out.println("X= "+this.x+" "+this.y);
	}
}
