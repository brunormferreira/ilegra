package com.github.brunormferreira.tema8.main;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class ControleEmprestimoTest {
	
	private String bdUsuarios = "usuario-test-emp.json";
	private String bdBiblioteca = "biblioteca-test-emp.json";
	private String idLivro = "idLivro.txt";
	private String idUsuario = "idUsuario.txt";
	private String bdEmp = "livros-emprestados-test.json";
	private String bdAtr = "livros-atrasados-test.json";
	private Calendar calendario = Calendar.getInstance();
	private int diaDoAno = calendario.get(Calendar.DAY_OF_YEAR);
	
	public void preencherDados() {
		
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
				
		controleBiblioteca.adicionarLivro("Domain Driven Design", "Eric Evans", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Design Patterns", "Erich Gamma", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Clean Code", "Brian Goetz", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Guerra e Paz", "Liev Tolstoi", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Logica", "Mark Golz", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Blade", "Lucas Baldin", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Senhor dos Aneis 1", "Tolkien", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Senhor dos Aneis 2", "Tolkien", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Senhor dos Aneis 3", "Tolkien", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Linguagem Contemporanea", "Carlos Moraes", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Logica de Programacao", "Ronaldo Grach", bdBiblioteca);
		controleBiblioteca.adicionarLivro("Terror in Downtown", "Osmar Yurt", bdBiblioteca);
	
		controleBiblioteca.adicionarUsuario("Bruno", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ramires", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Moraes", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ferreira", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Igor", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Carlos", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Helena", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Helen", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Fabi", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Joao", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Leonardo", bdUsuarios);
		controleBiblioteca.adicionarUsuario("Ronaldo", bdUsuarios);
		
	}
	
	@Test
	public void testEmprestarLivro() {
		
		ControleDAO controleDAO = new ControleDAO();
		ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Calendar calendario = Calendar.getInstance();
		int diaDoAno = calendario.get(Calendar.DAY_OF_YEAR);
		
		controleDAO.deletarArquivo(bdBiblioteca);
		controleDAO.deletarArquivo(bdUsuarios);
		controleDAO.deletarArquivo(idLivro);
		controleDAO.deletarArquivo(idUsuario);
		
		preencherDados();
		
		Livro livro = controleBiblioteca.buscarLivroId(1, bdBiblioteca);
		Usuario usuario = controleBiblioteca.buscarUsuarioId(1, bdUsuarios);
		
		livro.setDiaLocacao(diaDoAno);
		boolean retiradaOk = controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		
		assertEquals(1, usuario.getLivrosEmprestados().size());
		assertEquals(true, livro.isLocado());
		assertEquals(true, retiradaOk);
		assertEquals(1, livro.getUsuarioLivro());
		
	}

	@Test
    public void testDevolverLivro() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Livro livro = controleBiblioteca.buscarLivroId(3, bdBiblioteca);
		Usuario usuario = controleBiblioteca.buscarUsuarioId(4, bdUsuarios);
    	
    	controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
    	controleEmprestimo.devolverLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, bdAtr);
    	
    	assertEquals(0, usuario.getLivrosEmprestados().size());
    	assertEquals(1, usuario.getTotalLivrosEmprestados());
    	assertEquals(false, usuario.isAtrasado());
    	assertEquals(false, livro.isLocado());
    	assertEquals(0, livro.getUsuarioLivro());
    	assertEquals(0.0, usuario.getMulta(), 0.0);
    	assertEquals(0, usuario.getNumDiasAtraso());
    }

    @Test
    public void testRetirarLivroIndisponivel() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Livro livro = controleBiblioteca.buscarLivroId(2, bdBiblioteca);
		Usuario usuario2 = controleBiblioteca.buscarUsuarioId(2, bdUsuarios);
		Usuario usuario3 = controleBiblioteca.buscarUsuarioId(3, bdUsuarios);
		
		controleEmprestimo.emprestarLivro(livro, usuario2, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		
		boolean retiradaOk = controleEmprestimo.emprestarLivro(livro, usuario3, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		
		assertEquals(false, retiradaOk);
		
		controleEmprestimo.devolverLivro(livro, usuario2, bdBiblioteca, bdEmp, bdUsuarios, bdAtr);	
    }

    @Test
    public void testRetirarMaisDeCinco() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();

		Livro livro1 = controleBiblioteca.buscarLivroId(4, bdBiblioteca);
		Livro livro2 = controleBiblioteca.buscarLivroId(5, bdBiblioteca);
		Livro livro3 = controleBiblioteca.buscarLivroId(6, bdBiblioteca);
		Livro livro4 = controleBiblioteca.buscarLivroId(7, bdBiblioteca);
		Livro livro5 = controleBiblioteca.buscarLivroId(8, bdBiblioteca);
		Livro livro6 = controleBiblioteca.buscarLivroId(9, bdBiblioteca);

		Usuario usuario = controleBiblioteca.buscarUsuarioId(5, bdUsuarios);

		controleEmprestimo.emprestarLivro(livro1, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		controleEmprestimo.emprestarLivro(livro2, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		controleEmprestimo.emprestarLivro(livro3, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		controleEmprestimo.emprestarLivro(livro4, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		controleEmprestimo.emprestarLivro(livro5, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		boolean retiradaOk = controleEmprestimo.emprestarLivro(livro6, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);

		assertEquals(false, retiradaOk);
    }

    @Test
    public void testRenovarLivroOk() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Livro livro = controleBiblioteca.buscarLivroId(10, bdBiblioteca);
		Usuario usuario = controleBiblioteca.buscarUsuarioId(6, bdUsuarios);
		
		controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		boolean retiradaOk = controleEmprestimo.renovarLivro(livro, usuario, bdBiblioteca, diaDoAno);
		
		assertEquals(true, retiradaOk); 	
    }
 
    @Test
    public void testDevolverLivroAtrasado() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Livro livro = controleBiblioteca.buscarLivroId(11, bdBiblioteca);
		Usuario usuario = controleBiblioteca.buscarUsuarioId(7, bdUsuarios);
		
	    controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno - 10);
		controleEmprestimo.devolverLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, bdAtr);
		
		assertEquals(0, usuario.getLivrosEmprestados().size());
    	assertEquals(1, usuario.getTotalLivrosEmprestados());
    	assertEquals(true, usuario.isAtrasado());
    	assertEquals(false, livro.isLocado());
    	assertEquals(0, livro.getUsuarioLivro());
    	assertEquals(15.0, usuario.getMulta(), 0.0);
    	assertEquals(3, usuario.getNumDiasAtraso());
    }
    
    @Test
    public void testQuitarMulta() {
    	
    	ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
		ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
		
		Livro livro = controleBiblioteca.buscarLivroId(12, bdBiblioteca);
		Usuario usuario = controleBiblioteca.buscarUsuarioId(8, bdUsuarios);
    	
		controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);
		controleEmprestimo.devolverLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, bdAtr);
		
		controleEmprestimo.quitarMulta(usuario, bdAtr, bdUsuarios);
		
		assertEquals(0.0, usuario.getMulta(), 0.0);
    }
}

