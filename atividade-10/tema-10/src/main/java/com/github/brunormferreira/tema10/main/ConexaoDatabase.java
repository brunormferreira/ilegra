package com.github.brunormferreira.tema10.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDatabase {
	
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String DB_URL = "jdbc:mariadb://localhost:3306/agenda";
	static final String USER = "root";
	static final String PASS = "ilegra";

	public static Connection openConexao() {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;	
	}
}
	

