package com.qsp.deadlock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass extends Thread {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\qutub\\OneDrive\\Desktop\\a4\\abc.txt");
		if (f.exists()) {
			System.out.println("File already exists");
		}

		FileWriter fw = new FileWriter(f, true);
	} // exists, check the directory present or not
}
