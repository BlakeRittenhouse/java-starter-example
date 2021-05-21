package Garage;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(String type, String make, String name, int year, String wheel) {
		super(type, make, name, year);
		_wheel = wheel;

	}
	private String _wheel;	
	
	public String getwheel() { return _wheel;}
	
	public void setwheel(String Make) { _wheel = getwheel();}

	@Override
	public String toString() {
		return "Motorcycle [_wheel=" + _wheel + "]";
	}

}
