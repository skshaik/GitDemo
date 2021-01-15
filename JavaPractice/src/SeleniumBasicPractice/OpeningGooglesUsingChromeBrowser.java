package SeleniumBasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningGooglesUsingChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://udemy.com");
		driver.get("http://gmail.com");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("http://gmail.com");
		driver.close();
		
	}

}
