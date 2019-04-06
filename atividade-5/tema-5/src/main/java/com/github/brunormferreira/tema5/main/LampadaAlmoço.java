package com.github.brunormferreira.tema5.main;

public class LampadaAlmoço implements Lampada {
	
	@Override
	public void liga() {
		System.out.println("A lampada da sala de almoço está ligada.");
		
	}
	
	@Override
	public void desliga() {
		System.out.println("A lampada da sala de almoço está desligada.");
	
	}	
		

}
