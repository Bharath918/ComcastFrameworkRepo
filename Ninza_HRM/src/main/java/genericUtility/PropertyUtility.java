package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	FileInputStream fis;
	public String readDataFromPropertyFile(String key) throws Exception {
	
	fis = new FileInputStream("./src/test/resources/CommonData.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	String browser=prop.getProperty(key);
	return browser;

	}
}
