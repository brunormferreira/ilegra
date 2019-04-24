package com.github.brunormferreira.tema11.main;

import static org.junit.Assert.*;
import org.junit.Test;

public class MobileFactoryTest {
	
	private MobileFactory mobileFactory = new MobileFactory();
	
	@Test
	public void ligarCelularSonyTest() {		
		System.out.println("----- Teste para ligar o celular Sony. -----");
		Mobile mobile = mobileFactory.ligarCelular("Sony");
		assertTrue(mobile instanceof Sony);		
	}
	
	@Test
	public void ligarCelularIphoneTest() {		
		System.out.println("----- Teste para ligar o celular Iphone. -----");
		Mobile mobile = mobileFactory.ligarCelular("Iphone");
		assertTrue(mobile instanceof Iphone);		
	}
	
	@Test
	public void ligarCelularSamsungTest() {		
		System.out.println("----- Teste para ligar o celular Samsung. -----");
		Mobile mobile = mobileFactory.ligarCelular("Samsung");
		assertTrue(mobile instanceof Samsung);		
	}

	@Test (expected = RuntimeException.class)
	public void ligarCelularErrorTest() {		
		System.out.println("----- Teste para verificar a exceção de erro. -----");
		mobileFactory.ligarCelular("Motorola");
	}
}
