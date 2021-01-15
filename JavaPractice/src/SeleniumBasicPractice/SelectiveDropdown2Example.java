package SeleniumBasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectiveDropdown2Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		Thread.sleep(4000);
		driver.findElement(By.id("srchword")).sendKeys("na");
		Thread.sleep(5000);
		List <WebElement> options = driver.findElements(By.cssSelector("div[class='homesrchbox'] div"));
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("natural"))
				option.click();
		    break;   
	// Not Working;
		}
		}
}
