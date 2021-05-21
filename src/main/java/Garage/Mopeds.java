package Garage;

public class Mopeds extends Vehicle{
	
	public Mopeds(String type, String make, String name, int year) {
		super(type, make, name, year);

	}
	private boolean _traffic;
	private String _accessibility;	
	
	public String getaccessibility() { return _accessibility;}
	
	
	
	public void setaccessibility(String Make) { _accessibility = getaccessibility();}



	public boolean is_traffic() {
		return _traffic;
	}



	public void set_byPass(boolean _traffic) {
		this._traffic = _traffic;
	}

}
