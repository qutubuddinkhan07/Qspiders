package com.qsp.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBuffer {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\Users\\\\qutub\\\\OneDrive\\\\Desktop\\\\a4\\\\abc.txt");
		FileReader fw = new FileReader(f);

		BufferedReader br = new BufferedReader(fw);
		String s = br.readLine();
		int count = 0;
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
			count++;
		}

		System.out.println("count " + count);
		br.close();
		fw.close();
	}
	/*-
	This is the first lineThis is the first lineThis is the first line
	
	This is the new line
	count 3
	
	 */
}
