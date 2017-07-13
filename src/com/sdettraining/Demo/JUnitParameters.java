package com.sdettraining.Demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class JUnitParameters {
	
	String name;
	String email;
	String phone;
	
	// Test method here
	@Test
	public void RunnerTest() {
		System.out.println("NEW RECORD " + name + " "+ email + " " + phone);
	}
	
	// This annotated method is designed to pass parameters into the class
	@Parameters
	public static List<String[]> getTestData() {
		return datadriven.CSV.get("C:\\Users\\owner\\Desktop\\SDET-June2017\\TestData\\UsersData.csv");
	}
	
	// Constructor method
	// 1. Take parameters from the @Parameters method
	// 2. Parse each element into the arguments
	// 3. It will iterate this for each record
	public JUnitParameters(String pName, String pEmail, String phone) {
		name = pName;
		email = pEmail;
		this.phone = phone;
	}

}
