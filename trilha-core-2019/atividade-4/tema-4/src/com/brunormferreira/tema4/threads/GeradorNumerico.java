package com.brunormferreira.tema4.threads;

import java.util.Random;

public class GeradorNumerico {
	
	private Random gerarNumeroAleatorio = new Random();

	public int gerarPar() {
		int num = gerarNumeroAleatorio.nextInt(50);
		if (num % 2 == 0) {
			return num;
		} else {
			return gerarPar();
		}
	}

	public int gerarImpar() {
		int num = gerarNumeroAleatorio.nextInt(50);
		if (num % 2 != 0) {
			return num;
		} else {
			return gerarImpar();
		}
	}
	

}
