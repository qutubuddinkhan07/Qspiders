package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		String sql = "update student set name = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter new name");
		String name = sc.next();
		ps.setString(1, name);
		ps.setInt(2, id);
		int row = ps.executeUpdate();

		con.close();
		System.out.println(row + " row updated");
	}
}
