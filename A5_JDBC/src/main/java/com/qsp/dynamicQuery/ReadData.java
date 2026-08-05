package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadData {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		String sql = "select * from student where id = ?";

		System.out.println("Enter id:");
		int id = new java.util.Scanner(System.in).nextInt();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		con.close();
	}
	/// <pre>
	/// Enter id:
	/// 1
	/// 1 Akaza 28
	/// </pre>
	///
}
