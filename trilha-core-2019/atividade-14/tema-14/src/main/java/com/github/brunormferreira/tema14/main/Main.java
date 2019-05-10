package com.github.brunormferreira.tema14.main;

public class Main {

	public static void main(String[] args) {

		BebidaQuente cafe = new Cafe();
		BebidaQuente mocaccino = new Mocaccino();

		cafe.venderBebida();
		mocaccino.venderBebida();
	}

}
