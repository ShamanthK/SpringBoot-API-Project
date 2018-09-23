package com.reliable.ApiProject;

import java.util.ArrayList;
import java.util.List;

public class VisitData {
	
	//ArrayList to store Visit data
	 private List<Visits> visit;

	    private static VisitData instance = null;
	    public static VisitData getInstance(){
	         if(instance == null){
	             instance = new VisitData();
	         }
	         return instance;
	    }
	    
	    
	    //Adding all the visit details to the ArrayList
	    public VisitData(){
	        visit = new ArrayList<Visits>();
	        visit.add(new Visits(293, 20001014, 58, 122, 4.82, 128, 60));
	        visit.add(new Visits(293, 20010611, 60, 128, 4.4, 129, 55));
	        visit.add(new Visits(293, 20020415, 62, 135, 4.63, 122, 50));
	        visit.add(new Visits(293, 20041128, 64, 140, 4.77, 124, 58));
	        visit.add(new Visits(293, 20051014, 66, 144, 4.92, 110, 55));
	        visit.add(new Visits(293, 20061110, 67, 146, 4.23, 115, 62));
	        visit.add(new Visits(293, 20080914, 67, 148, 4.1, 120, 63));
	        visit.add(new Visits(293, 20100204, 67, 152, 4.05, 124, 66));
	        visit.add(new Visits(293, 20110115, 68, 149, 4.8, 128, 62));
	        visit.add(new Visits(293, 20120403, 67, 148, 4.28, 135, 60));
	        visit.add(new Visits(293, 20121002, 67, 149, 4.27, 125, 63));
	        visit.add(new Visits(293, 20140115, 67, 150, 4.2, 119, 67));
	        visit.add(new Visits(293, 20150628, 67, 151, 5, 128, 68));
	        visit.add(new Visits(18, 20151104, 68, 177, 5.7, 138, 67));
	        visit.add(new Visits(18, 20161014, 68, 174, 5.8, 140, 65));
	        visit.add(new Visits(18, 20170412, 68, 175, 5.7, 133, 62));
	        visit.add(new Visits(18, 20141015, 68, 176, 5.6, 132, 67));
	        visit.add(new Visits(18, 20150112, 69, 172, 5.2, 137, 65));
	        
	        visit.add(new Visits(375, 20161117, 71, 158, 4.8, 120, 58));
	        visit.add(new Visits(375, 20171012, 0, 0, 0, 119,57));
	        visit.add(new Visits(193, 20121015, 73, 214, 5.9, 139, 66));
	        visit.add(new Visits(193, 20130604, 73, 210, 6.2, 142, 68));
	        visit.add(new Visits(193, 20140326, 73, 211, 6.8, 145, 69));
	        visit.add(new Visits(193, 20150210, 72, 214, 6.9, 144, 70));
	        visit.add(new Visits(193, 20151011, 72, 210, 7, 152, 66));
	        visit.add(new Visits(193, 20161110, 72, 218, 7.2, 136, 62));
	        visit.add(new Visits(193, 20170304, 73, 219, 7.1, 134, 63));
	        visit.add(new Visits(193, 20170406, 73, 219, 7.2, 135, 60));
	                 
	    }
	    
	 // return all visits
	    public List<Visits> fetchVisits() {
	        return visit;
	    }
	    
	    
	    // return visits by id
	    public Visits getVisitById(int id) {
	    	
	    	boolean found = false;
	        for(Visits b: visit)
	        {
	        	
	        	if(b.getId() == id) {
	            	found = true;
	            	
	            	return b;
	                
	            }
	        	//return b;
	            	
	            }
	        
	        //Handling Exception when the given Visit ID is not found
	        if(!found){
	        	throw new VisitNotFoundException("Requested Visit Details Not Found!");
	        }
	        return null;
	    }
}

