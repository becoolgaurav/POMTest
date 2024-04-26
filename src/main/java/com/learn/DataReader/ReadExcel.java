package com.learn.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static Object[][] getData(String shee) throws InvalidFormatException, IOException
	{
		File fi=new  File(System.getProperty("user.dir")+"./Data/data.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(shee);
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] res=new Object[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return res;
	}
}
