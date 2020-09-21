package com.telus.mediation.usage.tmf635.exception;

public class ValidationException extends Exception {

	private static final long serialVersionUID = 1L;
	
    public ValidationException(String errorMessage) {
        super(errorMessage);
    }
	
}
