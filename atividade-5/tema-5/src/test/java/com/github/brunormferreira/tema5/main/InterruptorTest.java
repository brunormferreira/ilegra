package com.github.brunormferreira.tema5.main;

import org.junit.Test;
import static org.junit.Assert.*;

public class InterruptorTest {

	@Test
	public void testeTrocarLampadaJantarDesligada() {
		Lampada lampadaJantar = new LampadaJantar();
		Interruptor interruptor = new Interruptor(lampadaJantar);
		assertFalse(interruptor.estaLigada());
	}
	
	@Test
	public void testeTrocarLampadaJantarLigada() {
		Lampada lampadaJantar = new LampadaJantar();
		Interruptor interruptor = new Interruptor(lampadaJantar);
		interruptor.trocar();
		assertTrue(interruptor.estaLigada());
	}

}
