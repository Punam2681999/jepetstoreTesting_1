package com.jepetstore.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jepetStoreWithPageFactory.TestCases.Tc_AddToCartOrder_03;
import com.jepetStoreWithPageFactory.TestCases.Tc_RegisterUser_01;
import com.jepetStoreWithPageFactory.TestCases.Tc_SignIn_02;





public class jpetStoreWriteResult {
	public static void writeData()
	{
		try{
			FileInputStream stream=new FileInputStream("C:\\Users\\punam\\Desktop\\seleniumAutomation\\jepetstorewithPageFactory.sel.project\\src\\test\\resources\\jepetStorepageFactoryResult.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(stream);
			XSSFSheet sheet=book.getSheet("jepetStorepageFactoryResult");
			XSSFCell cell=sheet.getRow(1).createCell(1);
			cell.setCellValue(Tc_RegisterUser_01.registrarionSuccess);
			cell=sheet.getRow(2).createCell(1);
			cell.setCellValue(Tc_SignIn_02.signInSuccess);
			cell=sheet.getRow(3).createCell(1);
			cell.setCellValue(Tc_AddToCartOrder_03.AddToCartFishSuccess);
		


       FileOutputStream writeFile=new FileOutputStream("C:\\Users\\punam\\Desktop\\seleniumAutomation\\jepetstorewithPageFactory.sel.project\\src\\test\\resources\\jepetStorepageFactoryResult.xlsx");
	   book.write(writeFile);
	
	}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}


