package com.github.brunormferreira.tema16.main;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private int saldo;
	private List<Operacao> operacoes = new ArrayList<Operacao>();

	public void receberOperacao(Operacao solicitacao) {
		operacoes.add(solicitacao);
	}

	public int consultarSaldo() {
		for (Operacao operacao : operacoes) {
			saldo += operacao.executar();
		}
		return saldo;
	}
}
