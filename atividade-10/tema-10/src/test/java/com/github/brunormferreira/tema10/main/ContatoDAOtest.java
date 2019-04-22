package com.github.brunormferreira.tema10.main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContatoDAOtest {
	
	@Test
	public void testAdicionarContato() {
		ContatoDAO contatos = new ContatoDAO();
		Contato pessoa = new Contato("Bruno", "bruno.ramires@ilegra.com", "51991658585");
		assertEquals(true, contatos.adicionarContato(pessoa));
	}

	@Test
	public void testRemoverContato() {
		ContatoDAO contatos = new ContatoDAO();
		Contato pessoa = new Contato("Bruno", "bruno.ramires@ilegra.com", "51991658585");
		contatos.adicionarContato(pessoa);
		contatos.removerContato(1);
		assertEquals(true, contatos.listarContato());
	}
	
	@Test
	public void testBuscarPorNome() {
		ContatoDAO contatos = new ContatoDAO();
		Contato pessoa = new Contato("Bruno", "bruno.ramires@ilegra.com", "51991658585");
		contatos.adicionarContato(pessoa);
		assertEquals(true, contatos.buscarContatoPorNome("Bruno"));
	}

	@Test
	public void testBuscaPorID() {
		ContatoDAO contatos = new ContatoDAO();
		Contato pessoa = new Contato("Bruno", "bruno.ramires@ilegra.com", "51991658585");
		contatos.adicionarContato(pessoa);
		assertEquals(true, contatos.buscarContatoPorId(25));
	}

	@Test
	public void testListarContatos() {
		ContatoDAO contatos = new ContatoDAO();
		Contato pessoa = new Contato("Bruno", "bruno.ramires@ilegra.com", "51991658585");
		contatos.adicionarContato(pessoa);
		assertEquals(true, contatos.listarContato());
	}

}
