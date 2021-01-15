package SeleniumBasicPractice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\SeleniumBrowserSupport\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows =driver.getWindowHandles();
		
		Iterator<String>it = windows.iterator();
		String parentID = it.next();
	    String childID = it.next();
		driver.switchTo().window(childID);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
			
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailId);
		System.out.println("Successfully entered the email ID in the Parent Window email ID section");
		
		
	}

}
