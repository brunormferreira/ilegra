package com.github.brunormferreira.tema8.main;

import java.util.Calendar;
import java.util.Scanner;

public class AplicativoEmprestimo {
	
	private ControleEmprestimo controleEmprestimo = new ControleEmprestimo();
	private ControleBiblioteca controleBiblioteca = new ControleBiblioteca();
	private Scanner sc = new Scanner(System.in);
	private String bdUsuarios = "usuario.json";
	private String bdBiblioteca = "biblioteca.json";
	private String bdEmp = "livros-emprestados.json";
	private String bdAtr = "livros-atrasados.json";
	
	public void abrirMenu() {
		
		Calendar calendario = Calendar.getInstance();
		int diaDoAno = calendario.get(Calendar.DAY_OF_YEAR);
		
		int i = 0;
		
		do {
			System.out.println("\n## Menu Emprestimo ##"+
                               "\n1 - Retirar livros" +
	                           "\n2 - Devolver livros" + 
	                           "\n3 - Renovar livros" +
	                           "\n4 - Consultar multa" + 
	                           "\n5 - Quitar multa" + 
	                           "\n0 - Sair.");
			
            System.out.println("Informe uma opcao:");
			
			int opcao = 9;	
			
			try{
				opcao = Integer.parseInt(sc.next());
				sc.nextLine();
			}catch(Exception e){
				System.out.print("");
	     	}
			
			switch(opcao) {
			
			case 1:
				System.out.println("Informe o id do usuário: ");
				int idUsuarioRetirada;
				try{
					idUsuarioRetirada = Integer.parseInt(sc.next());
					Usuario usuario = controleBiblioteca.buscarUsuarioId(idUsuarioRetirada, bdUsuarios);
					boolean retiradaOk = false;

					System.out.println("Informe a quantidade de livros a serem retirados: ");
					int numLivrosRetirada = sc.nextInt();
					int x = 0;
					while(x < numLivrosRetirada) {
						System.out.println("Informe a id do livro: ");
						int idRetirada = sc.nextInt();
						Livro livro = controleBiblioteca.buscarLivroId(idRetirada, bdBiblioteca);

						retiradaOk = controleEmprestimo.emprestarLivro(livro, usuario, bdBiblioteca, bdEmp, bdUsuarios, diaDoAno);

						if(retiradaOk) {
							System.out.println("Livro retirado!");
						}else {
							System.out.println("Não é possível retirar o livro.");
						}

						x++;
					}
				}catch(Exception e){
					System.out.print("Erro! Informe novamente o id do usuario");

				}

				break;
				
			case 2:
				System.out.println("Informe o id do usuário: ");
				int idUsuarioDevolucao;
				try{
					idUsuarioDevolucao = Integer.parseInt(sc.next());
					Usuario usuarioDevolucao = controleBiblioteca.buscarUsuarioId(idUsuarioDevolucao, bdUsuarios);

					System.out.println("Informe a quantidade de livros a serem devolvidos: ");
					int numLivrosDevolucao = sc.nextInt();
					for(int y = 0; y < numLivrosDevolucao; y++) {
						System.out.println("Informe a id do livro: ");
						int idDevolucao = sc.nextInt();
						Livro livroDevolucao = controleBiblioteca.buscarLivroId(idDevolucao, bdBiblioteca);
						if(livroDevolucao.isLocado()) {
							controleEmprestimo.devolverLivro(livroDevolucao, usuarioDevolucao, bdBiblioteca, bdEmp, bdUsuarios, bdAtr);
							System.out.println("Livro devolvido!");

						}else{
							System.out.println("Livro não locado.");
						}
					}
				}catch(Exception e) {
					System.out.print("Erro! Informe novamente o id do usuario");
				}

				break;
			
			case 3:
				System.out.println("Informe o id do usuário: ");
				int idUsuarioRenovacao;
				try{
					idUsuarioRenovacao = Integer.parseInt(sc.next());
					Usuario usuarioRenovacao = controleBiblioteca.buscarUsuarioId(idUsuarioRenovacao, bdUsuarios);
			        
					boolean renovacaoOk = false;
					
					System.out.println("Informe a quantidade de livros a serem retirados: ");
					int numLivrosRenovacao = sc.nextInt();
					for (int l = 0; l < numLivrosRenovacao; l++) {
						System.out.println("Informe a id do livro: ");
						int idRenovacao = sc.nextInt();
						Livro livroRenovacao = controleBiblioteca.buscarLivroId(idRenovacao, bdBiblioteca);
						renovacaoOk = controleEmprestimo.renovarLivro(livroRenovacao, usuarioRenovacao, bdBiblioteca, diaDoAno);
						if(renovacaoOk) {
							System.out.println("Livro renovado!");
						}else {
							System.out.println("Não é possível renovar o livro.");
						}
					}
		     	} catch (Exception e) {
				     System.out.println("Erro! Informe novamente o id do usuario.");
			    }
			    break;
			
			case 4:
				System.out.println("Informe o id do usuário: ");
				int idConsultaMulta = sc.nextInt();
				System.out.println("Multa: " + controleBiblioteca.buscarUsuarioId(idConsultaMulta, bdUsuarios).getMulta());
				break;
			
			case 5:
				System.out.println("Informe o id do usuário: ");
				int idQuitacaoMulta = sc.nextInt();
				
				try {
					idQuitacaoMulta = Integer.parseInt(sc.next());
					Usuario usuarioQuitacao = controleBiblioteca.buscarUsuarioId(idQuitacaoMulta, bdUsuarios);
					
					controleEmprestimo.quitarMulta(usuarioQuitacao, bdAtr, bdUsuarios);
					System.out.println("Multa quitada.");
				}catch (Exception e) {
				     System.out.println("Erro! Informe novamente o id do usuario.");
			    }
			    break;
			
			case 0:
				i++;
				break;
				
			default:
				System.out.println("Opção inexistente.");
			    
     	} 
	} while (i == 0);
	
}
}