package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {

	public String getDataFromPropertiesFile(String key) throws Exception  {
		FileInputStream fs=new FileInputStream(IpathConstant.propertiesPath);
		Properties prop=new Properties();
		prop.load(fs);
		String value=prop.getProperty(key);
		return value;
		
		
		

	}

}
