package com.github.brunormferreira.tema15.main;

public class FaxHandler extends NotificationHandler {
	
	public FaxHandler(NotificationHandler proximo) {
		super(proximo);
	}

	@Override
	public String processaPedido(Request pedido) {
		if (pedido.getTipoDeEnvio().equals("fax")) {
			return ("FAX processado: \n" + "Mensagem: " + pedido.getMensagem());
		} else {
			return chamaProximo(pedido);
		}
	}
}