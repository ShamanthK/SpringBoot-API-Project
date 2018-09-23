package com.reliable.ApiProject;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class ExceptionController extends ResponseEntityExceptionHandler {

	 @ExceptionHandler(Exception.class)
	  public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }

	 //Exception which handles the error when a Patient with the given ID is not found
	  @ExceptionHandler(PatientNotFoundException.class)
	  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(PatientNotFoundException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails("Patient Not Found!",ex.getMessage()
	        );
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }
	  
	//Exception which handles the error when a Visit with the given ID is not found
	  @ExceptionHandler(VisitNotFoundException.class)
	  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(VisitNotFoundException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(),
	        "Visit Not Found!");
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }
	  
}
