package Garage;

public class Car extends Vehicle {

	public Car(String type, String make, String name, int year, String seats) {
		super(type, make, name, year);
		this.seats = seats;

	}

	public String seats;

	@Override
	public String toString() {
		return "Car - seats=" + seats + "\s" + super.toString();
	}



	
	
	
	
	}
	
	

