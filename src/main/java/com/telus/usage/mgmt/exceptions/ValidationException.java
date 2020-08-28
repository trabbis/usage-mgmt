package com.telus.usage.mgmt.exceptions;

public class ValidationException extends Exception {

	private static final long serialVersionUID = 1L;
	
    public ValidationException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

	
	
}
