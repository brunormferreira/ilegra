package com.github.brunormferreira.tema13.visao;

import com.github.brunormferreira.tema13.controlador.ControleNotificacao;
import com.github.brunormferreira.tema13.controlador.NotificacaoEmail;
import com.github.brunormferreira.tema13.controlador.NotificacaoSms;
import com.github.brunormferreira.tema13.modelo.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente clienteSemTelefone = new Cliente("Bruno", "bruno.ramires@ilegra.com");
		Cliente clienteComTelefone = new Cliente("Igor", "96627572", "lambda@gmail.com");

		ControleNotificacao controleNotificacao = new ControleNotificacao(new NotificacaoEmail());
		System.out.println(controleNotificacao.enviarMensagem(clienteSemTelefone));

		controleNotificacao = new ControleNotificacao(new NotificacaoSms());
		System.out.println(controleNotificacao.enviarMensagem(clienteComTelefone));
	}

}
