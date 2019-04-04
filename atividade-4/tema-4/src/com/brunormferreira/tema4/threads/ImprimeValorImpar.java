package com.brunormferreira.tema4.threads;

public class ImprimeValorImpar implements Runnable {

	public void run() {
		GeradorNumerico numeroGerado = new GeradorNumerico();
		try {
			while (true) {
				System.out.println("(Thread A) IMPAR : " + numeroGerado.gerarImpar());
				Thread.sleep(100);
			}
		} catch (InterruptedException ex) {
			System.out.println("Interrupcao!");
		}
	}
}