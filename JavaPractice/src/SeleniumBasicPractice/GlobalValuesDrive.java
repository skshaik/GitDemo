package SeleniumBasicPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\shaik\\eclipse-workspace\\SeleniumPrograms\\JavaPractice\\src\\ExternalFileData.properties");
		prop.load(fis);
	    String S1 = prop.getProperty("browser");
	    System.out.println(S1);
	    String S2 = prop.getProperty("url");
	    System.out.println(S2);
	    
	    prop.setProperty("browser","edge");
	    prop.setProperty("url","http://google.com");
	    
	    System.out.println(prop.getProperty("browser"));
	    System.out.println(prop.getProperty("url"));

	    FileOutputStream fos = new FileOutputStream("C:\\Users\\shaik\\eclipse-workspace\\SeleniumPrograms\\JavaPractice\\src\\ExternalFileData.properties");
	    prop.store(fos, null);
	    
	    
	    
		
		

	}
}
