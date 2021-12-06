package com.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("abcFOS.txt");
		String string="Adil Khan FOS";
		byte data[]=string.getBytes();
		
		fos.write(data);
		fos.flush();
		fos.close();

	}
}
/*
 * Java FileOutputStream is an output stream used for writing data to a file.
 * 
 * 
 */