package com.king;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import com.king.factory.INoodles;
import com.king.factory.SimpleNoodlesFactory;

public class Test {
	
	
	
	public static void main(String[] args) throws HeadlessException, UnsupportedEncodingException, ParseException {
		
//		collectionTest();
		
//		missBaby();
		
//		stringTest();
		
		System.out.println(System.currentTimeMillis());
		
//		INoodles noodle = SimpleNoodlesFactory.createNoodles(1);
//		
//		noodle.desc();
		
//		mapTest();
		
//		BasetypeTest.byteTest((byte)129);
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("第一名", "边境牧羊犬");
		map.put("第二名", "贵宾犬");
		map.put("第三名", "德国牧羊犬");
		map.put("第四名", "金毛寻回犬");
		map.put("第五名", "喜乐蒂牧羊犬");
		map.put("第六名", "拉布拉多寻回犬");
		map.put("第七名", "蝴蝶犬");
		map.put("第八名", "罗纳威犬");
		map.put("第九名", "澳大利亚牧羊犬");
		map.put("第十名", "彭布罗克威尔柯基犬");
		mapView(map);
		
	}
	
	/**
	 * map测试
	 * 1.hashmap是非线程安全的，hashtable是线程安全的，所以hashmap效率快
	 * 2.hashmap的key和value都允许为空，而hashtable不允许为空，为空会报错
	 */
	public static void mapTest(){
		HashMap map = new HashMap();
		map.put(null, null);
		System.out.println(map.get(null));
		
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer> ();
		table.put(123, 123);
		System.out.println(table.get(123));
	}
	
	/**
	 * 遍历map
	 * @param map
	 */
	public static void mapView(Map<String,Object> map){
		/*
		 * 第一种方式：entryset
		 */
		for(Map.Entry<String, Object> entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		/*
		 * 第二种方式：使用keyset
		 */
//		for (String key : map.keySet()) {
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
		
		/*
		 * 第三种方式：使用iterator
		 */
//		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, Object> entry = iterator.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
	}
	
	/**
	 * 集合类测试
	 */
	public static void collectionTest(){
		Collection list = new ArrayList<String>();//创建一个list对象
		//向list中新增内容
		list.add("涛涛");
		list.add("喜欢");
		list.add("花花");
		//获取到list对象的迭代器
		Iterator it = list.iterator();
		//使用迭代器循环输出list中的内容
		while(it.hasNext()){
			Object obj = it.next();
			if(obj instanceof String){
				System.out.println(obj);
			}
		}
	}
	
	/**
	 * String测试
	 */
	public static void stringTest(){
		String s;//String类型的引用，没有初始化对象
	    String str = new String("hello");

	    String after_str = "hello";

	    System.out.println(str + after_str);
	}
	
	/**
	 * 想宝宝的时间，因为我惹宝宝生气了。
	 * @throws ParseException 
	 */
	public static void missBaby() throws ParseException{
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//日期格式，精确到秒
		
		double lastTime = (double)sd.parse("2018-06-02 22:41:00").getTime();//上次跟宝宝语音的时间
		
		double nowTime = (double)sd.parse(sd.format(new Date())).getTime();//现在的时间
		
		System.out.println("上次跟宝宝语音的时间：2018-06-02 22:41:00");
		
		System.out.println("现在的时间：" + sd.format(new Date()));
		
		System.out.println("我已经有：" + (nowTime - lastTime) / 1000 / 60 / 60 / 24  + "天没有跟宝宝语音了，我好想宝宝");//间隔:单位秒
		
		System.out.println("我已经有：" + (nowTime - lastTime) / 1000 + "秒没有跟宝宝语音了，好想宝宝");//间隔:单位秒
		
		System.out.println("我已经有：" + (nowTime - lastTime) / 1000 + "秒没有跟宝宝语音了，好想宝宝");//间隔:单位秒
		
		System.out.println("我已经有：" + (nowTime - lastTime) / 1000 + "秒没有跟宝宝语音了，好想宝宝");//间隔:单位秒
		
		System.out.println(System.currentTimeMillis());
		
	}
}
