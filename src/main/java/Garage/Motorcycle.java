package Garage;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(String type, String make, String name, int year, double wheel) {
		super(type, make, name, year);
		this.wheel = wheel;

	}
	public double wheel;	

	@Override
	public String toString() {
		return "Motorcycle - wheel = " + this.wheel + "\s" + super.toString();
	}

	

}
