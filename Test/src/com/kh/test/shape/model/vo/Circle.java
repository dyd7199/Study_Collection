package com.kh.test.shape.model.vo;

public class Circle {
	public double PI = Math.PI;
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("������"+radius+"cm�� ���� �׸��ϴ�.");
	}
	
	
	//getter setter
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
}
