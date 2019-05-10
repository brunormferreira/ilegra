package com.github.brunormferreira.tema5.main;

public class Interruptor {
	
	private Lampada lampada;
	private boolean ligada;

	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
		ligada = false;
	}
	
	public void trocar() {
		if(this.ligada) {
			     this.lampada.desliga();
			     this.ligada = false;
		} else {
			     this.ligada = true;
			     this.lampada.liga();
		}
		
	}
	
	public boolean estaLigada() {
		return ligada;
	}	
		
}