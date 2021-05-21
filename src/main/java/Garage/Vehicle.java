package Garage;

public class Vehicle {

	private String name;
	private String type;
	private String make;
	private int year;

	public Vehicle(String type, String make, String name, int year) {
		this.name = name;
		this.type = type;
		this.make = make;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return " name=" + name + ", type=" + type + ", make=" + make + ", year=" + year + "";
	}

}