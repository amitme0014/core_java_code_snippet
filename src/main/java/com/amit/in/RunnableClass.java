package com.amit.in;

public class RunnableClass implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In void run");		
		
	}
	
	public static void main(String... args) {
		RunnableClass runnableThread=new RunnableClass();
		
		//AB upar wale object ka ham ek naya thread banayenge
	 Thread thread=new Thread(runnableThread);
	 thread.start();
	 
	}	
	
	
}

