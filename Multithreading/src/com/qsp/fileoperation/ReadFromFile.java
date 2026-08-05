package com.qsp.fileoperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\qutub\\OneDrive\\Desktop\\a4\\abc.txt");
		FileReader fr = new FileReader(f);
		int val = fr.read();
		while (val != -1) {
			System.out.print((char) val);
			val = fr.read();
		}
		fr.close();
	}
}
