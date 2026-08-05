package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class BatchProcessing {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		Scanner sc = new Scanner(System.in);
		String sql = "insert into student values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.addBatch();
		}

		int[] output = ps.executeBatch();
		System.out.println(Arrays.toString(output));

		sc.close();
		con.close();
	}
}
