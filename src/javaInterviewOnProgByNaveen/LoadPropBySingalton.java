package javaInterviewOnProgByNaveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author SACHU
 *
 */
public class LoadPropBySingalton {

	static LoadPropBySingalton obj = null;
	Properties prop;

	public LoadPropBySingalton() {
		try {
			FileInputStream fis = new FileInputStream("abc.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			System.out.println("File not found.." + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static LoadPropBySingalton getInstance() {
		if (obj == null)
			obj = new LoadPropBySingalton();
		return obj;
	}

	String getAnyProperty(String key) {
		return prop.getProperty(key);
	}

	public static void main(String[] args) {

		String value = obj.getInstance().getAnyProperty("url");
		System.out.println("value of key is :"+value);

	}

}
