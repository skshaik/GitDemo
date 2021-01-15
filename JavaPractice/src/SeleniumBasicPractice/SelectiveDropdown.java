package SeleniumBasicPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
		Thread.sleep(5000);
		List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		{
		if(option.getText().equalsIgnoreCase("Austria"))
		{
			option.click();
			break;
			
		}
			
		driver.findElement(By.id("autosuggest")).clear();
		driver.findElement(By.id("autosuggest")).sendKeys("I");
		
		}
		
		
		
	}

}
