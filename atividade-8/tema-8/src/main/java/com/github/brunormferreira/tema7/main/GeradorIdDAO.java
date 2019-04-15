package com.github.brunormferreira.tema7.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorIdDAO {
	
	public void salvarIdLivro(int id) {
		
		try {
			FileWriter fileId = new FileWriter("idLivro.txt");
			fileId.write(id);
			fileId.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public int getIdLivro() {
		
		try {
			FileReader fileId = new FileReader("idLivro.txt");
			int idLivro = fileId.read();
			fileId.close();
			return idLivro;
		} catch(FileNotFoundException e) {		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void salvarIdUsuario(int id) {
		
		try {
			FileWriter fileId = new FileWriter("idUsuario.txt");
			fileId.write(id);
			fileId.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getIdUsuario() {
		
		try {
			FileReader fileId = new FileReader("idUsuario.txt");
			int idUsuario = fileId.read();
			fileId.close();
			return idUsuario;
		} catch(FileNotFoundException e) {		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
