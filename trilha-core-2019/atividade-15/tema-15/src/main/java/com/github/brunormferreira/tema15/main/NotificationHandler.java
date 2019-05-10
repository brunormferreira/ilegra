package com.github.brunormferreira.tema15.main;

public abstract class NotificationHandler {
	
	private NotificationHandler proximoHandler;

	public NotificationHandler(NotificationHandler proximo) {
		this.proximoHandler = proximo;
	}

	public abstract String processaPedido(Request pedido);

	public String chamaProximo(Request pedido) {
		return this.proximoHandler.processaPedido(pedido);
	}

}
