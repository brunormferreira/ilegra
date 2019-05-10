package com.github.brunormferreira.tema14.main;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BebidaQuenteTest {

	@Test
	public void testPrepararCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.prepararBebida().contains("Preparando o cafe!"));
	}

	@Test
	public void testServirCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.servirBebida().contains("Servindo o cafe!"));
	}

	@Test
	public void testEntregaCafe() {
		Cafe cafe = new Cafe();
		assertTrue(cafe.entregarBebida().contains("Sua bebida esta pronta para ser entregue!"));
	}

	@Test
	public void testPrepararMocaccino() {
		Mocaccino mocaccino = new Mocaccino();
		assertTrue(mocaccino.prepararBebida().contains("Preparando o mocaccino!"));
	}

	@Test
	public void testServirMocaccino() {
		Mocaccino mocaccino = new Mocaccino();
		assertTrue(mocaccino.servirBebida().contains("Servindo o mocaccino!"));
	}

	@Test
	public void testEntregaMocaccino() {
		Mocaccino mocaccino = new Mocaccino();
		assertTrue(mocaccino.entregarBebida().contains("Sua bebida esta pronta para ser entregue!"));
	}

}

