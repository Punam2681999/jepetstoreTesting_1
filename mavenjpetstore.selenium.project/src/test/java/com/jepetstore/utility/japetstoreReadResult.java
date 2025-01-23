package com.jepetstore.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jepetstore.testcase.RegisterJepetstore;
import com.jepetstore.testcase.Tc_AddToCart_03;
import com.jepetstore.testcase.signin;



public class japetstoreReadResult {
	
		public static void writeData()
		{
			try{
				FileInputStream stream=new FileInputStream("C:\\Users\\punam\\Desktop\\seleniumAutomation\\mavenjpetstore.selenium.project\\src\\test\\resources\\jpetTestCaseResut.xlsx");
				XSSFWorkbook book=new XSSFWorkbook(stream);
				XSSFSheet sheet=book.getSheet("jpetTestCaseResut");
				XSSFCell cell=sheet.getRow(1).createCell(1);
				cell.setCellValue(RegisterJepetstore.registrarionSuccess);
				cell=sheet.getRow(2).createCell(1);
				cell.setCellValue(signin.signInSuccess);
				cell=sheet.getRow(3).createCell(1);
				cell.setCellValue(Tc_AddToCart_03.AddToCartFishSuccess);
			
	
	
           FileOutputStream writeFile=new FileOutputStream("C:\\Users\\punam\\Desktop\\seleniumAutomation\\mavenjpetstore.selenium.project\\src\\test\\resources\\jpetTestCaseResut.xlsx");
		   book.write(writeFile);
		
		}
			catch(IOException e) {
				e.printStackTrace();
				
			}
		}

	}



