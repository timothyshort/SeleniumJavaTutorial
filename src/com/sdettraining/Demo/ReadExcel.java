package com.sdettraining.Demo;

public class ReadExcel {

	public static void main(String[] args) {
		String[][] arr = datadriven.Excel.get("C:\\Users\\owner\\Desktop\\SDET-June2017\\TestData\\UsersDataXL.xls");
		for (String[] row : arr) {
			System.out.print("[ ");
			for (String element : row) {
				System.out.print(element + " ");
			}
			System.out.println("]");
		}
	}

}
