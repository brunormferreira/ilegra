package com.github.brunormferreira.tema7.main;

import java.util.Scanner;

public class NumeroRomano {
	
	public static String[] romanos = new String[] {
			"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
			"XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
			
	public static final int[] inteiros = new int[] {
					1, 2, 3, 4, 5, 6, 7, 8,9, 10,
					11, 12, 13, 14, 15, 16, 17, 18, 19, 20};		
	
	public String converterParaRomano(int valor) {
		for(int i = 0; i < 20; i++) {
			if(valor == inteiros[i]) {
		   	   	return romanos[i];                    
				} else {
					System.out.println("Erro na execucao da conversao.");
				}
		 }
	    return null;
    }		

}

    