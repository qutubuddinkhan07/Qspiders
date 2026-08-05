package com.qsp.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\\\Users\\\\qutub\\\\OneDrive\\\\Desktop\\\\a4\\\\mobile.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Mobile m = (Mobile) ois.readObject();
		System.out.println(m);
		ois.close();
	}
}
