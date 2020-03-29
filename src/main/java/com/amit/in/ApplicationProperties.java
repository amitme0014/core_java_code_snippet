package com.amit.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
	
	public static void main(String[] args) {
		

		
		
try {
	loadProperties();
	System.out.println(loadProperties());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	
	}

	private static Properties loadProperties() throws IOException{
		
		// TODO Auto-generated method stub
		File file=new File("src/test/resources/application.properties");
	    file.exists();
		System.out.println(file.exists());
		
		
	
			FileInputStream fileInputStream=new FileInputStream(file);
		    int i=fileInputStream.read();
		    System.out.println(i);
		
			
		
		Properties props=new Properties();
		props.load(fileInputStream);
		System.out.println(props.getProperty("ame"));
		System.out.println(props);
		return props;
		
		
	}
	
			

}
