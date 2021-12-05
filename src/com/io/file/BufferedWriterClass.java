package com.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("abcBW.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write("adil by Buffered Writer");
		bufferedWriter.newLine();
		bufferedWriter.write('a');
		bufferedWriter.newLine();
		bufferedWriter.write('d');
		bufferedWriter.flush();
		bufferedWriter.close();

	}
}
/*
BufferedWriter doesn't communicate directly to the file
it communicate with the file writer
two level of buffering is also possible
eg : BufferedWriter bf=new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt")));
there is new method also to insert line newLine()

when we close BufferedWriter automatically internally FileWriter is gets closed

*/