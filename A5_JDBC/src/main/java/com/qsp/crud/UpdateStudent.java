package com.qsp.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		Statement st = con.createStatement();
		String sql = "update student set age = 28 where id = 1";
		int row = st.executeUpdate(sql);
		con.close();
		System.out.println(row + " row updated"); // 1 row updated
	}
}
