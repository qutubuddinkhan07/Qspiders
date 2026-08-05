package com.qsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static List<Connection> pool = new ArrayList<Connection>();
	private static final int poolsize = 10;
	private static final String url = "jdbc:mysql://localhost:3306/a5servlet";
	private static final String user = "root";
	private static final String password = "root";

	static {
		for (int i = 1; i <= poolsize; i++) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection temp = DriverManager.getConnection(url, user, password);
				pool.add(temp);
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

	public static Connection supply() {
		return pool.remove(0);
	}

	public static void accept(Connection con) {
		pool.add(con);
	}
}
