package com.github.brunormferreira.tema8.main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ControleDAOTest {
	
	private String bdUsuarios = "usuario-test.json";
	private String bdBiblioteca = "biblioteca-test.json";
	
	@Test
	public void testEscreverLerLivro() {
		
		ControleDAO controleDAO = new ControleDAO();
		List<Livro> listaLivros = new ArrayList<Livro>();
		Livro livro1 = new Livro("Domain Driven Design", "Eric Evans", 1);
		Livro livro2 = new Livro("Design Patterns", "Erich Gamma", 2);
		Livro livro3 = new Livro("Clean Code", "Brian Goetz", 3);

		controleDAO.deletarArquivo(bdBiblioteca);
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);

		controleDAO.escreverLivro(listaLivros, bdBiblioteca);

		listaLivros = controleDAO.lerLivros(bdBiblioteca);

		assertEquals(3, listaLivros.size());	
	}
	
	@Test
	public void testEscreverLerUsuario() {
		
		ControleDAO controleDAO = new ControleDAO();
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("Bruno", 1);
		Usuario usuario2 = new Usuario("Ramires", 2);
		Usuario usuario3 = new Usuario("Moraes", 3);
		Usuario usuario4 = new Usuario("Igor", 4);

		controleDAO.deletarArquivo(bdBiblioteca);
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
		listaUsuarios.add(usuario4);

		controleDAO.escreverUsuario(listaUsuarios, bdUsuarios);

		listaUsuarios = controleDAO.lerUsuarios(bdUsuarios);

		assertEquals(4, listaUsuarios.size());	
	}
}
