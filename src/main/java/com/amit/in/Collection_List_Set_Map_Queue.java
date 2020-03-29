package com.amit.in;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collection_List_Set_Map_Queue{
	
		public static void main	(String[] args) throws IOException, SQLException  {
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			//System.out.println(DBConnectionClass.connection()+"sjhsj");
			DBConnectionClass.connection();
			
			
			// ArrayList 
		      List<String> a1 = new ArrayList<String>();
		      a1.add("Zara");
		      a1.add("Mahnaz");
		      a1.add("Ayan");
		      System.out.println(" ArrayList Elements");
		      System.out.print("\t" + a1);

		      // LinkedList
		      List<String> l1 = new LinkedList<String>();
		      l1.add("Zara");
		      l1.add("Mahnaz");
		      l1.add("Ayan");
		      System.out.println();
		      System.out.println(" LinkedList Elements");
		      System.out.print("\t" + l1);

		      // HashSet
		      Set<String> s1 = new HashSet<String>(); 
		      s1.add("Zara");
		      s1.add("Mahnaz");
		      s1.add("Ayan");
		      System.out.println();
		      System.out.println(" Set Elements");
		      System.out.print("\t" + s1);

		      // HashMap
		      Map<String, String> m1 = new HashMap<String, String>(); 
		      m1.put("Zara", "8");
		      m1.put("Mahnaz", "31");
		      m1.put("Ayan", "12");
		      m1.put("Daisy", "14");
		      System.out.println();
		      System.out.println(" Map Elements");
		      System.out.print("\t" + m1);
		     
		      //Yaha dekho Hamne generic class banayi ab usemein ham chaahe integer pass kara dein ya fir String sabke liye ye kaam karega.
		      GenericClass<String> genericClass=new GenericClass<String>("genericVariable");
		      System.out.println(genericClass.toString());
		      
		      GenericClass<Integer> genericClassInteger=new GenericClass<Integer>(888);
		      System.out.println(genericClassInteger.toString());
		   
		      /*
		      /////////////////////////Taking input from user and storing it in string and then printing/////////////////////////////////////////
		      System.out.println("************************************************************************************************************");
		      Scanner userInput=new Scanner(System.in);
		      System.out.println("Type anything");
		      System.out.println(userInput.nextLine());
		      
		      while(userInput.hasNextLine()) {
		    	  String input=userInput.nextLine();
		    	  System.out.println(input.intern()+" "+"aapne ye input daala hai");
		      }
		      userInput.close();	
		      */
		      
		  	//Reading input from/
				
				StringBuffer sb=new StringBuffer();
				char input;
					
				try {
					while((input=(char) System.in.read())!='\n') {
						sb.append(input);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("IO Exception aya hai");
				}
				System.out.println(sb);
				
				
		   }
		
			
		}
	


