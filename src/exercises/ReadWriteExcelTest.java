package exercises;

import java.io.IOException;
import java.util.Arrays;

import understandingclasses.ExcelUtility;

public class ReadWriteExcelTest {

	public static void main(String[] args) throws IOException {
		
		String excelPath = "C:\\Users\\MEHAVARNAN\\Documents\\TestFolder\\";
		String fileName = "TestData.xlsx";
		String sheetName = "Sheet1";
		String tableName = "Invalid_Login";
		
		ExcelUtility.setExcelInstance(excelPath, fileName, sheetName);
		
		Object[][] obj = ExcelUtility.readExcel();
		System.out.println(Arrays.deepToString(obj));
		
//		Object[][] obj2 = ExcelUtility.readExcelWithBoundary(tableName);
//		System.out.println(Arrays.deepToString(obj2));
	}

}
