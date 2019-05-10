package com.github.brunormferreira.tema8.main;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private final int MAX_LIVROS = 5;
	private String nome;
	private boolean atrasado = false;
	private int id;
	private int totalLivrosEmprestados;
	private double multa;
	private int numDiasAtraso;
	private List<Livro> livrosEmprestados = new ArrayList<Livro>();
	
	public Usuario (String nome, int id) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isAtrasado() {
		return atrasado;
	}
	
	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}
	
	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	public int getNumDiasAtraso() {
		return numDiasAtraso;
	}
	
	public void setNumDiasAtraso(int numDiasAtraso) {
		this.numDiasAtraso = numDiasAtraso;
	}
	
	public int getTotalLivrosEmprestados() {
		return totalLivrosEmprestados;
	}
	
	public void setTotalLivrosEmprestados(int totalLivrosEmprestados) {
		this.totalLivrosEmprestados = totalLivrosEmprestados;
	}
	
	public int getLIMITE_LIVROS() {
		return MAX_LIVROS;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	 
	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}
}
