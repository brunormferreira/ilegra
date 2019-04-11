package com.github.brunormferreira.tema7.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvert {
	
	@Test
	public void testConvertArabicToRoman() {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(10);
		assertEquals("X", resultConvertArabic);		
	}

	@Test
	public void testConvertRomanToArabic() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("X");
		assertEquals(10, resultConvertRoman);		
	}
	
}
