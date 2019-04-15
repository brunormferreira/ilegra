package com.github.brunormferreira.tema7.main;

import java.util.Scanner;
import java.util.List;

public class MenuBiblioteca {
	
	private ControleDAO controleDAO = new ControleDAO();
	private ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
	private Scanner sc = new Scanner(System.in);
	private String arqUsuarios = "usuario.json";
	private String arqBiblioteca = "biblioteca.json";
	private String arqEmp = "livros-emprestados.json";
	private String arqAtr = "livros-atrasados.json";
	
	public void abrirMenu() {
		int i = 0;
		
		do {
			System.out.println("\n## Menu Biblioteca ##"+
		                       "\n1 - Adicionar novo usuario" +
			                   "\n2 - Adicionar novo livro" + 
			                   "\n3 - Buscar livro pelo titulo" +
			                   "\n4 - Buscar livro pelo autor" + 
			                   "\n5 - Listar livros emprestados" + 
			                   "\n6 - Listar livros atrasados" +
			                   "\n7 - Listar top 10 usuarios" +
			                   "\n8 - Remover livro" +
			                   "\n0 - Sair.");
			
			System.out.println("Informe uma opcao:");
			
			int opcao = 9;
			
			try{
				opcao = Integer.parseInt(sc.next());
				sc.nextLine();
			}catch(Exception e){
				System.out.print("");

			}
			
			switch (opcao) {
			case 1:
				System.out.println("Informe o nome do novo usuario:");
				String nomeUsuario = sc.nextLine();
				controleBiblioteca.adicionarUsuario(nomeUsuario, nomeUsuario);
				break;			
			
			case 2:
				System.out.println("Informe titulo do novo livro:");
				String titulo = sc.nextLine();
				System.out.println("Informe o nome do autor do novo livro:");
				String nomeAutor = sc.nextLine();
				controleBiblioteca.adicionarLivro(titulo, nomeAutor, arqBiblioteca);
				break;
			
			case 3:
				System.out.println("Informe o titulo do livro para busca:");
				String buscaTitulo = sc.nextLine();
				List<Livro> listaBuscaTitulo = controleBiblioteca.buscarLivrosTitulo(buscaTitulo, arqBiblioteca);
				
				if(listaBuscaTitulo.size() > 0)	{
					for(Livro livro : listaBuscaTitulo) {
						System.out.println("Título: " + livro.getTitulo());
						System.out.println("Autor: " + livro.getAutor());
						System.out.println("Id: " + livro.getId());
					}
				} else {
					System.out.println("Nenhum livro encontrado.");
				}
			    break;
			
			case 4:
				System.out.println("Informe o autor do livro para busca:");
				String buscaAutor = sc.nextLine();
				List<Livro> listaBuscaAutor = controleBiblioteca.buscarLivrosAutor(buscaAutor, arqBiblioteca);
				
				if(listaBuscaAutor.size() > 0)	{
					for(Livro livro : listaBuscaAutor) {
						System.out.println("Título: " + livro.getTitulo());
						System.out.println("Autor: " + livro.getAutor());
						System.out.println("Id: " + livro.getId());
					}
				} else {
					System.out.println("Nenhum livro encontrado.");
				}
			    break;
			
			case 5:
				List<Livro> buscarLivrosEmprestados = controleDAO.lerLivros(arqEmp);
				
				
			    
			    
			    
			    
			    
	    	} 
    	} while(i == 0);
	}
}
	
