package com.amit.in;

import java.util.HashMap;
import java.util.Stack;

public class MainMethodTwo {
	
	public static void main(String[] args) {
		
		//Here we use see overloading and overriding
		
		Vehicle vehicle=new Vehicle(2, "hifi");
		Jupiter jupiter=new Jupiter(3, "auto", 4, "blue");
		//Vehicle jupite=new Vehicle(8, "bluefi");
		
		jupiter.childClassMethod();
		jupiter.parentClassMethod(); //Method overloading kyunki ham child class k object se parent class k method ko call kar rae hain.
		
		System.out.println(vehicle.toString());
		
		Vehicle overriddenVehicle=new Vehicle();
		overriddenVehicle.overriddenMethod();
		
		overriddenVehicle=new Jupiter();
		
		overriddenVehicle.overriddenMethod();
	//	overriddenJupiter.overriddenMethod();
		
		Stack st=new Stack();
		st.add(0, "Amit");
		st.add(1,"Ankit");
		st.add(2, "Balaji");
		System.out.println(st);
		st.pop();
		System.out.println(st);
			
		//Lets implement list,set and map
		
		
		
				
				
		
		
		
		
		
		
	}

}
