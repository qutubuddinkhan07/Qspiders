package com.qsp.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a5jdbc", "root", "root");
		try (con) {
			Statement st = con.createStatement();
			String sql = "delete from student where id=3"; // DML

			int row = st.executeUpdate(sql);

			System.out.println(row + " row deleted!!"); // 1 row deleted!!

		} catch (Exception e) {
			e.printStackTrace(); // alternative logic
			System.out.println("Aladin news");
		} // try-with resource (jdk 7 -> jdk 9)
	}
}
