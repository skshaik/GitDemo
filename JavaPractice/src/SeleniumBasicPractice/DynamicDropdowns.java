package SeleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("http://spicejet.com");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
		// driver.findElement(By.cssSelector("#dropdownGroup1 > div > ul:nth-child(1) > li.city_selected > a")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[4]/a")).click();
	   // driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[8]/a)")).click();
	   
		//*[@id="dropdownGroup1"]/div/ul[2]/li[4]/a
	
		// #dropdownGroup1 > div > ul:nth-child(1) > li.city_selected > a
		
		// #dropdownGroup1 > div > ul:nth-child(2) > li.city_selected > a
	}

}
