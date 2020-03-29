package com.amit.in;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.amit.in.EnumClass.Level;

public class MainClass {
	
	public static void main(String[] args) {
		
		String string="Bhadoria";
		System.out.println(string.charAt(0));
		String newString=string.concat("Amit");
		System.out.println(newString);
		
		if(string.equalsIgnoreCase("Bhadoria")) {
			System.out.println("String found");
		}
		else {
			System.out.println("Nah not found");
		}

		/*
		 * The Java string constant pool is an area in heap memory where Java stores literal string values. The heap is an area of memory used for run-time operations. ... 
		 * However,if you create a new instance of a String object, it will create a new string literal in the pool, even if one already exists.
		 */
		string="Amkk";
		System.out.println(string);
		
		Runtime gfg=Runtime.getRuntime();
		System.out.println(gfg.availableProcessors());
		System.out.println(gfg.freeMemory());
		System.out.println(gfg.totalMemory());
		Runtime.getRuntime();
		
		StringBuffer sb=new StringBuffer("Siddhant");
		sb.append("Purohit");
		sb.append(string);
		System.out.println(sb);
		
		StringBuilder stringBuilder=new StringBuilder("Shaheen is mouni");
	    String substring=stringBuilder.substring(0);
		System.out.println(stringBuilder);
		System.out.println(substring);
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("Hello World");
		//**********************************Local Date**************************************************
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		/*
		 * Hash map json value store karta hai , i.e key value pair k form mein, aiye neeche dekhte hain use
		 */
		
		HashMap<String, String> hashMap=new HashMap<String, String>();
		//Upar string string ka matlab hai ki, key String hoga aur value bhi string hoga, i.e key value pair is string.
		
		hashMap.put("id", "1");
		hashMap.put("name", "ardhu");
		
		//Iterating over hashmap values
		for(String hashmapvalue : hashMap.keySet()) {
			System.out.println(hashmapvalue+":"+hashMap.get(hashmapvalue));
		}
		
		/*
		 * Normal array or arraylist mein ye fark hots hai ki array ko ek baar declare kar diya toh ghata badha nai sakte, balki array list k saath aisa nai hai.
		 * Wrapper class ka use karte hain, int, string class ko Object class mein change karne k liye,
		 * Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
			Example
			ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
			ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
		 */
		
		
	//***************************************ArrayList*******************************************
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("ekta");
		arrayList.add("hassan");
		
		System.out.println("&***************************8");
		System.out.println(arrayList.toString());
		System.out.println("##############################");
		
		System.out.println(arrayList.get(0));	
		arrayList.set(0, "sarbani");
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.size());
		
		Collections.sort(arrayList);
		
		
		for(String value : arrayList) {
			System.out.println("Array Members are" + value);
		}
		//enum k case mein ham enum k variable ko import kara lete hain, jaise level k teen options hain.
		
		Level level=EnumClass.Level.HIGH;
		System.out.println(level);
		
		
		Scanner scaneer=new Scanner(System.in);
		System.out.println("Enter Your Name");
		System.out.println(scaneer.nextLine());
		scaneer.close();
		
		
		
		StudentClass studentClass=new StudentClass(3,"ankit");
	
		System.out.println(studentClass.toString());
		
	   AbstractMethodImplementation abstractMethodImplementation=new AbstractMethodImplementation();
	   abstractMethodImplementation.abstractMethod();
		
		String[] cars= {"Anoop","Gayathri","Nandhini"};
		
		for(String value : cars) {
			
			if(value.equals("Gayathri")) 
			{
				System.out.println("Gayathri string found");
		//		break;   //break statement mein is gayathri k iteration k baad for loop break ho jayega
		//	continue;    //continue statement mein yahan k baad hi iteration jump kar jeyega next value k liye, that means neeche lika gaya code
				//gayathri k liye nai chalega aur is if block k baad iteration seedhe jump kar jayega nandhini ki value pe
				
			}
			System.out.println(cars[0]);
			System.out.println(value);
			
		}
		/*
		 * Syso aur return mein ye farak hota hai ki jab ham return karate hain koi value toh, ham function ko print kar k woh value print kara sakte hain
		 */
	
		function(9,"Amit");
		System.out.println(function(9,"Amit"));
		System.out.println(function(7,"Amit","Singh"));
		
		
		//File Operation

		File file=new File("newFile.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("File Created : "+file.getName());
				FileWriter fileWriter=new FileWriter(file.getName());
				fileWriter.write("Wrote the File Man");
				fileWriter.close();
				try {
					ThreadProgramme.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scanner scanner=new Scanner(file.getName());
				while(scanner.hasNextLine()) {
						String content=scanner.nextLine();
						System.out.println("**************Content neeche hai**************************");
						System.out.println(content);
				}
				scanner.close();
				
			}
			else {
				System.out.println("File already exists");
				FileWriter fileWriter=new FileWriter(file.getName());
				fileWriter.write("Wrote the File Man");
				fileWriter.close();
				System.out.println("Deleting the file");
				file.delete();
				
				try {
					ThreadProgramme.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Scanner scanner=new Scanner(file.getName());
				while(scanner.hasNextLine()) {
						String content=scanner.nextLine();
						System.out.println("**************Content neeche hai**************************");
						System.out.println(content);
				}
				scanner.close();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * Method overloading ka yeh matlab hai ki, same naam k kai function ho sakte hain, jab tak type or parameter alag ho.
	 */
	public static String function(int i, String string) {
		System.out.println(i);
		System.out.println(string);
		System.out.println("In Void function");
		return "Returning from String function";
	}
	
	public static String function(int i, String string, String string1) {
		System.out.println(i);
		System.out.println(string);
		System.out.println(string1);
		System.out.println("In Void function");
		return "Returning from String function";
	}
	
	
	
	
	
	
}

