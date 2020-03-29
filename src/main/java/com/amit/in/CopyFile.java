package com.amit.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	FileInputStream fromFile;
	FileOutputStream toFile;
	
	public void init(String file1, String file2) {
		
		try {
			fromFile=new FileInputStream(file1);
			toFile=new FileOutputStream(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
			}
	
	public void copyContents() {
		
		try {
			int i=fromFile.read();  
			while(i!=-1) {  //Yaani jab tak lines khatam na ho jaayein
				toFile.write(i);
				i=fromFile.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		
		
		
	}
	
	

}
