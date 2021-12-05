package com.io.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("abcFW.txt",true);
		fileWriter.write('a');
		fileWriter.write("Adil");
		fileWriter.flush();
		fileWriter.close();
	}
}
//because of  \n  line separater problem BW or PW came.