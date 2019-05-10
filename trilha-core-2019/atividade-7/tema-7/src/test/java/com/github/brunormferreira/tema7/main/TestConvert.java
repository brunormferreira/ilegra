package com.github.brunormferreira.tema7.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvert {
	
	@Test
	public void testConvertArabicToRoman0() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(1);
		assertEquals("I", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman1() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(4);
		assertEquals("IV", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman2() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(9);
		assertEquals("IX", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman3() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(10);
		assertEquals("X", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman4() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(11);
		assertEquals("XI", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman5() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(15);
		assertEquals("XV", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman6() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(17);
		assertEquals("XVII", resultConvertArabic);		
	}
	
	@Test
	public void testConvertArabicToRoman7() throws InvalidValorException {
		Convert convertArabic = new Convert();
		String resultConvertArabic = convertArabic.convertArabicToRoman(20);
		assertEquals("XX", resultConvertArabic);		
	}
	
	@Test
	public void testConvertRomanToArabic0() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("II");
		assertEquals(2, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic1() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("IV");
		assertEquals(4, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic2() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("IX");
		assertEquals(9, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic3() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("X");
		assertEquals(10, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic4() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("XII");
		assertEquals(12, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic5() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("XVII");
		assertEquals(17, resultConvertRoman);		
	}
	
	@Test
	public void testConvertRomanToArabic6() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("XIX");
		assertEquals(19, resultConvertRoman);		
	}

	@Test
	public void testConvertRomanToArabic7() {
		Convert convertRoman = new Convert();
		int resultConvertRoman = convertRoman.convertRomanToArabic("XX");
		assertEquals(20, resultConvertRoman);		
	}
	
}

