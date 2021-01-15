package SeleniumBasicPractice;

import org.openqa.selenium.WebDriver;k
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningGooglesUsingEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\SeleniumBrowserSupport\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://google.com");
		 driver.getCurrentUrl();
		// driver.getTitle();
		
		driver.close();
		
	}

}
