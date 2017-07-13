package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	
	// This method will read and return Excel data into a double array
	public static String[][] get(String filename) {
		String[][] dataTable = null;
		File file = new File(filename);
		try {
			// Create a file input stream to read Excel workbook and worksheet
			FileInputStream xlfile = new FileInputStream(file);
			HSSFWorkbook xlwb = new HSSFWorkbook(xlfile);
			HSSFSheet xlSheet = xlwb.getSheetAt(0);
		
			// Get the number of rows and columns
			int numRows = xlSheet.getLastRowNum() + 1;
			int numCols = xlSheet.getRow(0).getLastCellNum();
			
			// Create double array data table - rows x cols
			// We will return this data table
			dataTable = new String[numRows][numCols];
			
			for (int i = 0; i < numRows; i++) {
				// For each row, create a HSSFRow, then iterate through the "column"
				// For each "column" create an HSSFCell to grab the value at the specified cell (i,j)
				HSSFRow xlRow = xlSheet.getRow(i);
				for (int j = 0; j < numCols; j++) {
					HSSFCell xlCell = xlRow.getCell(j);
					// Convert xlCell to a String
					// String value = cellToString(xlCell);
					dataTable[i][j] = xlCell.toString();
				}
			}
		} catch (IOException e) {
			System.out.println("ERROR FILE HANDLING " + e.toString());
		}
		return dataTable;
	}
	
	
	// This method will convert a Excel cell value into a string value
	private static String cellToString(HSSFCell cell) {
		int type = cell.getCellType();
		Object result;
		switch (type) {
			case HSSFCell.CELL_TYPE_NUMERIC: //0
				result = cell.getNumericCellValue();
				break;
			case HSSFCell.CELL_TYPE_STRING: //1
				result = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_FORMULA: //2
				throw new RuntimeException("We can't evaluate formulas in Java");
			case HSSFCell.CELL_TYPE_BLANK: //3
				result = "-";
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN: //4
				result = cell.getBooleanCellValue();
				break;
			case HSSFCell.CELL_TYPE_ERROR: //5
				throw new RuntimeException ("This cell has an error");
			default:
				throw new RuntimeException("We don't support this cell type: " + type);
			}
		return result.toString();
	}

}
