package com.scp.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		//C:\Users\Yogesh\Desktop\TempWork.xlsx
		File f = new File("C:\\Users\\Yogesh\\Desktop\\TempWork.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Mysheet2");
		Iterator<Row> itr = sheet.iterator();
		while(itr.hasNext()){
				Row row = itr.next();
				System.out.println("\n\n");
				Iterator<Cell> cells = row.iterator();
				while(cells.hasNext()){
					Cell cell = cells.next();
					System.out.print("\t\t");
					System.out.print(cell.getStringCellValue());
					//break;
				}
			
			break;
		}
		
	}
	
//http://opensource.demo.orangehrmlive.com/index.php/auth/validateCredentials
	//txtUsername : Admin
	//txtPassword : admin
	
	
	
	
	
	
	
	
	
	
	
	
}
