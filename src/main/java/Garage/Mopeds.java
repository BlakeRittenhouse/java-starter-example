package Garage;

public class Mopeds extends Vehicle {

	public Mopeds(String type, String make, String name, int year, String accessibility) {
		super(type, make, name, year);
		_accessibility = accessibility;

	}

	private String _accessibility;

	public String getaccessibility() {
		return _accessibility;
	}

	public void setaccessibility(String Make) {
		_accessibility = getaccessibility();
	}

	@Override
	public String toString() {
		return "Mopeds [_accessibility=" + _accessibility + "]";
	}

}
