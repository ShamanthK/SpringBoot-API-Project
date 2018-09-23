package com.reliable.ApiProject;

import org.hamcrest.Matchers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;



@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTesting {
	
	private MockMvc mockMvc;
	
	@Mock
    private Patients patientInfo;

    @InjectMocks
    private ProjectController projectController;
    
    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(projectController)
                .build();
    }

    //JUnit Test to check if the service for Patient data is giving an OK response and to check if the content is not empty
    @Test
    public void testPatients() throws Exception {

        
    	

       mockMvc.perform(get("/patients"))
        		
                .andExpect(status().isOk())
                .andExpect(content().string("  "));
                
        		
        		
        		

    }
    
    
    //JUnit Test to test the Patient data being sent through the REST service
    @Test
    public void testPatientData() throws Exception {
    	
    	  mockMvc.perform(get("/patients").accept(MediaType.APPLICATION_JSON))
    	  .andExpect(jsonPath("$.*", Matchers.hasSize(4)))
    	  .andExpect(jsonPath("$[0].id",Matchers.is("100")));
    }
    
  //JUnit Test to check if the service for Visit data is giving an OK response and to check if the content is not empty
    @Test
    public void testVisits() throws Exception {

        

        mockMvc.perform(get("/visits"))
                .andExpect(status().isOk())
                .andExpect(content().string("  "));
                

    }
    
  //JUnit Test to test the Visit data being sent through the REST service
    @Test
    public void testVisitData() throws Exception {
    	
    	  mockMvc.perform(get("/visits").accept(MediaType.APPLICATION_JSON))
    	  .andExpect(jsonPath("$.*", Matchers.hasSize(28)))
    	  .andExpect(jsonPath("$[0].id",Matchers.is("100")));
    }
}

    