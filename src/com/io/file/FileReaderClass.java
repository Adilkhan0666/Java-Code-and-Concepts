package com.io.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("abc.txt");
		int i = fileReader.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fileReader.read();
		}

	}
}
/*
 * it is used to read character data from the file
 * by using file reader we can read data only character by character only 
 * 
 */