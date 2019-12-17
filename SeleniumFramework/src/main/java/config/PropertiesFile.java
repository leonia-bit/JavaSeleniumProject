package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


/**
 * Description: read/write to config.properties file
 * @author mkbc3
 * @date
 */
public class PropertiesFile {
	private static final String NULL = null;
	/**
	 * Class variables definition
	 */
	static String projectPath; 
		
	public static void main(String[] args) {
		
		
		
		readPropertiesFile();
		writePropertiesFile();
		//readPropertiesFile();
		
	}
	
	/**
	 * Description read from java configuration file. In format key=value
	 * @author mkbc3
	 * @date
	 */
	public static String readPropertiesFile() {
		Properties prop = new Properties();
		projectPath = System.getProperty("user.dir");
		
		try {
			InputStream inputStream = new FileInputStream( projectPath + "/src/main/java/config/config.properties");
			// inputStream = new FileInputStream("C:\\Users\\mkbc3\\git\\JavaSeleniumProject\\SeleniumFramework\\src\\main\\java\\config\\config.properties");
			prop.load(inputStream);
			System.out.println(prop.getProperty("browser"));
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browser = prop.getProperty("browser");
		prop.clear();
		return browser;
	}
	/**
	 * 
	 */
	public static void writePropertiesFile() {
		projectPath = System.getProperty("user.dir");
		Properties prop = new Properties();
		
		try {
			OutputStream outputStream = new FileOutputStream(projectPath + "/src/main/java/config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("result", "pass");			
			prop.store(outputStream, NULL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop.clear();
		
	}

}
