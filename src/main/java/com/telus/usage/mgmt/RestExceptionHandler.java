package com.telus.usage.mgmt;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.telus.usage.mgmt.exceptions.ConvertorException;

//TODO The limitation is that default handling is gone.
//@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
 
//    //@Validate For Validating Path Variables and Request Parameters
//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<Object> constraintViolationException(HttpServletResponse response) throws IOException {
//       // response.sendError(HttpStatus.BAD_REQUEST.value());
//
//        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
//        return buildResponseEntity(apiError);
//        
//    }
    
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