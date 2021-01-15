package SeleniumBasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpeningWebsiteUsingFirefoxBrowser {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.gecko.driver","C:\\SeleniumBrowserSupport\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://udemy.com");
				driver.get("http://gmail.com");
				driver.navigate().back();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				System.out.println(driver.getPageSource());
			}
	}

