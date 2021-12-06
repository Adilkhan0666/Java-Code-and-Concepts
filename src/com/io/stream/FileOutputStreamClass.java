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
 * If you have to write primitive values into a file, 
 * use FileOutputStream class. You can write byte-oriented 
 * as well as character-oriented data through FileOutputStream class.
 * But, for character-oriented data, it is preferred to use FileWriter than
 *  FileOutputStream.


 * 
 */