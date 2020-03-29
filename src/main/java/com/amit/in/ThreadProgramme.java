package com.amit.in;

public class ThreadProgramme extends Thread {

	public void run() {
		System.out.println("Wlcome to run method");
	}
	
	public static void main(String... args) {
		
		new ThreadProgramme().start();
		
	}
		
	
	}


	

