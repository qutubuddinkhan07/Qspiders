package com.qsp.schemadesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateSchema {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
		Statement st = con.createStatement();
		st.execute("create database a5jdbc"); // if exits then exception
		con.close();
		System.out.println("Database created");
	}
}
