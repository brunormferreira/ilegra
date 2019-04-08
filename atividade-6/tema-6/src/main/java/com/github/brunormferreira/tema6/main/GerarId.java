package com.github.brunormferreira.tema6.main;

public class GerarId {
	
	private static int contadorId = 0;
	
	public int gerar() {
	    contadorId++;
		return contadorId;
	}
}
