package com.qa.gitpush;

import Garage.Car;
import Garage.Motorcycle;
import Garage.Vehicle;
import Garage.Mopeds;

public class examples {
	
	public static void main(String[] arg) {
		Vehicle v1 = new Car("M8", "Car", "BMW", 2021, "leather");
		Vehicle v2 = new Motorcycle("Motorcycle", "Kawasaki", "ninja", 1984, 2);
		Vehicle v3 = new Mopeds("Moped", "EV Rider", "Monster", 2012, "true");
		
		System.out.println(v1 + "\n" + v2 + "\n" + v3);
	}

}

