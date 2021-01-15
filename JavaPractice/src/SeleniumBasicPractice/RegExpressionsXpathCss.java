package SeleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegExpressionsXpathCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign i']")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("shaikshavali");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[contains(@Value,'Sign i')]")).click();	
		
		driver.findElement(By.xpath("//input[contains(@Value,'Sign in')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@Value),'Sing in')]")).click();
		driver.findElement(By.xpath("//input[contains(@Value,'Sign i')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@Value,'Sign i')]")).click();

		driver.findElement(By.xpath("//input[contains(@Value,'Sign in to w')]")).click();
	
	}
}
