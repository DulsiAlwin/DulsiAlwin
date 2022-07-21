package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataDrivnTestXL {
@Test 
 public void data()throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./Data.xlsx");
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	Row row = sheet.getRow(4);
	Cell cell = row.getCell(1);
	//System.out.println(cell);
	//System.out.println(cell.getBooleanCellValue());//boolean will print
	//System.out.println(cell.getStringCellValue());//d
	//System.out.println(cell.getNumericCellValue());//4.0
	//System.out.println(cell.getDateCellValue());//Date printing
	String text = cell.toString();
	Reporter.log(text,true);
	System.out.println(text);
}
}
