package com.github.brunormferreira.tema13.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.brunormferreira.tema13.controlador.*;
import com.github.brunormferreira.tema13.modelo.*;

public class NotificacaoStrategyTest {
	
	private Cliente clienteSemTelefone = new Cliente("Bruno", "bruno.ramires@ilegra.com");
	private Cliente clienteComTelefone = new Cliente("Igor", "96627572", "lambda@gmail.com");
	private ControleNotificacao controleNotificacao;

	@Test
	public void enviarMensagemEmail() {
		controleNotificacao = new ControleNotificacao(new NotificacaoEmail());
		assertEquals("Ola Bruno atraves do e-mail.", controleNotificacao.enviarMensagem(clienteSemTelefone));
	}
	
	@Test
	public void enviarMensagemTelefone() {
		controleNotificacao = new ControleNotificacao(new NotificacaoSms());
		assertEquals("Ola Igor atraves de sms.", controleNotificacao.enviarMensagem(clienteComTelefone));
	}

}
