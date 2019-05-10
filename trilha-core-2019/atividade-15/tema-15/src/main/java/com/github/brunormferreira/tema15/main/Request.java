package com.github.brunormferreira.tema15.main;

public class Request {
	
	private String mensagem;
	private String tipoDeEnvio;

	public Request(String mensagem, String tipoDeEnvio) {
		this.mensagem = mensagem;
		this.tipoDeEnvio = tipoDeEnvio;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getTipoDeEnvio() {
		return tipoDeEnvio;
	}

	public void setTipoDeEnvio(String tipoDeEnvio) {
		this.tipoDeEnvio = tipoDeEnvio;
	}

}
