package Garage;

public class Mopeds extends Vehicle{
	
	public String price;
	public boolean pleasure;
	public String traffic;
	public String looks;
	
	
	public Mopeds(String price, boolean pleasure, String traffic, String looks) {
		this.price = price;
		this.pleasure = pleasure;
		this.traffic = traffic;
		this.looks = looks;		
	}
	
	public void Type() {
		System.out.println(this.price = "cheep");
	}
	
	public boolean HardRoad() {
		return pleasure;
	}
	
	public void String() {
		System.out.println(this.traffic = "ignored");
	}
	public String ugly() {
		return looks;
		
	}
	

}
