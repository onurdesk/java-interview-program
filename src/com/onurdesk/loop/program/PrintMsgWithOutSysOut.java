package com.onurdesk.loop.program;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintMsgWithOutSysOut {

	public static void main(String[] args) throws IOException {

		System.out.write("Java Programs App \n".getBytes());
		System.out.format("%s", "Java Programs App \n");
		PrintStream printStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
		printStream.print("Java Programs App \n");
		System.err.print("Error message");

	}

}
