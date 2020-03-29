package com.amit.in;

public interface QueryMapper {
	
	public static final String CREATE_TABLE="CREATE TABLE CUSTOMERS(\n" + 
			"   ID   INT              NOT NULL,\n" + 
			"   NAME VARCHAR (20)     NOT NULL,\n" + 
			"   AGE  INT              NOT NULL,\n" + 
			"   ADDRESS  CHAR (25) ,\n" + 
			"   SALARY   DECIMAL (18, 2),       \n" + 
			"   PRIMARY KEY (ID)\n" + 
			");";

	public static final String INSERT_DATA="INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)\n" + 
			"VALUES (?,?,?,?,?);";
	
	public static final String UPDATE_DATA="UPDATE CUSTOMERS\n" + 
			"SET ADDRESS = ?\n" +   //isme address wale ? ka index 1 hoga
			"WHERE ID = ?";			//id wale ? ka index 2 hoga
}

//Jitne bhi question mark hain, wo index series follow karte hain jaise values(?,?,?)
// pahla ? - index 1
//doosra ? - index 2
//teesra ? - index 3
