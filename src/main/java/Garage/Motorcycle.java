package Garage;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(String type, String make, String name, int year) {
		super(type, make, name, year);

	}
	private String _gear;
	private String _wheel;	
	
	public String getgear() { return _gear;}
	public String getwheel() { return _wheel;}
	
	
	public void setgear(String Type) { _gear = getgear();}
	public void setwheel(String Make) { _wheel = getwheel();}

}
