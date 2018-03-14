package com.blog.library.Exceptions;

public class InvalidUserException extends RuntimeException {

	public InvalidUserException(String string) {
		super(string);
	}

	public InvalidUserException() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
