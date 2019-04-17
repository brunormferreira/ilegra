package com.github.brunormferreira.tema8.main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ControleBibliotecaTest {
	
	private String bdUsuarios = "usuario-test.json";
	private String bdBiblioteca = "biblioteca-test.json";
	private String bdTopUsuarios = "usuario-top-test.json";
	private String idLivro = "idLivro.txt";
	private String idUsuario = "idUsuario.txt";
	
	@Test
	public void testAdicionarLivro() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();

		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);

		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);

		List<Livro> lista = controleDAO.lerLivros(bdBiblioteca);

		assertEquals(3, lista.size());
	}
	
	@Test
	public void testAdicionarUsuario() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdUsuarios);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarUsuario("Bruno", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ramires", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Moraes", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ferreira", bdUsuarios);
		
		List<Usuario> lista = controleDAO.lerUsuarios(bdUsuarios);

		assertEquals(4, lista.size());
	}
	
	@Test
	public void testRemoverLivro() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);
		
		List<Livro> lista = controleDAO.lerLivros(bdBiblioteca);
		
		boolean remocaoOk = controleBiblioteca.removerLivro(lista.get(0).getId(), bdBiblioteca);
		
		lista = controleDAO.lerLivros(bdBiblioteca);
		
		assertEquals(remocaoOk, true);
		assertEquals(2, lista.size());			
	}
	
	@Test
	public void testBuscarLivroTitulo() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);
		
		List<Livro> lista = controleBiblioteca.buscarLivrosTitulo("Domain", bdBiblioteca);
		
		assertEquals(1, lista.size());	
	}
	
	@Test
	public void testBuscarLivroAutor() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);
		
		List<Livro> lista = controleBiblioteca.buscarLivrosAutor("Erich", bdBiblioteca);
		
		assertEquals(1, lista.size());		
	}
	
	@Test
	public void testBuscarLivroId() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);
		
		List<Livro> lista = controleDAO.lerLivros(bdBiblioteca);
		
		int idLivro = lista.get(0).getId();
		
		Livro livro = controleBiblioteca.buscarLivroId(idLivro, bdBiblioteca);
		
		assertEquals("Domain Driven Design", livro.getTitulo());	
	}
	 
	@Test
	public void testBuscarUsuarioId() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		
		controleDAO.deletarArquivo(bdUsuarios);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarUsuario("Bruno", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ramires", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Moraes", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ferreira", bdUsuarios);
		
		List<Usuario> lista = controleDAO.lerUsuarios(bdUsuarios);
		
		int idUsuario = lista.get(2).getId();
		
		Usuario usuario = controleBiblioteca.buscarUsuarioId(idUsuario, bdUsuarios);
		
		assertEquals("Moraes", usuario.getNome());

	}

	@Test
    public void testTopUsers() {
    	
    	ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		List<Usuario> lista = new ArrayList<Usuario>();
		
		controleDAO.deletarArquivo(idUsuario);
		
		controleBiblioteca.adicionarUsuario("Bruno", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Ramires", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Moraes", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Ferreira", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Marcelly", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Igor", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Helena", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Helen", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Fabi", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Carlos", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Joao", bdTopUsuarios);
		controleBiblioteca.adicionarUsuario("Lucas", bdTopUsuarios);
		
		Usuario user1 = controleBiblioteca.buscarUsuarioId(1, bdTopUsuarios);
		Usuario user2 = controleBiblioteca.buscarUsuarioId(2, bdTopUsuarios);
		Usuario user3 = controleBiblioteca.buscarUsuarioId(3, bdTopUsuarios);
		Usuario user4 = controleBiblioteca.buscarUsuarioId(4, bdTopUsuarios);
		Usuario user5 = controleBiblioteca.buscarUsuarioId(5, bdTopUsuarios);
		Usuario user6 = controleBiblioteca.buscarUsuarioId(6, bdTopUsuarios);
		Usuario user7 = controleBiblioteca.buscarUsuarioId(7, bdTopUsuarios);
		Usuario user8 = controleBiblioteca.buscarUsuarioId(8, bdTopUsuarios);
		Usuario user9 = controleBiblioteca.buscarUsuarioId(9, bdTopUsuarios);
		Usuario user10 = controleBiblioteca.buscarUsuarioId(10, bdTopUsuarios);
		Usuario user11 = controleBiblioteca.buscarUsuarioId(11, bdTopUsuarios);
		Usuario user12 = controleBiblioteca.buscarUsuarioId(12, bdTopUsuarios);
		
		user1.setTotalLivrosEmprestados(9); 
		user2.setTotalLivrosEmprestados(15); 
		user3.setTotalLivrosEmprestados(20);
		user4.setTotalLivrosEmprestados(6);
		user5.setTotalLivrosEmprestados(3);
		user6.setTotalLivrosEmprestados(25);
		user7.setTotalLivrosEmprestados(12);
		user8.setTotalLivrosEmprestados(9);
		user9.setTotalLivrosEmprestados(10);
		user10.setTotalLivrosEmprestados(7);
		user11.setTotalLivrosEmprestados(4);
		user12.setTotalLivrosEmprestados(13);
		
		lista.add(user1);
		lista.add(user2);
		lista.add(user3);
		lista.add(user4);
		lista.add(user5);
		lista.add(user6);
		lista.add(user7);
		lista.add(user8);
		lista.add(user9);
		lista.add(user10);
		lista.add(user11);
		lista.add(user12);
		
		controleDAO.escreverUsuario(lista, bdTopUsuarios);
				
		List<Usuario> topUsers = controleBiblioteca.topUsers(bdTopUsuarios);
				
		assertEquals(topUsers.get(0).getNome(), user6.getNome());
		assertEquals(topUsers.get(3).getNome(), user12.getNome());
		assertEquals(topUsers.get(7).getNome(), user1.getNome());
		assertEquals(topUsers.get(8).getNome(), user10.getNome());
    }
}

	
