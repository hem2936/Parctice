package org.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Praveen {
	
	public static void main(String[] args) throws IOException {
		
		
	File file = new File("C:\\Users\\CROMA\\eclipse-workspace\\Vishnu\\Excel\\Book1.xlsx");
	
	FileInputStream input = new FileInputStream(file);
	
	Workbook book = new XSSFWorkbook(input);
	
   Sheet sheet = book.getSheet("sheet1");
   
   for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	   
	   Row row = sheet.getRow(i);
	   
	  for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		  
		  Cell cell = row.getCell(j);
		  System.out.println(cell);
//		  Row createRow = sheet.createRow(1);
//		  Cell createCell = createRow.createCell(9);
//		  createCell.setCellValue("Vishnuuuuuuu");
//		  
//		  FileOutputStream out = new FileOutputStream(file);
//		  
//		  book.write(out);
		 
		  
	}
	
}
	

	
	}
}
	
		
	
	
	
		
		
		
			
		
		
		
		
		
	
	
		



