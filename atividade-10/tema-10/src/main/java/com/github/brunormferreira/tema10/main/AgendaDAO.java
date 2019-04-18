/*package com.github.brunormferreira.tema10.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {
	
	private List<Contato> listaContatos = new ArrayList<Contato>();
	private ConexaoDatabase dbConexao = new ConexaoDatabase();
	private Connection conexao = dbConexao.openConexao();
	private PreparedStatement stmt;
	private ResultSet resultSet;
	private Contato contatoEncontrado;
	private	int sucesso = 0;
	// JOPTION
	public int addContato(String nome, int telefone, String email) {
		
		String sql = "INSERT INTO contatos (nome, telefone, email) VALUES (?, ?, ?)";
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setLong(2, telefone);
			stmt.setString(3, email);
			
			if(stmt.executeUpdate() == 1) {
				return sucesso = 1;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbConexao.closeConnection(conexao, stmt);
		}
		return sucesso;		
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

}*/
