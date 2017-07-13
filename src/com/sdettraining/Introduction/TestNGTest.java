package com.sdettraining.Introduction;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Setting up the test");
		System.out.println("Starting the browser");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing the test");
		System.out.println("Closing the browser");
	}
	
	@Test
	public void TestNGTest1() {
		System.out.println("Running test 1");
		System.out.println("Testing the user application");
		String expected = "SDET Training";
		String actual = "SDET Trainin";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void TestNGTest2() {
		System.out.println("Running test 2");
	}

}
