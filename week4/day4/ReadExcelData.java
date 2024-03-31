package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] excelData(String fileName) throws IOException {
		// Step1 : Get the Excel workbook path
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelFiles/" + fileName + ".xlsx");

		// Step2 : Get the sheet
		XSSFSheet sheet = wb.getSheetAt(0);

		// Step 3 : Get the row count
		int rowCount = sheet.getLastRowNum();

		// Step4: Get the Column count
		int columnCount = sheet.getRow(0).getLastCellNum();

		System.out.println("Row count is " + rowCount);

		System.out.println("Column count is " + columnCount);

		// Step 5: Get All the cell values

		// declare a 2d Array String as data

		String[][] data = new String[rowCount][columnCount];

		// iterate the row 1st
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			// iterate the column/cell
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue(); // 1,0
				System.out.println(cellValue);
				data[i - 1][j] = cellValue;// 0,0

			}

		}

		// Step 6: Close the workbook
		wb.close();

		return data;
	}

}