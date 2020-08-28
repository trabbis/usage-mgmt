package com.telus.usage.mgmt;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;

public class ApiError {

	//	   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	private HttpStatus status;
	private String error;
	private String message;
	private String debugMessage;
	private String path;

	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDebugMessage() {
		return debugMessage;
	}

	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

	private ApiError() {
		timestamp = LocalDateTime.now();
	}

	ApiError(HttpStatus status) {
		this();
		this.status = status;
	}

	ApiError(HttpStatus status, Throwable ex, WebRequest request) {
		this();
		this.status = status;
		this.error = String.valueOf(status.value()); //ex.getStackTrace(); //ex.getCause().toString();
//		this.message = "Unexpected error";
		this.debugMessage = ex.getCause().toString(); //getLocalizedMessage();
		this.path = request.getDescription(false);
		
	}

	ApiError(HttpStatus status, String message, Throwable ex) {
		this();
		this.status = status;
		this.message = message;
		this.debugMessage = ex.getLocalizedMessage();
	}
}
