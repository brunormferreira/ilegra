package com.github.brunormferreira.tema7.main;

public class Convert {

	public String convertArabicToRoman(int arabic) throws InvalidValorException {
		if(checkRange(arabic)){
			throw new InvalidValorException("Your value is out of range, please insert other number!\n");
		} 

		String roman = "";
		
		int number = arabic;
		while(number <= 20) {
			if (number >= 10) {
				roman += "X";
				number -= 10;
			}	

			if(number >= 9) {
				roman += "IX";
				number -= 9;
			}

			if (number >= 5) {
				roman += "V";
				number -= 5;
			}

			if (number >= 4) {
				roman += "IV";
				number -= 10;
			}

			if (number >= 1) {
				roman += "I";
				number -= 1;
			}
			
		}return roman;
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
			e.printStackTrace();
			System.out.println("Invalid indexes or empty string");
		}
		return arabic;
	}

	private boolean checkRange(int numero) {
		return numero < 1 || numero > 20;
	}

}
