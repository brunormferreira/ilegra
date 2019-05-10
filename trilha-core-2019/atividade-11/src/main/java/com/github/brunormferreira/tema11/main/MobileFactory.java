package com.github.brunormferreira.tema11.main;

public class MobileFactory {
	
	public Mobile ligarCelular(String nomeCelular) {
		switch (nomeCelular) {
		case "Sony":
			return new Sony();
		
		case "Iphone":
			return new Iphone();
			
		case "Samsung":
			return new Samsung();
			
		default:
			throw new RuntimeException("O nome do celular inserido é inválido!");
		}
		
	}

}
