package com.amit.in;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClassOne {

	//Below test will fail, if itakes more than 1000ms
	@Test(timeout=1000)
	public void testSay() {
		StudentClass studentClass=new StudentClass(3, "okayo");
		assertEquals("okayo", studentClass.getClass()); //This will give failed result 
		//assertEquals("okayo", studentClass.getName());//This will pass	
		}
	
	@Test
	public void testSayOtherMethod() {
		StudentClass studentClass=new StudentClass(3, "okayo");
		assertEquals("okayo", studentClass.getName());//This will pass	
		}
	
	@After
	public void AfterTest() {
		System.out.println("After test execution");
	}
	
	@Before
	public void BeforeTest() {
		System.out.println("Before Test execution");
	}
	
	
}
