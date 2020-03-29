package com.amit.in;

import java.io.File;
import java.io.IOException;

public class CopyFileMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("hello1");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file1=new File("hello2");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		CopyFile copyFile=new CopyFile();
		copyFile.init("hello1", "hello2");
		copyFile.copyContents();
		
		
		
	}

}
