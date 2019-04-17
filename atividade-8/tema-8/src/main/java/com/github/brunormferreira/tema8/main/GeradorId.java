package com.github.brunormferreira.tema8.main;

public class GeradorId {
	
	private GeradorIdDAO geradorIdDAO = new GeradorIdDAO();
	private int livroId = 0;
	private int usuarioId = 0;
	
	public int gerarIdLivro() {
		livroId = geradorIdDAO.getIdLivro();
		livroId++;
		geradorIdDAO.salvarIdLivro(livroId);
		return livroId;
	}
	
	public int gerarIdUsuario() {
		usuarioId = geradorIdDAO.getIdUsuario();
		usuarioId++;
		geradorIdDAO.salvarIdUsuario(usuarioId);
		return usuarioId;
	}
}
