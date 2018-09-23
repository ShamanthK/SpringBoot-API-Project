package com.reliable.ApiProject;

public class Visits {

	//Declare all the required fields for Visit data
	private int id;
	private int date;
	private int height;
	private int weight;
	private double hac;
	private int bps;
	private int bpd;
	
	
	public Visits() {}
	
	public Visits(int id, int date, int height, int weight, double hac, int bps, int bpd)
	{
		
		this.setId(id);
		this.setDate(date);
		this.setHeight(height);
		this.setWeight(weight);
		this.setHac(hac);
		this.setBPS(bps);
		this.setBPD(bpd);
	}
	
	
	//Getter and Setter methods for all the fields of Visit Data
	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getDate() {
	        return date;
	    }

	    public void setDate(int date) {
	        this.date = date;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }
	    
	    public int getWeight() {
	        return weight;
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }
	    
	    public double getHac() {
	        return hac;
	    }

	    public void setHac(double hac) {
	        this.hac = hac;
	    }
	    
	    public int getBPS() {
	        return bps;
	    }

	    public void setBPS(int bps) {
	        this.bps = bps;
	    }
	    
	    public int getBPD() {
	        return bpd;
	    }

	    public void setBPD(int bpd) {
	        this.bpd = bpd;
	    }
	    
	   
}
