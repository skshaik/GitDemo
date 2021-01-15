package SeleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\SeleniumBrowserSupport\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		/* WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);	
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(2);
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
				
				dropdown.selectByVisibleText("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				*/
		
WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));		
Select dropdown = new Select(staticDropdown);
System.out.println(driver.getCurrentUrl());
System.out.println(dropdown.getFirstSelectedOption().getText());


/* dropdown.selectByIndex(2);
dropdown.selectByIndex(2);
dropdown.selectByIndex(3);

dropdown.selectByValue("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());

dropdown.selectByVisibleText("USD");
System.out.println(dropdown.getFirstSelectedOption().getText());

System.out.println(dropdown.getFirstSelectedOption().getText());
*/

driver.findElement(By.id("divpaxinfo")).click();


// for(int i=0;i<5;i++)

driver.findElement(By.id("chrefIncChd")).click();
driver.findElement(By.id("hrefIncChd")).click();
driver.findElement(By.id("hrefIncChd")).click();

	}
}
