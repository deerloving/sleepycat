package com.king.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static boolean createFile(String path) {
		//如果文件路径为空返回false
		if(path == null || "".equals(path)){
			return false;
		}else{
			File file = new File(path);
			if(!file.exists() && path.indexOf(".") > -1) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(!file.exists() && path.indexOf(".") == -1){
				file.mkdir();
			}
		}
		return true;
	}
	
	/**
	 * 写入文件内容，覆盖文件已有内容
	 * @param fileName
	 * @param content
	 * @return
	 */
	public static boolean wirteFile(String fileName,String content){
		boolean flag = false;
		try {
			FileOutputStream out = new FileOutputStream(fileName);
			out.write(content.getBytes("UTF-8"));
			out.flush();
			out.close();
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 按行读取文件txt格式的
	 * @param fileName
	 */
	public static void readFileByLine(String fileName){
		File file = new File(fileName);
		BufferedReader reader = null;
		System.out.println("以行为单位读取文件，一次读取一行");
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String lineStr = null;
			while((lineStr = reader.readLine()) != null){
				System.out.println(lineStr);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param fileName
	 */
	public static void readFileByBytes(String fileName){
		File file = new File(fileName);
		InputStream in = null;
		
		System.out.println("以字节为单位读取文件，一次读取一个字节");
		try {
			in = new FileInputStream(file);
			int tempbyte; 
			while((tempbyte = in.read()) != -1){
				System.out.write(tempbyte);  
			}
			 in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	public static void main(String[] args) {
//		FileTest.createFile("D:/baby/");
		FileTest.readFileByLine("C:\\Users\\OneKing\\Pictures\\Camera Roll\\想骂人.png");
	}
}
