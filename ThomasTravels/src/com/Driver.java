package com;

public class Driver {
	
	//Encapsulation (make private sensitive information)
	private String category;
	private int driverId;
	private String driverName;
	private double totalDistance;
	
	//default constructor 
	Driver() {
		
	}
	//constructor with parameters
	Driver(int driverId , String driverName,String category , double totalDistance) {
		
		this.driverId = driverId;
		this.driverName = driverName;
		this.category = category;
		this.totalDistance = totalDistance;
		
	}
	
	
	//getter for driver class variables
	
	public int getDriverId() {
		return driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public String getCategory(){
		return category;
	}
	
	public double getTotalDistance() {
		return totalDistance;
	}
	
	
	
	//setter for driver class variables
	
	public void setDriverId(int newDriverId) {
		this.driverId = newDriverId;
	}
	
	public void setDriverName(String newDriverName) {
		this.driverName = newDriverName;
	}
	
	public void setCategory(String newCategory) {
		this.category = newCategory;
	}
	
	public void setTotalDistance(double newTotalDistance) {
		this.totalDistance = newTotalDistance;
	}
	
	
}
