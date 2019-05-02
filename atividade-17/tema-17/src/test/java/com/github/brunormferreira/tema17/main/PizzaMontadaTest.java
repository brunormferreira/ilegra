package com.github.brunormferreira.tema17.main;

import org.junit.Assert;
import org.junit.Test;

public class PizzaMontadaTest {
	
	@Test
	public void testMontarPizzaComQueijo() {
		Pizza queijo = new Queijo(new PizzaMontada());
		Assert.assertEquals(23.00, queijo.montar(), 0);
	}

	@Test
	public void testMontarPizzaComBacon() {
		Pizza bacon = new Bacon(new PizzaMontada());
		Assert.assertEquals(23.50, bacon.montar(), 0);
	}
	
	@Test
	public void testMontarPizzaComBaconEQueijo() {
		Pizza baconQueijo = new Bacon(new Queijo(new PizzaMontada()));
		Assert.assertEquals(26.50, baconQueijo.montar(), 0);
	}
}
