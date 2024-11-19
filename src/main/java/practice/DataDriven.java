package practice;

import java.io.FileInputStream;
import java.util.Properties;

public class DataDriven {

	public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("E:\\Selenium\\Data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty("Url");
	System.out.println(value);

	}

}
