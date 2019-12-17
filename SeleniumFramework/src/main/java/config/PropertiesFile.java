package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	static String projectPath; 
	public static void main(String[] args) {
		readPropertiesFile();
	}
	
	public static void readPropertiesFile() {
		
		projectPath = System.getProperty("user.dir");
		Properties prop = new Properties();
		
		try {
			InputStream inputStream = new FileInputStream( projectPath + "/src/main/java/config/config.properties");
			// inputStream = new FileInputStream("C:\\Users\\mkbc3\\git\\JavaSeleniumProject\\SeleniumFramework\\src\\main\\java\\config\\config.properties");
			prop.load(inputStream);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
