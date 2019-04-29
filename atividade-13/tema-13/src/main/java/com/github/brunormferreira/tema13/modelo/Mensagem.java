package com.github.brunormferreira.tema13.modelo;

public class Mensagem {
	
	public String criarMensagem(Cliente cliente) {
		return "Olá " + cliente.getNome();
	}
}
