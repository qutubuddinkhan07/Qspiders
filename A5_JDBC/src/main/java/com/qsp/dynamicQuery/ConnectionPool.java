
package com.qsp.dynamicQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;
import java.util.List;

public class ConnectionPool {
	private static final int poolsize = 10;
	private static List<Connection> pool = new LinkedList<Connection>();
	private static String url = "jdbc:mysql://localhost:3306/a5jdbc";
	private static String uname = "root";
	private static String password = "root";

	static {
		for (int i = 1; i <= poolsize; i++) {
			try {
				Connection temp = DriverManager.getConnection(url, uname, password);
				pool.add(temp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void destroy() throws Exception {
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
