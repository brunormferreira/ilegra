package com.github.brunormferreira.tema7.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControleBiblioteca {
	
	private ControleDAO controleDAO = new ControleDAO();
	private GeradorId geradorId = new GeradorId();
	
	public void adicionarUsuario(String nome, String arqUsuarios) {
		 List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		 
		 Usuario usuario = new Usuario(nome, geradorId.gerarIdUsuario());
		 if(usuarios == null) {
			 List<Usuario> usuariosVazio = new ArrayList<Usuario>();
			 usuariosVazio.add(usuario);
			 controleDAO.escreverUsuario(usuariosVazio, arqUsuarios);
		 } else {
			 usuarios.add(usuario);
			 controleDAO.escreverUsuario(usuarios, arqUsuarios);
		 }
	 
	}

	public boolean removerUsuario(int id, String arqUsuarios) {
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		
		for(int i = 0; i < usuarios.size(); i++) {
			Usuario usuario = usuarios.get(i);
			if (usuario.getId() == id) {
				usuarios.remove(usuarios.get(i));
				controleDAO.escreverUsuario(usuarios, arqUsuarios);
				return true;
			}
		} return false;
		
	}
	
	public void adicionarLivro(String titulo, String autor, String arqBiblioteca) {
		List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
		Livro livro = new Livro(titulo, autor, geradorId.gerarIdLivro());
		
		if(biblioteca == null) {
			List<Livro> bibliotecaVazio = new ArrayList<Livro>();
			bibliotecaVazio.add(livro);
			controleDAO.escreverLivro(bibliotecaVazio, arqBiblioteca);
		} else {
			biblioteca.add(livro);
			controleDAO.escreverLivro(biblioteca, arqBiblioteca);
		}
	  }
	
	public boolean removerLivro(int id, String arqBiblioteca) {
        List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
		
		for(int i = 0; i < biblioteca.size(); i++) {
			Livro livro = biblioteca.get(i);
			if (livro.getId() == id) {
				biblioteca.remove(biblioteca.get(i));
				controleDAO.escreverLivro(biblioteca, arqBiblioteca);
				return true;
			}
		} return false;
		
		
	}
		
	public List<Livro> buscarLivrosTitulo(String titulo, String arqBiblioteca) {
		List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);	
		
		List<Livro> livrosBuscados = biblioteca.stream().filter(livro -> livro.getTitulo().contains(titulo)).collect(Collectors.toList());
		return livrosBuscados;
	}
	
	public List<Livro> buscarLivrosAutor(String autor, String arqBiblioteca) {
        List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);	
		
		List<Livro> livrosBuscados = biblioteca.stream().filter(livro -> livro.getAutor().contains(autor)).collect(Collectors.toList());
		return livrosBuscados;
	}
	
	public Livro buscarLivroId(int id, String arqBiblioteca) {
        List<Livro> biblioteca = controleDAO.lerLivros(arqBiblioteca);
        
        for(Livro livro : biblioteca) {
        	if(livro.getId() == id) {
        		return livro;
        	}
        }
        return null;
	}
	
	public Usuario buscarUsuarioId(int id, String arqUsuarios) {
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);	
		
		for(Usuario usuario : usuarios) {
			if(usuario.getId() == id) {
				return usuario;
			}
		} 
		return null;
    }
	
	public List<Usuario> topUsers(String arqUsuarios) {
		List<Usuario> topUsuarios = new ArrayList<Usuario>();
		List<Usuario> usuarios = controleDAO.lerUsuarios(arqUsuarios);
		
		for(int i = 0; i < usuarios.size(); i++) {
			Usuario usuario = usuarios.get(i);
			usuario.setTotalLivrosEmprestados(usuario.getTotalLivrosEmprestados());
			
			int x = i;
			while((x > 0) && (usuarios.get(x - 1)).getTotalLivrosEmprestados() > usuario.getTotalLivrosEmprestados()) {
				usuarios.set(x, usuarios.get(x - 1));
				x--;
			}
			usuarios.set(x, usuario);	
		}
		for(int y = usuarios.size() - 1; y > usuarios.size() - 11; y--) {
			topUsuarios.add(usuarios.get(y));
		}
		return topUsuarios;
	}
}







	
