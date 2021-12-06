package com.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("abcFOS.txt");
		int i=0;
		  while((i=fis.read())!=-1){    
	             System.out.print((char)i);    
	            }    

	}
}
