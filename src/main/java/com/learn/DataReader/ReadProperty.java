package com.learn.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadProperty {

	
	public static String readProp(String val) throws IOException
	{
	File file=new File("./Data/popr.properties");
	FileInputStream fis=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(fis);	
	
	String name=prop.getProperty(val);
	return name;
	}
	
	
	
}
