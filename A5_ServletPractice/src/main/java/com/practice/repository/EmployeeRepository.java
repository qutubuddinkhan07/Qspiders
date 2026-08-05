package com.practice.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.practice.utils.ConnectionPool;

public class EmployeeRepository {
	private static EmployeeRepository object = new EmployeeRepository();

	private EmployeeRepository() {
	}

	public static EmployeeRepository getInstance() {
		return object;
	}

	public String addEmployee(String username, String email, String password, String role) {
		Connection con = ConnectionPool.supply();
		try {

			String sql = "insert into employee values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, role);
			int rows = ps.executeUpdate();
			System.out.printf("%d rows inserted", rows);
		} catch (Exception e) {
			e.printStackTrace();
			return "Error Occured while registering";
		} finally {
			ConnectionPool.accept(con);
		}
		return "Successfully registered!!";
	}

	public ResultSet getEmployeeByUserName(String username) {
		Connection con = ConnectionPool.supply();
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM employee WHERE username = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionPool.accept(con);
		}
		return rs;
	}
}
