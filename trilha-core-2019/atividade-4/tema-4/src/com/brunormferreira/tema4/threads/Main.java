package com.brunormferreira.tema4.threads;

public class Main {

	public static void main(String[] args) {
		
         // criando o objeto
		ImprimeValorImpar imprimevalorimpar = new ImprimeValorImpar();
		ImprimeValorPar imprimeValorPar = new ImprimeValorPar();
		
        // criando as threads
		Thread threadImpar = new Thread(imprimevalorimpar);
		Thread threadPar = new Thread(imprimeValorPar);
		
        // startando as threads
		threadImpar.start();
		threadPar.start();
	}
}
	