package com.github.brunormferreira.tema15.main;

import org.junit.Assert;
import org.junit.Test;

public class NotificationHandlerTest {
	
	@Test
	public void TestNotificacaoSMS() {
		Request pedido = new Request("Teste", "sms");
		NotificationHandler sms = new SmsHandler(null);
		NotificationHandler email = new EmailHandler(sms);
		NotificationHandler fax = new FaxHandler(email);
		Assert.assertTrue(fax.processaPedido(pedido).contains("SMS"));
	}

	@Test
	public void TestNotificacaoEmail() {
		Request pedido = new Request("Teste", "email");
		NotificationHandler sms = new SmsHandler(null);
		NotificationHandler email = new EmailHandler(sms);
		NotificationHandler fax = new FaxHandler(email);
		Assert.assertTrue(fax.processaPedido(pedido).contains("EMAIL"));
	}

	@Test
	public void TestNotificacaoZap() {
		Request pedido = new Request("Teste", "fax");
		NotificationHandler sms = new SmsHandler(null);
		NotificationHandler email = new EmailHandler(sms);
		NotificationHandler fax = new FaxHandler(email);
		Assert.assertTrue(fax.processaPedido(pedido).contains("FAX"));
	}

	@Test
	public void TestCadeiaDeNotificacao() {
		Request pedidoSms = new Request("Teste", "sms");
		Request pedidoFax = new Request("Teste", "fax");
		Request pedidoEmail = new Request("Teste", "email");
		NotificationHandler sms = new SmsHandler(null);
		NotificationHandler email = new EmailHandler(sms);
		NotificationHandler fax = new FaxHandler(email);
		Assert.assertTrue(fax.processaPedido(pedidoSms).contains("SMS"));
		Assert.assertTrue(fax.processaPedido(pedidoEmail).contains("EMAIL"));
		Assert.assertTrue(fax.processaPedido(pedidoFax).contains("FAX"));
	}
	

}
