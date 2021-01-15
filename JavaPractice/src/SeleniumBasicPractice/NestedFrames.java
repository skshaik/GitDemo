package SeleniumBasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserSupport\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();

		
		  driver.findElement(By.xpath("//a[text()='Frames']")).click();
		  driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));

		String text=  driver.findElement(By.id("content")).getText();
		  System.out.println(text);
		
	}
}
