package com.github.brunormferreira.tema17.main;

public class Bacon extends Montagem {
	public Bacon(Pizza pizza) {
		super(pizza);
	}
	
	private String sabor() {
		return " + bacon extra";
	}

	@Override
	public double montar() {
		return super.montar() + 3.5;
	}
	
	@Override
	public String descricao() {
		return super.descricao() + sabor();
	}
}
