package com.reliable.ApiProject;

public class Patients {
	
	//Define fields for patients data
	private int id;
	private String firstName;
	private String lastName;
	private int dob;
	
	public Patients() {}
	
	//Constructor for the Class Patients
	public Patients(int id, String firstName, String lastName, int dob)
	{
		
		this.setId(id);
		this.setFirst(firstName);
		this.setLast(lastName);
		this.setDob(dob);
	}
	
	//Getter and Setter methods for the different fields of Patients data
	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirst() {
	        return firstName;
	    }

	    public void setFirst(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLast() {
	        return lastName;
	    }

	    public void setLast(String lastName) {
	        this.lastName = lastName;
	    }
	    
	    public int getDob() {
	        return dob;
	    }

	    public void setDob(int dob) {
	        this.dob = dob;
	    }
	    
	    
	   

}


