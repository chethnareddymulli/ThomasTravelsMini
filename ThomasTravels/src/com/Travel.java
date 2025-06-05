package com;

public class Travel extends Driver{
	
	
	public boolean isCarDriver(Driver d){
		if(d.getCategory().equals("Car")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public String retrivebyDriverId (Driver[] drivers , int driverId) {
		
		for(int i=0; i<drivers.length; i++) {
			
			if( drivers[i].getDriverId()==(driverId) ) {
				return "Driver name is " + drivers[i].getDriverName() + " belonging to the category " + drivers[i].getCategory() + " traveled " + drivers[i].getTotalDistance() + " KM so far.";
			}
		}
		return "Driver Not Found";
		
	}
	
	
	
	public int retriveCountOfDriver(Driver[] drivers, String category) {
		int count = 0;
		for(int i=0; i < drivers.length; i++) {
			if( drivers[i].getCategory().equals(category) ) {
				count++;
			}
		}
		return count;
	}
	
	
	
	public Driver[] retriveDriver(Driver[] drivers , String category){
		int count=0;
		for (int i = 0; i < drivers.length; i++) {
		    if (drivers[i].getCategory().equalsIgnoreCase(category)) {
		        count++;
		    }
		}
		
		Driver[] matchingDrivers = new Driver[count];
		int arrayIndex=0;
		for(int i=0; i < drivers.length; i++) {
			if( drivers[i].getCategory().equalsIgnoreCase(category) ) {
				matchingDrivers[arrayIndex] = drivers[i];
				arrayIndex++;
			}
		}
		return matchingDrivers;

	}
	
	
	
	
	public Driver retriveMaximumDistanceTravelled(Driver[] drivers) {
		Driver maxDistanceTravelledDriver = drivers[0];
		
		for(int i=1; i < drivers.length; i++) {
			if(drivers[i].getTotalDistance() > maxDistanceTravelledDriver.getTotalDistance()) {
				maxDistanceTravelledDriver = drivers[i];
			}
		}
		return maxDistanceTravelledDriver;
	}
	
	
	
	
	
}
