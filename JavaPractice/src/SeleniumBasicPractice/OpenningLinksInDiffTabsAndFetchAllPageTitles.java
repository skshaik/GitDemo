package SeleniumBasicPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogCombiner;

public abstract class OpenningLinksInDiffTabsAndFetchAllPageTitles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		System.out.println("Total links present in the page are  "+driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("Footer Section Link count is  "+footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Footer Secion First Column Link Count is  "+columndriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String ClickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTab);
			// System.out.println("Title of the page "+ columndriver.findElements(By.tagName("a")).size() +"is"+driver.getTitle());
			Thread.sleep(4000L); 
			
			 	Set<String> abc = driver.getWindowHandles();
			 	Iterator<String> it = abc.iterator();
			 	
			 	while(it.hasNext())
			 	{
			 		driver.switchTo().window(it.next());
			 		System.out.println(driver.getTitle());
			 		
			 	}
			
			
		}
			}
	// PARTIALLY WORKING
}
