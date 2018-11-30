package com.king.singleton;
/**
 * 单例模式：懒汉式单例类.在第一次调用的时候实例化 
 * @author OneKing
 *
 */
public class Singleton_lazy {

	/**
	 * 私有构造方法
	 */
	private Singleton_lazy(){}
	
	//默认是null，且没有final修饰符
	private static Singleton_lazy single = null;
	
	/**
	 * 静态工厂方法
	 * @return
	 */
	public synchronized static Singleton_lazy getInstance(){
		if(single == null){
			single = new Singleton_lazy();
		}
		return single;
	}
	
}
