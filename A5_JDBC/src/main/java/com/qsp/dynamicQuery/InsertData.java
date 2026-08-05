package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter age:");
		int age = sc.nextInt();

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);

		int row = ps.executeUpdate();
		con.close();
		sc.close();

		System.out.println(row + " row inserted..");
	}
}
