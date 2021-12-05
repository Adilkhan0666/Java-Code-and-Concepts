package com.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("abcBW.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String lineString=bufferedReader.readLine();
		while (lineString!=null) {
		System.out.println(lineString);
		lineString=bufferedReader.readLine();
		}
		bufferedReader.close();
	}
}


/*
 With the help of BufferedReader we can read either line by line or character by 
 character.
 that's the benefits of BufferedReader
 it require Reader object to read file
 it contain readLine() method whose return type is String
 
 
 */