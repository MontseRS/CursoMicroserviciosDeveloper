package com.proa.app.exceptions;

public class OrderNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	// 1L = Identificador long, que nos permite conevrtir un objeto en un grupo de
	// bits, para identificar a que objeto o clase perteneces, cuando eres un grupo
	// de bits

	public OrderNotFoundException(String message) {
		super(message);
	}
}
