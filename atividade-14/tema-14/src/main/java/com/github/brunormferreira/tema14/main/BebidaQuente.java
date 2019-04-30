package com.github.brunormferreira.tema14.main;

public abstract class BebidaQuente {

	public abstract String prepararBebida();

	public abstract String servirBebida();

	public final String entregarBebida() {
		return ("Sua bebida esta pronta para ser entregue!");
	}

	public final void venderBebida() {
		prepararBebida();
		servirBebida();
		entregarBebida();
	}

}
