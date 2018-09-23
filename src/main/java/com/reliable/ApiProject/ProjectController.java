package com.reliable.ApiProject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Map;

@RestController
public class ProjectController {
	
	PatientData patientData = PatientData.getInstance();
	VisitData visitData = VisitData.getInstance();
	
	//Get Method to get the list of all the Patients at the given URL
	@GetMapping("/patients")
    public List<Patients> index(){
        return patientData.fetchPatients();
    }
	
	//Get Method to get the list of Patients by ID at the given URL
    @GetMapping("/patients/{id}")
    public Patients show(@PathVariable String id){
        int patientId = Integer.parseInt(id);
        return patientData.getPatientById(patientId);
    }
    
  //Get Method to get the list of all the Visits at the given URL
    @GetMapping("/visits")
    public List<Visits> view(){
        return visitData.fetchVisits();
    }

  //Get Method to get the list of Visits by ID at the given URL
    @GetMapping("/visits/{id}")
    public Visits display(@PathVariable String id){
        int visitId = Integer.parseInt(id);
        return visitData.getVisitById(visitId);
    }

}

