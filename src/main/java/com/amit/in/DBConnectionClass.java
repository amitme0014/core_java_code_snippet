package com.amit.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

public class DBConnectionClass {

	
	public static void connection() throws IOException, SQLException {
	File file=new File("src/test/resources/application.properties");
	try {
		FileInputStream fileInputStream=new FileInputStream(file);
		fileInputStream.read();
		Properties props=new Properties();
		props.load(fileInputStream);
	String url=props.getProperty("spring.datasource.url");
	String username=props.getProperty("spring.datasource.username");
	String password=props.getProperty("spring.datasource.password");
	
	Connection connectionz=DriverManager.getConnection(url, username, password);
	//System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
	//System.out.println(connection.toString());
	System.out.println(connectionz);
	Statement statement=connectionz.createStatement();
	//connectionz.close();
	//connectionz.createStatement().execute(QueryMapper.CREATE_TABLE); --Commenting since table already created
	//connectionz.close();
	System.out.println(statement);
				
	
	//****************************************Prepared statement for inserting data*********************************************************
	
	/*
	PreparedStatement preparedStatement=connectionz.prepareStatement(QueryMapper.INSERT_DATA);
	preparedStatement.setInt(1, 54);
	preparedStatement.setString(2, "kushalKant");
	preparedStatement.setInt(3, 97);
	preparedStatement.setString(4,"karol bagh");
	preparedStatement.setFloat(5, 7878);
	
	preparedStatement.executeUpdate();
	//System.out.println(preparedStatement.executeUpdate());
	
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	*/
	
	//*********************************Updating Data in DB**********************************************************************
	PreparedStatement preparedStatement=connectionz.prepareStatement(QueryMapper.UPDATE_DATA);
	preparedStatement.setInt(2,54);
	//preparedStatement.setString(2, "kushalKantuPDATED");
	//preparedStatement.setInt(3, 97);
	preparedStatement.setString(1,"karol_bagh updated");
	//preparedStatement.setFloat(5, 7878);
	
	preparedStatement.executeUpdate();
	
	System.out.println(preparedStatement.executeUpdate());
	
	
	
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
}
