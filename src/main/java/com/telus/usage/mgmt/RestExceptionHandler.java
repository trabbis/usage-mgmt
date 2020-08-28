package com.telus.usage.mgmt;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.telus.usage.mgmt.exceptions.ConvertorException;

//@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler({ ConvertorException.class })
    protected ResponseEntity<Object> convertionFailed(Exception ex, WebRequest request) {
    	
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex, request);
        apiError.setMessage(ex.getMessage());
        
        return buildResponseEntity(apiError);
        
//        return handleExceptionInternal(ex, "error happend", 
//          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
        
    }
 
    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getError());
    }
    
    
    
}