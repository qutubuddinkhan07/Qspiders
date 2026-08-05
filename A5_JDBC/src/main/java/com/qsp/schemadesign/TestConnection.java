package com.qsp.schemadesign;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	public static void main(String[] args) throws Exception {
		// load the class
		// Class.forName("com.mysql.cj.jdbc.Driver"); // we can exclude this line bcs in
		// modern JDBC it works

		// create conn object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		/// <pre> url= "jdbc:mysql://localhost:3306"
		/// user = "root"
		/// password = "root"
		/// </pre>
		///

		// close connection
		con.close();
		System.out.println("Connection tested");
	}
}
