package com.github.brunormferreira.tema8.main;

import java.util.Calendar;

public class Livro {
	
	private static final int LIMITE_DIAS = 7;
	private int id;
	private String titulo;
	private String autor;
	private boolean locado;
	private int usuarioLivro;
	private int diaLocacao = 0;
	
	public Livro (String titulo, String autor, int id) {
		this.titulo = titulo;
		this.autor = autor;
		this.id = id;
		this.setLocado(false);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isLocado() {
		return locado;
	}

	public void setLocado(boolean locado) {
		this.locado = locado;
	}

	public int getUsuarioLivro() {
		return usuarioLivro;
	}

	public void setUsuarioLivro(int usuarioLivro) {
		this.usuarioLivro = usuarioLivro;
	}

	public int getDiaLocacao() {
		return diaLocacao;
	}

	public void setDiaLocacao(int diaLocacao) {
		this.diaLocacao = diaLocacao;
	}
	
	public int getDiasLocado() {
		Calendar calendario = Calendar.getInstance();
		int diaDoAno = calendario.get(Calendar.DAY_OF_YEAR); 
		int diasLocados = diaDoAno - diaLocacao;
		return diasLocados;
	}
	
	public int getLIMITE_DIAS() {
		return LIMITE_DIAS;
	}
}
	
