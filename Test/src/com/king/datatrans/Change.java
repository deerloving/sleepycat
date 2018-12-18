package com.king.datatrans;

import java.util.Arrays;

/**
 * 值传递和引用传递
 * @author OneKing
 *
 */
public class Change {
	
	public static void main(String[] args) {
		int a = 200;//我是200
		changeInt(a);//调用一下changeInt方法
		System.out.println(a);//嘿嘿，我还是200
		
		int arr[] = {1,2,3,4};//我是一个数组，第一个是1
		changeRef(arr);//调用一下传递方法，将第一个修改为100
		System.out.println(Arrays.toString(arr));//第一个还真的变成100了
	}

	/**
	 * 值传递
	 * @param i
	 */
	private static void changeInt(int i){
		i = 100;
	}
	
	/**
	 * 引用传递，调用时，i和传入的引用都会指向同一个对象，然后修改对象中的值会导致传入的值发生改变
	 * @param i
	 */
	private static void changeRef(int [] i){
		if(i.length > 0)
			i[0] = 100;
	}
}
