package com.github.brunormferreira.tema17.main;

public class PizzaMontada implements Pizza {
	private double preco = 20.00;
	
	@Override
	public double montar() {
		return preco;
	}

	@Override
	public String descricao() {
		return "Pizza";
	}
}
