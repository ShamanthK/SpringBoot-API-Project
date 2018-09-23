package com.reliable.ApiProject;

import java.util.Date;

public class ErrorDetails {
	
	//declare variables to display in the exception
	  private String message;
	  private String details;
	  
	//constructor for the class
	  public ErrorDetails(String details, String message) {
	    super();
	    
	    this.message = message;
	    this.details = details;
	  }

	 
	 //method to get error message
	  public String getMessage() {
	    return message;
	  }

	  //method to get error details
	  public String getDetails() {
	    return details;
	  }

}
