package com.github.brunormferreira.tema15.main;

public class SmsHandler extends NotificationHandler {
	
	public SmsHandler(NotificationHandler proximo) {
		super(proximo);
	}

	@Override
	public String processaPedido(Request pedido) {
		if (pedido.getTipoDeEnvio().equals("sms")) {
			return ("SMS processado: \n" + "Mensagem: " + pedido.getMensagem());
		} else {
			return chamaProximo(pedido);
		}
	}
}