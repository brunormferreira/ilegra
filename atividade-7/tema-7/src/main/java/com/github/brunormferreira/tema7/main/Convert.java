package com.github.brunormferreira.tema7.main;

public class Convert {
	
	
		public String convertArabicToRoman(int arabic) {
			
		    	if (arabic < 1 || arabic > 20)
			    return "Invalid valor!\n";
			
			String roman = "";
			while (arabic >= 10) {
				roman += "X";
				arabic -= 10;
			}	
			while (arabic >= 9) {
				roman += "IV";
				arabic -= 9;
			}
				
			while (arabic >= 5) {
				roman += "V";
				arabic -= 9;
			}
			
			while (arabic >= 4) {
				roman += "IV";
				arabic -= 4;
			}
				
			while (arabic >= 1) {
				roman += "IV";
				arabic -= 1;
			}
			return roman;
		}	
		
		public int convertRomanToArabic(String roman) {
			
			int arabic = 0;
			int indexSub = 0;
			
			try {
				while (roman.charAt(indexSub) == 'X') {
					indexSub++;
					arabic += 10;
				}
				
				while (roman.substring(indexSub, indexSub+2).equals("IX")) {
					indexSub += 2;
				    arabic += 9;
				}
				
				while (roman.charAt(indexSub) == 'V') {
					System.out.println("testando");
					indexSub++;
					arabic += 5;
				}
				
				while (roman.substring(indexSub, indexSub+2).equals("IV")) {
					indexSub += 2;
					arabic += 4;
					
				}
				
				while (roman.charAt(indexSub) == 'I') {
					indexSub++;
					arabic += 1;
				}	
			} catch (IndexOutOfBoundsException e) {
			
		}
		return arabic;			
	}
		
}
