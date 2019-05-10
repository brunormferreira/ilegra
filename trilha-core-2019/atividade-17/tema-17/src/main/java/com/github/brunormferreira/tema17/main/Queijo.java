package com.github.brunormferreira.tema17.main;

public class Queijo extends Montagem{
	public Queijo(Pizza pizza) {
		super(pizza);
	}
	
	private String sabor() {
		return " + queijo extra";
	}

	@Override
	public double montar() {
		return super.montar() + 3.0;
	}
	
	@Override
	public String descricao() {
		return super.descricao() + sabor();
	}
}
