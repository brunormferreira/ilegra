package com.github.brunormferreira.tema16.main;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Saque saque = new Saque(300);
		Deposito deposito = new Deposito(600);

		banco.receberOperacao(saque);
		banco.receberOperacao(deposito);

		int saldo = banco.consultarSaldo();

		System.out.println("Seu saldo final é: " + saldo);
	}
}
