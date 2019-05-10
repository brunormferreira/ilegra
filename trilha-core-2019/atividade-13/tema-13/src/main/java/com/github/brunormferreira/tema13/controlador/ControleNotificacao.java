package com.github.brunormferreira.tema13.controlador;

import com.github.brunormferreira.tema13.modelo.Cliente;
import com.github.brunormferreira.tema13.modelo.Mensagem;

public class ControleNotificacao {
	
	private NotificacaoStrategy notificacao;
	private Mensagem mensagem = new Mensagem();

    public ControleNotificacao(NotificacaoStrategy notificacao){
        this.notificacao = notificacao;
    }

	public String enviarMensagem(Cliente cliente){
		return notificacao.criarNotificacao(mensagem.criarMensagem(cliente));
	}

}
