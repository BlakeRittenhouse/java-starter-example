package Garage;

public class Vehicle {
	
		private String _name;
		private String _type;
		private String _make;
		private int _year;
		
		public Vehicle(String type, String make, String name, int year) {
			_name = name;
			_type = type;
			_make = make;
			_year = year;
		}
		
		
		public String getName() { return _name;}
		public String getType() { return _type;}
		public String getMake() { return _make;}
		public int getYear() {return _year;}
		
		
		public void setName(String Name) { _name = Name;}
		public void setType(String Type) { _type = Type;}
		public void setMake(String Make) { _make = Make;}
		public void setYear(int Year) { _year = Year;}
		
}