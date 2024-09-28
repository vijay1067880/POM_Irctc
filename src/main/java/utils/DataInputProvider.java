package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataInputProvider {
	
	
	
	public static String[][] getData(String sheetName){
		 
		String[][] data = null; 
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TestInputData.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			int rowCount = sheet.getLastRowNum();
			int columnCout = sheet.getRow(0).getLastCellNum();
			 
			data = new String[rowCount][columnCout];
			for(int i=1;i<=rowCount;i++) {
				XSSFRow row= sheet.getRow(i);
				
				for(int j=0;j<columnCout;j++) {
				String celldata = 	row.getCell(j).getStringCellValue();
			    data[i-1 ][j] = celldata;			
			    }
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
}
