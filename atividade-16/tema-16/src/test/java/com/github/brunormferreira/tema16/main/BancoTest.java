package com.github.brunormferreira.tema16.main;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BancoTest {
	
	private Banco banco;

	@Before
	public void start() {
		banco = new Banco();
	}

	@Test
	public void testSaque() {
		Saque saque = new Saque(400);
		banco.receberOperacao(saque);
		int saldo = banco.consultarSaldo();
		assertEquals(-400, saldo);
	}

	@Test
	public void testDeposito() {
		Deposito deposito = new Deposito(800);
		banco.receberOperacao(deposito);
		int saldo = banco.consultarSaldo();
		assertEquals(800, saldo);
	}

	@Test
	public void testDepositoSaque() {
		Deposito deposito = new Deposito(1500);
		Saque saque = new Saque(600);
		banco.receberOperacao(deposito);
		banco.receberOperacao(saque);
		int saldo = banco.consultarSaldo();
		assertEquals(900, saldo);
	}

}
