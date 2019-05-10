package com.github.brunormferreira.tema12.main;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNasc;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
