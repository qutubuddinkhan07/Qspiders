package com.qsp.dynamicQuery;

import java.sql.CallableStatement;
import java.sql.Connection;

public class StoredProcedure {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionPool.supply();
		CallableStatement cs = con.prepareCall("{CALL INCAGE}");
		cs.execute();
		ConnectionPool.accept(con);
		System.out.println("Age incremented");
	}
}
