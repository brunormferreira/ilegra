package com.github.brunormferreira.tema8.main;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		AplicativoBiblioteca aplicativoBiblioteca = new AplicativoBiblioteca();
		AplicativoEmprestimo aplicativoEmprestimo = new AplicativoEmprestimo();
		
		sc = new Scanner(System.in);
		int i = 0;
		
		do {
			System.out.println("## Selecione o aplicativo que deseja utilizar ##" +
                               "\n1 - Aplicativo Biblioteca" + 
                               "\n2 - Aplicativo Emprestimo" + 
                               "\n0 - Sair.");
			
			int opcao = 3;

			try{
				opcao = Integer.parseInt(sc.next());
				sc.nextLine();
			}catch(Exception e){
				System.out.print("");

			}
			
			switch(opcao) {
			
			case 1:
				aplicativoBiblioteca.abrirMenu();
				break;
			
			case 2:
				aplicativoEmprestimo.abrirMenu();
				break;
				
			case 0:
				i++;
				break;
				
			default:
				System.out.println("Opcao inexistente.");			
			}
		} while(i == 0);
		
	}

}
