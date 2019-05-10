package com.github.brunormferreira.tema5.main;

public class Main {
	public static void main(String[] args) {
		   Lampada lampadaJantar = new LampadaJantar();
		   Interruptor interruptor = new Interruptor(lampadaJantar);
		   System.out.println("Lampada da sala de jantar desligada.");
		   interruptor.trocar();
		   
		   
           Lampada lampadaAlmo�o = new LampadaAlmo�o();
		   interruptor = new Interruptor(lampadaAlmo�o);
		   System.out.println("Interruptor trocou para a lampada da sala de almo�o.");
		   System.out.println("Lampada da sala de almo�o desligada.");
		   interruptor.trocar();
		
	}

}