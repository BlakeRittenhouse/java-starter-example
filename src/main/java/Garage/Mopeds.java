package Garage;

public class Mopeds extends Vehicle {

	public Mopeds(String type, String make, String name, int year, String accessibility) {
		super(type, make, name, year);
		this.accessibility = accessibility;

	}

	public String accessibility;

	@Override
	public String toString() {
		return "Mopeds - accessibility = " + this.accessibility + super.toString();
	}

}
