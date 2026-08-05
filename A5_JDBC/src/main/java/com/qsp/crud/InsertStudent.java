package com.qsp.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		Statement st = con.createStatement();

		String sql = "insert into student values(3, 'Harry', 199)"; // dml
		int row = st.executeUpdate(sql);

		con.close();
		System.out.println(row + " rows inserted"); // 1 rows inserted
	}
}
