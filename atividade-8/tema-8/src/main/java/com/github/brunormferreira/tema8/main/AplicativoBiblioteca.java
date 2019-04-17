package com.github.brunormferreira.tema8.main;

import java.util.Scanner;
import java.util.List;

public class AplicativoBiblioteca {
	
	private ControleDAO controleDAO = new ControleDAO();
	private ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
	private Scanner sc = new Scanner(System.in);
	private String bdUsuarios = "usuario.json";
	private String bdBiblioteca = "biblioteca.json";
	private String bdEmp = "livros-emprestados.json";
	private String bdAtr = "livros-atrasados.json";
	
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
				controleBiblioteca.adicionarUsuario(nomeUsuario, bdUsuarios);
				break;			
			
			case 2:
				System.out.println("Informe titulo do novo livro:");
				String titulo = sc.nextLine();
				System.out.println("Informe o nome do autor do novo livro:");
				String nomeAutor = sc.nextLine();
				controleBiblioteca.adicionarLivro(titulo, nomeAutor, bdBiblioteca);
				break;
			
			case 3:
				System.out.println("Informe o titulo do livro para busca:");
				String buscaTitulo = sc.nextLine();
				List<Livro> listaBuscaTitulo = controleBiblioteca.buscarLivrosTitulo(buscaTitulo, bdBiblioteca);
				
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
				List<Livro> listaBuscaAutor = controleBiblioteca.buscarLivrosAutor(buscaAutor, bdBiblioteca);
				
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
				List<Livro> listaLivrosEmprestados = controleDAO.lerLivros(bdEmp);
				if(listaLivrosEmprestados.size() > 0) {
					for (Livro livro : listaLivrosEmprestados) {
						System.out.println("Título: " + livro.getTitulo());
						System.out.println("Nome do usuario: " + controleBiblioteca.buscarUsuarioId(livro.getUsuarioLivro(), bdUsuarios).getNome());
					}
				} else {
					System.out.println("Nenhum livro emprestado.");
				}
			    break;
			    
			case 6:
				List<Livro> listaLivrosAtrasados = controleDAO.lerLivros(bdAtr);
				if(listaLivrosAtrasados.size() > 0) {
					for(Livro livro : listaLivrosAtrasados) {
						System.out.println("Nome do usuário: " + controleBiblioteca.buscarUsuarioId(livro.getUsuarioLivro(), bdUsuarios).getNome());
						System.out.println("Dias de atraso: " + (livro.getDiasLocado() - 7));
					}
				}else {
					System.out.println("Nenhum livro atrasado.");
				}
				break;
				
			case 7:
				List<Usuario> topUsuarios = controleBiblioteca.topUsers(bdUsuarios);
				int x = 1;
				for(int y = 9; y < 0; y--) {
					System.out.println(x + "- " + topUsuarios.get(y));
					x++;
				}
				break;
				
			case 8:
				System.out.println("Informe a id do livro a ser removido: ");
				int idremocao;
				try {
					idremocao = Integer.parseInt(sc.next());
					if(controleBiblioteca.removerLivro(idremocao, bdBiblioteca)) {
						System.out.println("Livro removido com sucesso.");
					} else {
						System.out.println("Não é possível remover o livro.");
					}
				} catch (Exception e) {
				        System.out.println("Erro! Informe novamente a id do livro a ser removido: ");  
				} 
				break;
			
			case 0:
				i++;
				break;
				
			default:
				System.out.println("Opção inexistente.");
				break;
	    
	    	} 
    	} while(i == 0);
	}
}
	
