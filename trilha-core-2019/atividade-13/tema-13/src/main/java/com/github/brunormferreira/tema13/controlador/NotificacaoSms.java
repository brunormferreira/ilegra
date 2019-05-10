package com.github.brunormferreira.tema13.controlador;

public class NotificacaoSms implements NotificacaoStrategy {

	public String criarNotificacao(String mensagem) {
		return mensagem + " atraves de sms.";
	}

}
