package com.github.brunormferreira.tema17.main;

public abstract class Montagem implements Pizza{
	private Pizza pizza;
	
	public Montagem(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public double montar() {
		return pizza.montar();
	}
	
	@Override
	public String descricao() {
		return pizza.descricao();
	}	
}