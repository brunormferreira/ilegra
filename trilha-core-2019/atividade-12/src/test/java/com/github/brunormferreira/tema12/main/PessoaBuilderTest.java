package com.github.brunormferreira.tema12.main;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class PessoaBuilderTest {
	
	@Test
	public void PessoaBuilderComNomeTest() {
		
		Pessoa pessoa = new PessoaBuilder().comNome("Bruno Ramires").build();
		assertEquals("Bruno Ramires", pessoa.getNome());
	}
	
	@Test
	public void PessoaBuilderComDataNascTest() {
		
		Pessoa pessoa = new PessoaBuilder().comDataNasc(LocalDate.of(1996, Month.MAY, 6)).build();
		assertEquals(LocalDate.of(1996, Month.MAY, 6), pessoa.getDataNasc());
	}

	@Test
	public void PessoaBuilderComEnderecoTest() {
		
		Pessoa pessoa = new PessoaBuilder().comEndereco("Rua Andre Correa Dutra", 50, "Porto Alegre", "RS").build();
		// fazer
	}
}
