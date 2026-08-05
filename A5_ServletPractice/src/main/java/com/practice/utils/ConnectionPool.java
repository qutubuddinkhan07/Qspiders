package com.practice.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final List<Connection> pool = new ArrayList<>();
	private static final int poolsize = 10;
	private static final String url = "jdbc:mysql://localhost:3306/practice";
	private static final String username = "root";
	private static final String password = "root";

	static {
		for (int i = 1; i <= poolsize; i++) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, username, password);
				pool.add(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void destroy() throws SQLException {
		for (Connection con : pool) {
			con.close();
		}
		pool.clear();
	}

	public static final Connection supply() {
		return pool.remove(0);
	}

	public static final void accept(Connection con) {
		pool.add(con);
	}
}
