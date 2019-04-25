package com.github.brunormferreira.tema7.main;

public class InvalidValorException extends Exception{

	private static final long serialVersionUID = -3133198440362752911L;

	public InvalidValorException(String errorAlert) {
		super(errorAlert);
	}

	public InvalidValorException(String errorAlert, Throwable cause) {
		super(errorAlert, cause);
	}
	
}