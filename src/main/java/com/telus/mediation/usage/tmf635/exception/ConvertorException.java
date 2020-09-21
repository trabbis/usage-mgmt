package com.telus.mediation.usage.tmf635.exception;

public class ConvertorException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ConvertorException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	
	

}
