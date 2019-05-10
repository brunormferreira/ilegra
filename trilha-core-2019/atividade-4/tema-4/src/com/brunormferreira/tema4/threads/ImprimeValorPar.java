package com.brunormferreira.tema4.threads;

public class ImprimeValorPar implements Runnable {

	public void run() {
		GeradorNumerico numeroGerado = new GeradorNumerico();
		try {
			while (true) {
				System.out.println("(Thread B) PAR : " + numeroGerado.gerarPar());
				Thread.sleep(500);
			}
		} catch (InterruptedException ex) {
			System.out.println("Interrupcao!");
		}
	}
}
