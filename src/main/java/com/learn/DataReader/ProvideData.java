package com.learn.DataReader;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;



public class ProvideData {

	@DataProvider(name="TestData1")
	public Object[][] getData1() throws IOException, InvalidFormatException
	{
		Object[][] val=ReadExcel.getData("Sheet2");
		return val;
	}
}
