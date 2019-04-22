package com.github.brunormferreira.tema10.main;

import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	private ContatoDAO contato = new ContatoDAO();
	
	public void abrirMenu() {
		
		while(true) {
			System.out.println("\nEscolha alguma opcao!" +
		                       "\n[1] - Adicionar um contato." +
		                       "\n[2] - Listar todos contatos." +
		                       "\n[3] - Buscar um contato pelo nome." +
		                       "\n[4] - Buscar um contato pela id." +
		                       "\n[5] - Remover um contato." +
		                       "\n[6] - Listar e ordenar por nome." +
		                       "\n[7] - Listar e ordenar por ID." +
		                       "\n[0] - Sair");
			
			int opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				adicionarContatos();
				break;
				
			case 2:
				listarContatos();
				break;
				
			case 3:	
				buscarContatoPorNome();
				break;
			
			case 4:
				buscarContatoPorId();
				break;
			
			case 5:
				removerContato();
				break;
				
			case 6:
				ordenarPorNome();
				break;
				
			case 7:
				ordenarPorId();
				break;
				
			case 0:
				System.out.println("###### Programa finalizado #####");
				break;
			
			default:
				System.out.println("Opcao invalida! Digite novamente!");
			}
		}
	}

	public void adicionarContatos() {	
		System.out.println("Informe o nome do contato a ser adicionado: \n");
		String lerNome = sc.next();
		
		System.out.println("Informe o e-mail do contato a ser adicionado: \n");
		String lerEmail = sc.next();
		
		System.out.println("Informe o telefone do contato a ser adicionado: \n");
		String lerTelefone = sc.next();
		
		contato.adicionarContato(new Contato(lerNome, lerEmail, lerTelefone));	
	}
	
	public void listarContatos() {
		System.out.println(contato.listarContato());			
	}

	public void buscarContatoPorNome() {
		System.out.println("Informe o nome do contato: \n");
		String lerNome = sc.nextLine();
		System.out.println(contato.buscarContatoPorNome(lerNome));
	}
	
	public void buscarContatoPorId() {
		System.out.println("Informe o Id do contato: \n");
		int lerId = sc.nextInt();
		System.out.println(contato.buscarContatoPorId(lerId));
	}

	public void removerContato() {
		System.out.println("Informe o Id do contato: \n");
		int lerId = sc.nextInt();
		contato.removerContato(lerId);
		System.out.println("Contato removido com sucesso! \n");
	}
	
	public void ordenarPorNome() {
		List<Contato> contatosPorNome = contato.ordenarContato("nome");
		if (contatosPorNome.size() != 0) {
			for (Contato contato : contatosPorNome) {
				System.out.println(contato.toString());
			}
		} else {
			System.out.println("Contato nao encontrado!");
		}
	}
	
	public void ordenarPorId() {
		List<Contato> contatosPorId = contato.ordenarContato("id");
		if (contatosPorId.size() != 0) {
			for (Contato contatoId : contatosPorId) {
				System.out.println(contatoId.toString());
			}
		} else {
			System.out.println("Contato nao encontrado!");
		}
	}
	
}
