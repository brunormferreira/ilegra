package com.github.brunormferreira.tema10.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoDatabase {
	
	public static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	public static final String DB_URL = "jdbc:mariadb://localhost:3306/agenda";
	static final String USER = "root";
	static final String PASS = "";

	public static Connection openConexao() {
		System.out.println("Conectando ao banco...");
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception exception) {
			throw new RuntimeException("Erro na conexao: ", exception);
		}
	}
	
	public void closeConnection(Connection con){
		if(con != null){
			try{
				con.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	public void closeConnection(Connection con, PreparedStatement stmt){
		closeConnection(con);
		if(stmt != null){
			try{
				stmt.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	public void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
		closeConnection(con, stmt);
		if(rs != null){
			try{
				rs.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}


	

