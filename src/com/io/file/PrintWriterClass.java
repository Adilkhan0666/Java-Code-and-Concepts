package com.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {

		// Three constructor
		// PrintWriter printWriter=new PrintWriter(String fileName);
		// PrintWriter printWriter2=new PrintWriter(File fileRefecence);
		// PrintWriter printWriter3=new PrintWriter(Writer writer);

		PrintWriter printWriter=new PrintWriter("abcPW.txt");
		printWriter.print("Adil Khan");
		printWriter.print(100);
		printWriter.flush();
		printWriter.close();

	}
}

/*
 * Most enhanced writer to write character data to the file. The main adv of PW
 * over FR and BW is we can write any type of primitive data directly to the
 * file.
 * 
 * write(100)=>d, print(100)=>100
 * in case of write d will be o/p bcz it return char
 * 
 * for write => PrintWriter 
 * for read => BufferedReader
 * 
 * 
 * data
------------
1. Character data=>text data=>Reader or Writer required
2. Binary data=>image,pdf,video,audio =>output stream(write) InputStream(Read)

 */
