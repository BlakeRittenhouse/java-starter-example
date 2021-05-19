package com.qa.gitpush;

public class examples {
	
	public static void main(String[] args) {
		
		System.out.println("App START");
		
		Person tony = new Person("tony", 32, "male", "Unwanteds");
		
		System.out.println(tony.speak("Hello!"));
		
		System.out.println(tony.read("Unwanteds"));
				
		System.out.println("APP END");		
	}

}

