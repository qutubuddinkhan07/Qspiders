package com.qsp.fileoperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBuffer {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\Users\\\\qutub\\\\OneDrive\\\\Desktop\\\\a4\\\\abc.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("\nThis is the new line");
		bw.close();
		fw.close();
		System.out.println("WRITING FINISHED");
	}
}
