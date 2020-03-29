package com.amit.in;


/*
 * public:	The code is accessible for all classes
 * private:	The code is only accessible within the declared class
 * default: The code is only accessible in the same package. This is used when you don't specify a modifier.
 * protected: The code is accessible in the same package and subclasses. 
 * final: The class cannot be inherited by other classes, i.e isko koi extend nai kar sakta.
 * abstract: The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.
 */
public class StudentClass implements Student{
	
	private int rollNumber;
	private String name;
	/*
	public StudentClass(int rollNumber, String name) {
		// TODO Auto-generated constructor stub
		this.rollNumber=rollNumber;
		this.name=name;
	}
	*/
	
	
	public StudentClass(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	/*
	 * Getter setter ka use hota hai value set karne k liye or get karne k liye.
	 * Ye encapsulation k concept ko follow karta hai
	 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
			declare class variables/attributes as private
			provide public get and set methods to access and update the value of a private variable

	 */

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StudentClass [rollNumber=" + rollNumber + ", name=" + name + ", getRollNumber()=" + getRollNumber()
				+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void getRoolNumber() {
		// TODO Auto-generated method stub
		System.out.println("The roll number is 1");
	}
	
	

}
