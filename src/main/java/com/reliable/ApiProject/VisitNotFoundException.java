package com.reliable.ApiProject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VisitNotFoundException extends RuntimeException {

	public VisitNotFoundException (String exception) {
	    super(exception);
	  }
}
