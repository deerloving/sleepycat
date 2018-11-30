package com.king.singleton;
/**
 * 单例模式：饿汉 在类初始化时，已经自行实例化
 * @author OneKing
 *
 */
public class Singleton_hunger {

	/**
	 * 私有的默认构造方法
	 */
	private Singleton_hunger(){}
	
	//实例化
	private static final Singleton_hunger single = new Singleton_hunger();
	
	/**
	 * 静态工厂方法
	 * @return
	 */
	public static Singleton_hunger getInstance(){
		return single;
	}
	
}
