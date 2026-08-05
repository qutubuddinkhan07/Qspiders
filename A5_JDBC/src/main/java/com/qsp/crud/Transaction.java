package com.qsp.crud;

import java.sql.Connection;
import java.sql.Statement;

import com.qsp.dynamicQuery.ConnectionPool;

public class Transaction {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionPool.supply();
		Statement st = con.createStatement();
		con.setAutoCommit(false);
		try {
			int rows = st.executeUpdate("delete from student where id = 4");
			con.commit();
			System.out.println(rows + " row deleted");
		} catch (Exception e) {
			con.rollback();
			System.out.println("Transaction failed");
		}

		ConnectionPool.accept(con);
	}
}
