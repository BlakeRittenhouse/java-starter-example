package Garage;

public class Car extends Vehicle {

	public Car(String type, String make, String name, int year) {
		super(type, make, name, year);

	}

	private String _seats;
	private String _stearingWheel;

	public String getseats() {
		return _seats;
	}

	public String getstearingWheel() {
		return _stearingWheel;
	}

	public void setseats(String Type) {
		_seats = getseats();
	}

	public void setstearingWheel(String Make) {
		_stearingWheel = getstearingWheel();
	}
}
