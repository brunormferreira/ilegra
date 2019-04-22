package com.github.brunormferreira.tema10.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
	
	public boolean adicionarContato(Contato contato) {
		try (Connection conn = ConexaoDatabase.openConexao();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO contato (nome, telefone, email) VALUES (?, ?, ?)")) {
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.setString(3, contato.getEmail());
			stmt.executeUpdate();
			System.out.println("Contato adicionado!");
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean listarContato() {
		try (Connection conn = ConexaoDatabase.openConexao();	
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM contato")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String lastName = rs.getString("nome");
				System.out.println(lastName + "\n");
			}

			System.out.println("Listando contatos...\n");
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;

		}
		return true;
	}

	public boolean buscarContatoPorNome(String nome) {	
		try (Connection conn = ConexaoDatabase.openConexao();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM contato WHERE nome = '" + nome + "'")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String lastName = rs.getString("nome");
				System.out.println(lastName + "\n");
			}

			System.out.println("Buscando contatos através do nome...\n");
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean buscarContatoPorId(int id) {
		try (Connection conn = ConexaoDatabase.openConexao();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM contato WHERE id = '" + id + "'")) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String lastName = rs.getString("nome");
				System.out.println(lastName + "\n");
			}

				System.out.println("Buscando contatos através do id...\n");
			} catch (Exception exception) {
				exception.printStackTrace();
				return false;
		}
		return true;
	}
	
	public boolean removerContato(int id) {	
		try (Connection conn = ConexaoDatabase.openConexao();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM contato WHERE id = ?")) {
			stmt.setInt(1, id);
			stmt.execute();
			System.out.println("Contato removido!");
		} catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
		return true;
	}	
	   
	public List<Contato> ordenarContato(String tipo) {
		List<Contato> contatos = new ArrayList<Contato>();
		try (Connection connection = ConexaoDatabase.openConexao()) {
			String sql = "SELECT * FROM contato ORDER BY" + tipo + ";";
			PreparedStatement pstm = connection.prepareStatement(sql);
			ResultSet resultSet = pstm.executeQuery();
			while (resultSet.next()) {
				contatos.add(new Contato(resultSet.getString("nome"), resultSet.getString("telefone"), resultSet.getString("email")));
			}
			resultSet.close();
			pstm.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contatos;
	}
	
}
	



