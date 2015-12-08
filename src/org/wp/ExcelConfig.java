package org.wp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	XSSFWorkbook wb;
	XSSFSheet ws;

	public ExcelConfig(String path) {

		try {

			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
//Create a method to get the data from excel based on given parameters 
	public String getData(int SheetNum, int rowNum, int colNum) {
		ws = wb.getSheetAt(SheetNum);
		String data = ws.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;

	}
	
//create a method that will return the row count 
	public int rowCount(int sheetindex){
		int rCount=wb.getSheetAt(sheetindex).getLastRowNum();
		rCount=rCount+1;
		return rCount;
		
	}

}
