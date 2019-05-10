package com.github.brunormferreira.tema15.main;

public class EmailHandler extends NotificationHandler {

	public EmailHandler(NotificationHandler proximo) {
		super(proximo);
	}

	@Override
	public String processaPedido(Request pedido) {
		if (pedido.getTipoDeEnvio().equals("email")) {
			return ("EMAIL processado: \n" + "Mensagem: " + pedido.getMensagem());
		} else {
			return chamaProximo(pedido);
		}
	}
}