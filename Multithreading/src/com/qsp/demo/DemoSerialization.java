package com.qsp.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\\\Users\\\\qutub\\\\OneDrive\\\\Desktop\\\\a4\\\\mobile.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Mobile m = new Mobile("Redmi", "Redmi note 4", 11999.99, "4GB", "64GB");
		oos.writeObject(m);
		oos.close();
	}
}
