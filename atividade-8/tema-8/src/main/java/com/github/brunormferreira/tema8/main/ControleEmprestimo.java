package com.github.brunormferreira.tema8.main;

import java.util.ArrayList;
import java.util.List;

public class ControleEmprestimo {
	
	private ControleDAO controleDAO = new ControleDAO();
	private ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
	
	public boolean emprestarLivro(Livro livro, Usuario usuario, String bdBiblioteca, String bdEmp, String bdUsuarios, int diaLocacao) {
		
		List<Livro> biblioteca = controleDAO.lerLivros(bdBiblioteca);
		List<Livro> livrosEmp = controleDAO.lerLivros(bdEmp);
		List<Usuario> usuarios = controleDAO.lerUsuarios(bdUsuarios);
		
		int numLivrosUsuarioTotal = usuario.getTotalLivrosEmprestados();
		
		if(usuario.getLivrosEmprestados().size() < usuario.getLIMITE_LIVROS() && !livro.isLocado()) {
			numLivrosUsuarioTotal++;
			controleBiblioteca.removerLivro(livro.getId(), bdBiblioteca);
			controleBiblioteca.removerUsuario(usuario.getId(), bdUsuarios);
			usuario.setTotalLivrosEmprestados(numLivrosUsuarioTotal);
			livro.setLocado(true);
			livro.setUsuarioLivro(usuario.getId());
			livro.setDiaLocacao(diaLocacao);
			usuario.getLivrosEmprestados().add(livro);
			
			biblioteca = controleDAO.lerLivros(bdBiblioteca);
			usuarios = controleDAO.lerUsuarios(bdUsuarios);
			
			biblioteca.add(livro);
			usuarios.add(usuario);
			
			controleDAO.escreverLivro(biblioteca, bdBiblioteca);
			controleDAO.escreverUsuario(usuarios, bdUsuarios);
			controleDAO.escreverLivro(livrosEmp, bdEmp);
			return true;
		} else {
			return false;
		}
			
	}

	public void devolverLivro(Livro livro, Usuario usuario, String bdBiblioteca, String bdEmp, String bdUsuarios, String bdAtr) {
		
		List<Livro> livrosAtr = controleDAO.lerLivros(bdAtr);
		List<Usuario> usuarios = controleDAO.lerUsuarios(bdUsuarios);
		List<Livro> biblioteca = controleDAO.lerLivros(bdBiblioteca);
		
		controleBiblioteca.removerLivro(livro.getId(), bdBiblioteca);
		controleBiblioteca.removerUsuario(usuario.getId(), bdUsuarios);
		
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
			controleDAO.escreverLivro(livrosAtrVazio, bdAtr);		
		    } else {
			livrosAtr.add(livro);
			controleDAO.escreverLivro(livrosAtr, bdAtr);
		   }
	     	usuario.setMulta(multa);	
	 	}
		
		livro.setDiaLocacao(0);
		
		biblioteca = controleDAO.lerLivros(bdBiblioteca);
		usuarios = controleDAO.lerUsuarios(bdUsuarios);
		
		biblioteca.add(livro);
		usuarios.add(usuario);
		
		controleDAO.escreverLivro(biblioteca, bdBiblioteca);
		controleDAO.escreverUsuario(usuarios, bdUsuarios);	
		
	}

	public void quitarMulta(Usuario usuario, String arqAtr, String bdUsuarios) {
		
		List<Usuario> usuarios = controleDAO.lerUsuarios(bdUsuarios);
		
		controleBiblioteca.removerUsuario(usuario.getId(), bdUsuarios);
		
		usuario.setMulta(0);
		usuario.setAtrasado(false);
		
		usuarios.add(usuario);
		
		controleDAO.escreverUsuario(usuarios, bdUsuarios);
	}

	public boolean renovarLivro(Livro livro, Usuario usuario, String bdBiblioteca, int diaLocacao) {
		
		List<Livro> biblioteca = controleDAO.lerLivros(bdBiblioteca);
		
		if(!usuario.isAtrasado()) {
			controleBiblioteca.removerLivro(livro.getId(), bdBiblioteca);
			livro.setDiaLocacao(diaLocacao);
			
			biblioteca.add(livro);
			
			controleDAO.escreverLivro(biblioteca, bdBiblioteca);
			return true;
		} else {
			return false;
		}
		
	}
	
}
