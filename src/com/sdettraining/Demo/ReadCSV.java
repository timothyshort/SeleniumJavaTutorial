package com.sdettraining.Demo;

import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		List<String[]> newUsers = datadriven.CSV.get("C:\\Users\\owner\\Desktop\\SDET-June2017\\TestData\\UsersData.csv");
		
		for (String[] user : newUsers) {
			System.out.println("***NEW USER****");
			System.out.println(user[0]);
			System.out.println(user[1]);
			System.out.println(user[2]);
		}
		
	}

}
