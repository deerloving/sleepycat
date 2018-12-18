package com.king.abstractclass;
/**
 * 抽象类
 * @author OneKing
 *
 */
public abstract class Shape {
	// 初始化块
	{
		System.out.println("执行Shape的初始化块...");
	}

	// 成员变量
	private String color;

	// 定义一个计算周长的抽象方法
	public abstract double calPerimeter();

	// 定义一个返回形状的抽象方法
	public abstract String getType();

	// 普通方法
	public void test() {
		System.out.println("普通方法");
	}

	// 定义Shape的构造器，该构造器并不是用于创建Shape对象，而是用于被子类调用
	public Shape() {
		System.out.println("无参数构造器。。。");
	}

	public Shape(String color) {
		System.out.println("执行Shape的构造器...");
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
}