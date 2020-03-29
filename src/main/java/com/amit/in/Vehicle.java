package com.amit.in;

public class Vehicle {

	private int numberOfWheels;
	private String model;
	
	public Vehicle(int numberOfWheels, String model) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.model = model;
	}
	public Vehicle(int numberOfWheels) {
		super();
		this.numberOfWheels = numberOfWheels;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", model=" + model + ", getNumberOfWheels()="
				+ getNumberOfWheels() + ", getModel()=" + getModel() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public void parentClassMethod() {
		System.out.println("I am getting called from parent class which is vehicle");
	}
	
	public void overriddenMethod() {
		System.out.println("Overridden method of parent class");
	}
	
	
}
