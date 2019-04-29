package com.github.brunormferreira.tema13.controlador;

public class NotificacaoEmail implements NotificacaoStrategy{
	
	public String criarNotificacao(String mensagem) {
		return mensagem + " através do e-mail.";
	}
}
