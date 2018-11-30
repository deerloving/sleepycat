package com.king;
/**
 * java基本数据类型测试
 * java总共有八种基本数据类型：char/byte/short/int/long/float/double/boolean
 * 其中数值类型有：byte、short、int、long
 * 浮点型有：float、double
 * @author OneKing
 *
 */
public class BasetypeTest {
	
	/**
	 * int类型测试
	 */
	public static void intTest(){
		int a;//定义一个变量
//		System.out.println(a);//控制台输出一下这个变量，会提示编译错误，int变量定义后需要初始化
		a = 123;
		System.out.println(a);//初始化后，输出变量程序不会报错。
		a = (int)1.98;
		System.out.println(a);
	}
	
	/**
	 * boolean类型测试
	 * @param flag
	 */
	public static void booleanTest(boolean flag){
//		boolean flag;//定义一个Boolean变量
//		System.out.println(flag);//控制台输出一下这个变量，会提示编译错误，Boolean变量定义后需要初始化
//		flag = false;//初始化为false
		System.out.println(flag);
		if(flag){
			System.out.println("你爱我");
		}else{
			System.out.println("你不爱我");
		}
	}
	
	/**
	 * byte类型测试
	 * 最大值是127，最小值是-128
	 * 如果值超过这个范围，就会出现值溢出的情况，即输入的值小于-127或者大于128就会出现溢出。
	 * @param b
	 */
	public static void byteTest(byte b){
		System.out.println(b);
	}
}
