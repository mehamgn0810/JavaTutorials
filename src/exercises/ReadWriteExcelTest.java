package exercises;

import java.io.IOException;

import understandingclasses.ExcelUtility;

public class ReadWriteExcelTest {

	public static void main(String[] args) throws IOException {
		
		ExcelUtility.readExcel("C:\\Users\\MEHAVARNAN\\Documents\\TestFolder\\", "TestData.xlsx", "Sheet1");

		ExcelUtility.writeExcel("C:\\Users\\MEHAVARNAN\\Documents\\TestFolder\\", "TestData.xlsx", "Sheet1", "google");
	}

}
