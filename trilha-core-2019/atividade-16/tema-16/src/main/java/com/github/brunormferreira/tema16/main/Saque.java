package com.github.brunormferreira.tema16.main;

public class Saque implements Operacao {
	private int valor;

	public Saque(int valor) {
		this.valor -= valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int executar() {
		return valor;
	}
}