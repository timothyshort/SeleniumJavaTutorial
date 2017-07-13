package com.sdettraining.Demo;

public class ReadDB {

	public static void main(String[] args) {
		String[][] dataTable = datadriven.Database.get();
		for (String[] row : dataTable) {
			System.out.print("[ ");
			for (String element : row) {
				System.out.print(element + " ");
			}
			System.out.println(" ]");
		}
	}

}
