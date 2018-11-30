package com.king;
/**
 * 测试静态变量
 * @author OneKing
 *
 */
public class StaticTest {

	/**
	 * 类变量name，是公共的，只有一个
	 */
	private static String name = null;
	
	
	public static void changeName(int n){
		if(n >10){
			name = "zhangsan";
		}
	}
	
	
	public static void main(String[] args) {
		new StaticTest().changeName(11);//第一次赋值为：张三
		System.out.println(name);
		new StaticTest().changeName(1);//第二次条件不满足，但是还是张三
		System.out.println(name);
	}
}
