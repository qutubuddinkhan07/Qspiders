package com.qsp.fileoperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\qutub\\OneDrive\\Desktop\\a4\\abc.txt");
		if (f.exists()) {
			System.out.println("File already exists");
		} else {
			f.createNewFile();
			System.out.println("new file created");
		}

		FileWriter fw = new FileWriter(f, true);
		fw.write("This is the first line");
		System.out.println("Written into the file");
		fw.close();
	}
}
