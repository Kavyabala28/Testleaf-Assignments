package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W3SchoolDetail {

	public static String[][] excelDetails(String file) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./ExcelFiles/" + file + ".xlsx");

		XSSFSheet sheet = wb.getSheetAt(0);

		int row = sheet.getLastRowNum();

		int col = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[row][col];

		for (int i = 1; i <= row; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell col2 = sheet.getRow(i).getCell(j);
				String cellValue = col2.getStringCellValue();
				System.out.println(cellValue);
				data[i - 1][j] = cellValue;
			}
		}

		wb.close();

		return data;

	}
}
