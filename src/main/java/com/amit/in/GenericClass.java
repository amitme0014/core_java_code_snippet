package com.amit.in;

public class GenericClass<T> {
	
	private T genericVariable;   //Generic variable decleration

	
	//Generic Constructor
	public T getGenericVariable() {
		return genericVariable;
	}

	
	//generic setter
	public void setGenericVariable(T genericVariable) {
		this.genericVariable = genericVariable;
	}

	
	//generic constructor
	public GenericClass(T genericVariable) {
		super();
		this.genericVariable = genericVariable;
	}


	//generic to string
	@Override
	public String toString() {
		return "GenericClass [genericVariable=" + genericVariable + ", getGenericVariable()=" + getGenericVariable()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
