package com.qa.gitpush;

public class Person {
	
	public String name;
	public float height;
	public int age;
	public String eyecolor;
	public String ethnicity;
	public String gender;
	public boolean isbreathing;
	public int walkspeed = 30;
	public String book;
	
	public Person(String name, int age, String gender, String book) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.book = book;
	}
	
	public void read(Book x) {
		System.out.println(this.name + "is reading the book titled: {given}");
	}
	
	public boolean isStillBreathing() {
		return isbreathing;
	}
	
	public String speak(String msg) {
		return this.name +" says: " + msg;
	}
	
	public String read(String msg) {
		return this.name +" reads: " + msg;
	}
	
	public int walk() {
		return walkspeed;
	}
}

// how to run the program

//System.out.println("App START");

//Person bob = new Person("bob", 32, "male");

//System.out.println(bob.speak("Hello!"));
		
//System.out.println("APP END");