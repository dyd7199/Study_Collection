package com.kh.test.shape.model.vo;

public class RectAngle {
	private int width;
	private int height;
	
	public RectAngle() {
		// TODO Auto-generated constructor stub
	}
	public RectAngle(int width,int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public void draw() {
		System.out.println("����: "+width+"cm, ����: "+height+"cm�� �簢���� �׸��ϴ�. ");
	}
	
	
	//getter setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
