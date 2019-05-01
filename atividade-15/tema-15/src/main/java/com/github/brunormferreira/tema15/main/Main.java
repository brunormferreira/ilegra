package com.github.brunormferreira.tema15.main;

public class Main {
	
	public static void main(String[] args) {	
		NotificationHandler sms = new SmsHandler(null);
		NotificationHandler email = new EmailHandler(sms);
		NotificationHandler fax = new FaxHandler(email);
		Request pedido = new Request("Oi", "sms");
		System.out.println(fax.processaPedido(pedido));
	}

}