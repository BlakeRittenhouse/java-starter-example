package Garage;


public class Car extends Vehicle {
	
	public String Chassis;
	public String tires;
	public String Price;
	public String HorsePower;
	
	public Car (String Chassis, String tires, String Price, String Horsepower) {
		this.Chassis = Chassis;
		this.tires = tires;
		this.Price = Price;
		this.HorsePower = Horsepower;
	}
	
	public void Type() {
		System.out.println(this.Chassis = "Type of car");
	}
	
	public void String() {
		System.out.println(this.tires = "Type of tires");
	}
	
	public void String1() {
		System.out.println(this.Price = "Cost of car");
	}
	
	public String speed() {
		return HorsePower;
		
	}

}
