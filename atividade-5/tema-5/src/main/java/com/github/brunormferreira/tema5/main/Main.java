package com.github.brunormferreira.tema5.main;

public class Main {
	public static void main(String[] args) {
		   Lampada lampadaJantar = new LampadaJantar();
		   Interruptor interruptor = new Interruptor(lampadaJantar);
		   System.out.println("Lampada da sala de jantar desligada.");
		   interruptor.trocar();
		   
		   
           Lampada lampadaAlmoço = new LampadaAlmoço();
		   interruptor = new Interruptor(lampadaAlmoço);
		   System.out.println("Interruptor trocou para a lampada da sala de almoço.");
		   System.out.println("Lampada da sala de almoço desligada.");
		   interruptor.trocar();
		
	}

}