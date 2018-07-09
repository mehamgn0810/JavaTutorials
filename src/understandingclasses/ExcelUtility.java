package understandingclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static void readExcel(String pathName, String fileName, String sheetName) throws IOException {

		Workbook wb = null;

		// Create an object of File class to open xlsx file
		File f = new File(pathName + fileName);
		FileInputStream fis = new FileInputStream(f);

		String fileExt = fileName.substring(fileName.indexOf("."));

		if (fileExt.equals(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		} else if (fileExt.equals(".xls")) {
			wb = new HSSFWorkbook(fis);
		}

		Sheet mySheet = wb.getSheet(sheetName);
		int firstRowNum = mySheet.getFirstRowNum();
		System.out.println("First Row Number ==> " + firstRowNum);

		int lastRowNum = mySheet.getLastRowNum();
		System.out.println("Last Row Number ==> " + lastRowNum);

		int rowsCount = lastRowNum - firstRowNum + 1;
		System.out.println("Rows Count ==> " + rowsCount);

		for (int i = 0; i < rowsCount; i++) {
			Row row = mySheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					System.out.println("Value of Row " + i + " Column " + j + " is: " + cellValue);
				}

			}
		}

	}
	
	public static void writeExcel(String pathName, String fileName, String sheetName, String writeData) throws IOException {

		Workbook wb = null;

		// Create an object of File class to open xlsx file
		File f = new File(pathName + fileName);
		FileInputStream fis = new FileInputStream(f);

		String fileExt = fileName.substring(fileName.indexOf("."));

		if (fileExt.equals(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		} else if (fileExt.equals(".xls")) {
			wb = new HSSFWorkbook(fis);
		}

		Sheet mySheet = wb.getSheet(sheetName);
		int firstRowNum = mySheet.getFirstRowNum();
		
		int lastRowNum = mySheet.getLastRowNum();
		
		int rowsCount = lastRowNum - firstRowNum + 1;
		
		for(int i=0; i<lastRowNum; i++) {
			
			Row row = mySheet.getRow(i);
			Cell cell = row.createCell(5);
			cell.setCellValue(writeData);
		}
		
		fis.close();
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		fos.close();
	}

}
