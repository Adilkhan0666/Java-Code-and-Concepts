package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\adilkhan2\\Desktop\\Development\\Spring Boot Development\\Java Code and Concepts","adil");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.getAbsoluteFile());
	//	String pathAbs=file.getAbsolutePath();
		File filee=new File(file,"adill.txt");
		filee.createNewFile();
		System.out.println(filee.exists());	
		//file.delete();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());

		System.out.println(filee.isFile());
		System.out.println(filee.length());
		String s[]=file.list();
		System.out.println(s.length);
		for(String ss:s) {
			System.out.println(ss);
		}
		
	}
	public static void main2(String[] args) {
		//to make directory
		File file = new File("abc");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
	}
	public static void main1(String[] args) throws IOException{
		//to make file
		File file=new File("abc.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		
	}

}
