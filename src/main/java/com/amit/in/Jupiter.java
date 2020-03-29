package com.amit.in;

public class Jupiter extends Vehicle {

	private int numberOfWheels;
	private String color;
	
	//Yaha dekpho constructor overloading hua hai,kyunki hamne yaha parent class ke members arthaat variable ko use kiya hai.
	public Jupiter(int numberOfWheels, String model, int numberOfWheels2, String color) {
		super(numberOfWheels, model);
		numberOfWheels = numberOfWheels2;
		this.color = color;
	}

	public Jupiter(int numberOfWheels, String model) {
		super(numberOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Jupiter(int numberOfWheels) {
		super(numberOfWheels);
		// TODO Auto-generated constructor stub
	}

	public Jupiter() {
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Lets do the method overloading, i.e calling the method of superclass/parent class in child class
	public void childClassMethod(){
		
		System.out.println("Calling from child class method");
		super.parentClassMethod(); // Here we are calling method from superclass i.e Vehicle class which is parent class
	}
	
 
	@Override
	public void overriddenMethod() {
		System.out.println("I am in child class overridden method");
	}
	
}
	 	
