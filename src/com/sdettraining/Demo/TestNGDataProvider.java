package com.sdettraining.Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@Test(dataProvider = "getData")
	public void ExcelTest(String firstName, String lastName, String email) {
		System.out.println("NEW RECORD [ " + firstName + " " + lastName + " " + email + " ]");
	}
	
	@DataProvider
	public String[][] getData() {
		return datadriven.Excel.get("C:\\Users\\owner\\Desktop\\SDET-June2017\\TestData\\UsersDataXL.xls");
	}

}
