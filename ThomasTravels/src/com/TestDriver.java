package com;

import java.util.Arrays;

public class TestDriver {
	
	
	public static void main(String[] args) {
		
		Driver d1 = new Driver(01 , "Ram" , "Auto" , 7824);
		Driver d2 = new Driver(02 , "Vishnu" , "Lorry" , 5818);
		Driver d3 = new Driver(03 , "Anjan" , "Car" , 2564);
		Driver d4 = new Driver(04 , "Shiva" , "Jeep" , 3485);
		Driver d5 = new Driver(05 , "Jitendhra" , "Car" , 9874);
		
		
		
		Driver[] drivers = {d1,d2,d3,d4,d5};
		
		
		Travel travel = new Travel();
		
		//isCarDriver
		System.out.println("Is D1 a car driver? " + travel.isCarDriver(d1));
		
		//retrivebyDriverId
		System.out.println(travel.retrivebyDriverId(drivers, 05));
		System.out.println(travel.retrivebyDriverId(drivers, 02));
		System.out.println(travel.retrivebyDriverId(drivers, 10));
		
		
		//retriveCountOfDriver
		System.out.println("Number of Car drivers: " + travel.retriveCountOfDriver(drivers, "Car"));
		System.out.println("Number of Auto drivers: " + travel.retriveCountOfDriver(drivers, "Auto"));
		System.out.println("Number of Lorry drivers: " + travel.retriveCountOfDriver(drivers, "Lorry"));
		System.out.println("Number of Jeep drivers: " + travel.retriveCountOfDriver(drivers, "Jeep"));
		
		
		//retriveDriver
		Driver[] carDrivers = travel.retriveDriver(drivers, "Car");
		String[] carDriverNames = new String[carDrivers.length];
		for (int i = 0; i < carDrivers.length; i++) {
		    carDriverNames[i] = carDrivers[i].getDriverName();
		}
		System.out.println(Arrays.toString(carDriverNames)); 

		
		
		
		//retriveMaximumDistanceTravelled
		Driver maxDistanceTravelledDriver = travel.retriveMaximumDistanceTravelled(drivers);
		System.out.println("Driver with max Distance: " + maxDistanceTravelledDriver.getDriverName() + " " + maxDistanceTravelledDriver.getTotalDistance() + " KM" );
	}
}
