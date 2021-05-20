package Garage;

public class Motorcycle extends Vehicle {
	
	public String seats;
	public String handlebars;
	public boolean mufflers;
	public int wheels;
	
	public Motorcycle (String seats, String handlebars, boolean mufflers, int wheels) {
		this.seats = seats;
		this.handlebars = handlebars;
		this.mufflers = mufflers;
		this.wheels = wheels;
	}
	
	public void Type() {
		System.out.println(this.seats = "dual seating");
	}
	
	public void String() {
		System.out.println(this.handlebars = "beach bars");
	}
	
	public boolean quiet() {
		return mufflers;
	}
	
	public int turning() {
		return wheels;
		
	}

}
