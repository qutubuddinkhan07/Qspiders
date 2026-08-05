package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionPool.supply();
		String sql = "delete from student where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("Enter id:");
		int id = new java.util.Scanner(System.in).nextInt();
		ps.setInt(1, id);
		int row = ps.executeUpdate();
		ConnectionPool.accept(con); // return the connection
		System.out.println(row + " rows deleted");
	}
}
