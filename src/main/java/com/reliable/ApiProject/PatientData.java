package com.reliable.ApiProject;

import java.util.ArrayList;
import java.util.List;

public class PatientData {
	
	//ArrayList to store the patient details
	 private List<Patients> patient;

	    private static PatientData instance = null;
	    public static PatientData getInstance(){
	         if(instance == null){
	             instance = new PatientData();
	         }
	         return instance;
	    }
	    
	  //Adding the patient data to the ArrayList
	    public PatientData(){
	        patient = new ArrayList<Patients>();
	        patient.add(new Patients(293, "Derek",  "Leonard", 19920317));
	        patient.add(new Patients(18, "Candice",  "Reilly", 19830210));
	        patient.add(new Patients(375, "Noreen",  "Dunbar", 19760802));
	        patient.add(new Patients(193, "Cecil",  "Richards", 19561011));
	                 
	    }
	    
	 // return all patients
	    public List<Patients> fetchPatients() {
	        return patient;
	    }

	    // return patients by id
	    public Patients getPatientById(int id) {
	    	
	    	boolean found = false;
	        for(Patients b: patient) {
	            if(b.getId() == id) {
	            	found = true;
	                return b;
	            }
	            
	            	
	            }
	        //Handle Exception when the given Patient ID is not found
	        if(!found){
	        	throw new PatientNotFoundException("Requested Patient Details Not Found!");
	        }
	        return null;
	    }
	    
	    
}
