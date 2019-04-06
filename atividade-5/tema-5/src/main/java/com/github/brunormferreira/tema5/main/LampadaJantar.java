package com.github.brunormferreira.tema5.main;

public class LampadaJantar implements Lampada {

	@Override
	public void liga() {
		System.out.println("A lampada da sala de jantar está ligada.");
		
	}

	@Override
	public void desliga() {
		System.out.println("A lampada da sala de jantar está desligada.");
	
	}	
	
}
