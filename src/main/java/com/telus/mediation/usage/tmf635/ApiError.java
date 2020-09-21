package com.telus.usage.mgmt;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.WebRequest;

public class ApiError {

	//	   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	private String status;
	private HttpStatus error;
	private String message;
	private String rootCause;
	private String path;

	ApiError(HttpStatus error) {
		this();
		this.error = error;
	}

	ApiError(HttpStatus error, Throwable ex, WebRequest request) {
		this();
		this.error = error;
		this.status = String.valueOf(error.value());
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		String sStackTrace = sw.toString();
		this.rootCause = sStackTrace; //DEBUG PURPOSE FOR NOW
//		this.rootCause = ex.getCause().toString(); //getLocalizedMessage(); 
		
		this.path = request.getDescription(false);
		
	}

	ApiError(HttpStatus error, String message, Throwable ex) {
		this();
		this.error = error;
		this.message = message;
		this.rootCause = ex.getLocalizedMessage();
	}
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public HttpStatus getError() {
		return error;
	}

	public void setError(HttpStatus error) {
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	

	public String getRootCause() {
		return rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	private ApiError() {
		timestamp = LocalDateTime.now();
	}

}
