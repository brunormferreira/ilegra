package com.github.brunormferreira.desafiofinal.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFiles {
	
	private static final String path = "/home/ilegra0111/Documentos/Bruno/BrunoDesafio/In/Test.txt";
	
	public static void main(String[] args) throws IOException {
		lerArquivos();
	}
	
	public static String lerArquivos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String recebe = "";
        while(br.ready()){
           String linha = br.readLine();
            String[] arrayValores = linha.split("\\ç");
            for (String cell : arrayValores) { 
                System.out.print(cell+" "); 
                recebe = cell;
            }
            System.out.println("\n");
        }
        br.close();
        return recebe;
    }
}
