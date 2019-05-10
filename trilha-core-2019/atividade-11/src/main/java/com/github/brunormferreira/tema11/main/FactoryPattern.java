package com.github.brunormferreira.tema11.main;

public class FactoryPattern {
	
	public static void main(String[] args) {
		
		MobileFactory factory = new MobileFactory();
		
		Mobile sony = factory.ligarCelular("Sony");
		sony.ligarCelular();
		Mobile iphone = factory.ligarCelular("Iphone");
		iphone.ligarCelular();
		Mobile samsung = factory.ligarCelular("Samsung");
		samsung.ligarCelular();

	}

}
