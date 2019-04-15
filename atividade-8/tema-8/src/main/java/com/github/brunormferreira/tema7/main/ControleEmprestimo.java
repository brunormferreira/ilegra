package com.github.brunormferreira.tema7.main;

import java.util.ArrayList;
import java.util.List;

public class ControleEmprestimo {
	
	private ControleDAO controleDAO = new ControleDAO();
	private ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
	
	public boolean emprestarLivro(Livro livro, Usuario usuario, String arqBiblioteca, String arqEmp, String arqUsuarios, int diaLocacao) {
		
		List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
		List<Livro> livrosEmp = controleDAO.lerLivros(arqEmp);
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		
		int numLivrosUsuarioTotal = usuario.getTotalLivrosEmprestados();
		
		if(usuario.getLivrosEmprestados().size() < usuario.getLIMITE_LIVROS() && !livro.isLocado()) {
			numLivrosUsuarioTotal++;
			controleBiblioteca.removerLivro(livro.getId(), arqBiblioteca);
			controleBiblioteca.removerUsuario(usuario.getId(), arqUsuarios);
			usuario.setTotalLivrosEmprestados(numLivrosUsuarioTotal);
			livro.setLocado(true);
			livro.setUsuarioLivro(usuario.getId());
			livro.setDiaLocacao(diaLocacao);
			usuario.getLivrosEmprestados().add(livro);
			
			biblioteca = controleDAO.lerLivros(arqBiblioteca);
			usuarios = controleDAO.lerUsuarios(arqUsuarios);
			
			biblioteca.add(livro);
			usuarios.add(usuario);
			
			controleDAO.escreverLivro(biblioteca, arqBiblioteca);
			controleDAO.escreverUsuario(usuarios, arqUsuarios);
			controleDAO.escreverLivro(livrosEmp, arqEmp);
			return true;
		} else {
			return false;
		}
			
	}

	public void devolverLivro(Livro livro, Usuario usuario, String arqBiblioteca, String arqEmp, String arqUsuarios, String arqAtr) {
		
		List<Livro> livrosAtr = controleDAO.lerLivros(arqAtr);
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
		
		controleBiblioteca.removerLivro(livro.getId(), arqBiblioteca);
		controleBiblioteca.removerUsuario(usuario.getId(), arqUsuarios);
		
		List<Livro> livrosEmpUsuario = usuario.getLivrosEmprestados();
		
		for(int i = 0; i < livrosEmpUsuario.size(); i++) {
			if(livrosEmpUsuario.get(i).getId() == livro.getId());
			livrosEmpUsuario.remove(livrosEmpUsuario.get(i));
		}
		
		livro.setLocado(false);
		livro.setUsuarioLivro(0);
		
		if(livro.getDiasLocado() > 7) {
			int numDiasAtraso = livro.getDiasLocado() - 7;
			usuario.setAtrasado(true);
			usuario.setNumDiasAtraso(numDiasAtraso);
			double multa = numDiasAtraso * 5.00;
			
		    if(livrosAtr == null) {
			List<Livro> livrosAtrVazio = new ArrayList<Livro>();
			livrosAtrVazio.add(livro);
			controleDAO.escreverLivro(livrosAtrVazio, arqAtr);		
		    } else {
			livrosAtr.add(livro);
			controleDAO.escreverLivro(livrosAtr, arqAtr);
		   }
	     	usuario.setMulta(multa);	
	 	}
		
		livro.setDiaLocacao(0);
		
		biblioteca = controleDAO.lerLivros(arqBiblioteca);
		usuarios = controleDAO.lerUsuarios(arqUsuarios);
		
		biblioteca.add(livro);
		usuarios.add(usuario);
		
		controleDAO.escreverLivro(biblioteca, arqBiblioteca);
		controleDAO.escreverUsuario(usuarios, arqUsuarios);	
		
	}

	public void quitarMulta(Usuario usuario, String arqAtr, String arqUsuarios) {
		
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		
		controleBiblioteca.removerUsuario(usuario.getId(), arqUsuarios);
		
		usuario.setMulta(0);
		usuario.setAtrasado(false);
		
		usuarios.add(usuario);
		
		controleDAO.escreverUsuario(usuarios, arqUsuarios);
	}

	public boolean renovarLivro(Livro livro, Usuario usuario, String arqBiblioteca, int diaLocacao) {
		
		List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
		
		if(!usuario.isAtrasado()) {
			controleBiblioteca.removerLivro(livro.getId(), arqBiblioteca);
			livro.setDiaLocacao(diaLocacao);
			
			biblioteca.add(livro);
			
			controleDAO.escreverLivro(biblioteca, arqBiblioteca);
			return true;
		} else {
			return false;
		}
		
	}
	
}
