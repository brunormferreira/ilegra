package com.github.brunormferreira.tema7.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class ControleDAO {
	
	public void escreverUsuario(List<Usuario> listaUsuario, String fileName) {
		
		Gson gson = new Gson(); 
		
		try {
			FileWriter fileJson = new FileWriter (fileName, false);
			for (Usuario usuario : listaUsuario) {
				String usuariosJson = gson.toJson(usuario);
				fileJson.write(usuariosJson + "\n");
			}
			fileJson.close();
		} catch(Exception e) {
		  	e.printStackTrace();
		}
	}
	
	public void escreverLivro(List<Livro> listaLivros, String fileName) { 
		
		Gson gson = new Gson();
		
	    try {
		    FileWriter fileJson = new FileWriter(fileName, false);
	      	for(Livro livro : listaLivros) {
			    String livrosJson = gson.toJson(livro);		
			    fileJson.write(livrosJson + "\n");
		}
	     	fileJson.close();		
    	} catch(Exception e) {
		    e.printStackTrace();
	    }
    }
	
	public void deletarArquivo(String fileName) {
		File file = new File(fileName);
		file.delete();
	}
	        
	public List<Livro> lerLivros(String fileName) {
		
		Gson gson = new Gson();
		BufferedReader readerJson;
		
		
		return null;	
	}
}

